package ndong.simple.quran.view.fragment;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

import ndong.simple.quran.R;
import ndong.simple.quran.databinding.FragmentKiblahBinding;
import ndong.simple.quran.helper.Print;
import ndong.simple.quran.view.base.BaseFragment;

public class KiblahFragment extends BaseFragment implements SensorEventListener {

    private FragmentKiblahBinding binding;
    private float currentDegree = 0.0f;
    private SensorManager sensorManager;

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @Override
    protected void onCreateViewBinding(LayoutInflater inflater, ViewGroup container) {
        super.onCreateViewBinding(inflater, container);
        binding = FragmentKiblahBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sensorManager = (SensorManager) requireActivity().getSystemService(Context.SENSOR_SERVICE);
    }

    @Override
    public void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION), SensorManager.SENSOR_DELAY_GAME);
    }

    @Override
    public void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float degree = Math.round(sensorEvent.values[0]);
        RotateAnimation rotateAnimation = new RotateAnimation(
                currentDegree, -degree, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,0.5f
        );
        rotateAnimation.setDuration(100);
        rotateAnimation.setFillAfter(true);
        binding.imageCompass.setAnimation(rotateAnimation);
        currentDegree = -degree;
        Print.log(degree);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}