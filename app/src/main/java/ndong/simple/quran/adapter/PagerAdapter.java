package ndong.simple.quran.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import ndong.simple.quran.view.fragment.JuzFragment;
import ndong.simple.quran.view.fragment.KiblahFragment;
import ndong.simple.quran.view.fragment.SurahFragment;

public class PagerAdapter extends FragmentStateAdapter {

    private final String[] arrayJudul;

    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,@NonNull String[] arrayJudul) {
        super(fragmentManager, lifecycle);
        this.arrayJudul = arrayJudul;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment activeFragment = new SurahFragment();
        switch (position) {
            case 1 :
                activeFragment = new JuzFragment();
                break;
            case 2 :
                activeFragment = new KiblahFragment();
                break;
        }
        return activeFragment;
    }

    @Override
    public int getItemCount() {
        return arrayJudul.length;
    }
}
