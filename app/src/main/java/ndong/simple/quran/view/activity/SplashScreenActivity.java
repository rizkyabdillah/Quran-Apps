package ndong.simple.quran.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ndong.simple.quran.databinding.ActivitySplashScreenBinding;
import ndong.simple.quran.view.base.BaseActivity;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends BaseActivity {

    private ActivitySplashScreenBinding binding;

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());

        binding.buttonGetStarted.setOnClickListener(v -> {
                startsActivity(MainActivity.class);
                finish();
        });

    }
}