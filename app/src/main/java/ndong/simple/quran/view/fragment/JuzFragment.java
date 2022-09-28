package ndong.simple.quran.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ndong.simple.quran.adapter.ListJuzAdapter;
import ndong.simple.quran.databinding.FragmentJuzBinding;
import ndong.simple.quran.view.base.BaseFragment;

public class JuzFragment extends BaseFragment {

    private FragmentJuzBinding binding;
    private ListJuzAdapter adapter;
    private final String[] listKeterangan = {
            "Al Fatihah (1) - Al Baqarah (141)",
            "Al Baqarah (142) - Al Baqarah (252)",
            "Al Baqarah (253) - Ali 'Imran (92)",
            "Ali 'Imran (93) - An Nisa' (23)",
            "An Nisa' (24) - An Nisa' (147)",
            "An Nisa' (148) - Al Ma'idah (81)",
            "Al Ma'idah (82) - Al An'am (110)",
            "Al An'am (111) - Al A'raf (87)",
            "Al A'raf (88) - Al Anfal (40)",
            "Al anfal (41) - At Taubah (92)",
            "At Taubah (93) - Hud (5)",
            "Hud (6) - Yusuf (52)",
            "Yusuf (53) - Ibrahim (52)",
            "Al-Hijr (1) - An-Nahl (128)",
            "Al-Isra' (1) - Al-Kahf (74)",
            "Al-Kahf (75) - Taha (135)",
            "Al-Anbiya' (1) - Al-Hajj (78)",
            "Al-Mu'minun (1) - Al-Furqan (20)",
            "Al-Furqan (21) - An-Naml (55)",
            "An-Naml (56) - Al-'Ankabut (45)",
            "Al-'Ankabut (46) - Al-Ahzab (30)",
            "Al-Ahzab (31) - Yasin (27)",
            "Yasin (28) - Az-Zumar (31)",
            "Az-Zumar (32) - Fussilat (46)",
            "Fussilat (47) - Al-Jasiyah (37)",
            "Al-Ahqaf (1) - Az-Zariyat (30)",
            "Az-Zariyat (31) - Al-Hadid (29)",
            "Al-Mujadalah (1) - At-Tahrim (12)",
            "Al-Mulk (1) - Al-Mursalat (50)",
            "An-Naba' (1) - An-Nas (6)",
    };

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @Override
    protected void onCreateViewBinding(LayoutInflater inflater, ViewGroup container) {
        super.onCreateViewBinding(inflater, container);
        binding = FragmentJuzBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        binding.recyclerView.setHasFixedSize(true);

        adapter = new ListJuzAdapter(listKeterangan);
        binding.recyclerView.setAdapter(adapter);

    }

}