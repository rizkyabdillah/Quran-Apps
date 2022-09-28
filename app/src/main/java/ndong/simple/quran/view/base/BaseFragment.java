package ndong.simple.quran.view.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    protected abstract View getContentView();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        onCreateViewBinding(inflater, container);
        return getContentView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewReady(view, savedInstanceState);
    }

    @CallSuper
    protected void onCreateViewBinding(LayoutInflater inflater, ViewGroup container) {

    }
    @CallSuper
    protected void onViewReady(View view, Bundle bundle) {

    }

    protected void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }

    protected void startsActivity(Class<?> cls) {
        startActivity(new Intent(getContext(), cls));
    }
}
