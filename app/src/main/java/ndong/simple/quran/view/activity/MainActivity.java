package ndong.simple.quran.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.tabs.TabLayoutMediator;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.hilt.android.AndroidEntryPoint;
import ndong.simple.quran.adapter.PagerAdapter;
import ndong.simple.quran.databinding.ActivityMainBinding;
import ndong.simple.quran.view.base.BaseActivity;

@AndroidEntryPoint
public class MainActivity extends BaseActivity{

    private ActivityMainBinding binding;
    public PagerAdapter adapter;
    private long pressedTime = 0;
    private final short twoSecondTime = 2000;

    @Inject
    public String[] arrayJudul;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        adapter = new PagerAdapter(getSupportFragmentManager(), getLifecycle(), arrayJudul);
        binding.viewPager.setAdapter(adapter);

        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position) -> tab.setText(arrayJudul[position])).attach();
    }

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @Override
    public void onBackPressed() {
        if(pressedTime + twoSecondTime > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            showToastShort("Klik kembali lagi untuk keluar");
        }
        pressedTime = System.currentTimeMillis();
    }
}