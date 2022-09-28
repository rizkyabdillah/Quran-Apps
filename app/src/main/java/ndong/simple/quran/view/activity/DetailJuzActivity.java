package ndong.simple.quran.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import ndong.simple.quran.adapter.DetailJuzAdapter;
import ndong.simple.quran.adapter.ListSurahAdapter;
import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.data.network.response.ListSurahResponse;
import ndong.simple.quran.databinding.ActivityDetailJuzBinding;
import ndong.simple.quran.helper.Print;
import ndong.simple.quran.model.ListSurahInJuz;
import ndong.simple.quran.utils.Resource;
import ndong.simple.quran.view.base.BaseActivity;
import ndong.simple.quran.viewmodel.QuranViewModel;

@AndroidEntryPoint
public class DetailJuzActivity extends BaseActivity {

    @Inject
    public List<ListSurahInJuz[]> listSurahInJuz;
    private ActivityDetailJuzBinding binding;
    private QuranViewModel viewModel;
    private int index =0;
    private ListSurahInJuz[] arraySurahInJuz;
    private final List<DetailSurahResponse> detailSurahResponses = new ArrayList<>();

    private final LifecycleOwner OWNER = this;

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        binding = ActivityDetailJuzBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(QuranViewModel.class);
        final int URUTAN = intent.getIntExtra("URUTAN", 0);

        arraySurahInJuz = listSurahInJuz.get(URUTAN - 1);

        binding.textJudulAtas.setText("JUZ " + URUTAN);
        binding.buttonBack.setOnClickListener(v -> finish());

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setHasFixedSize(true);

        viewModel.getDetailSurah(arraySurahInJuz[index].getUrutanSurah()).observe(OWNER, this::observe);

    }

    private void observe(Resource<DetailSurahResponse> response) {
        switch (response.getStatus()) {
            case LOADING:
                if(index < 1) {
                    binding.shimmer.startShimmer();
                    binding.recyclerView.setVisibility(View.GONE);
                    binding.shimmer.setVisibility(View.VISIBLE);
                }
                break;
            case SUCCESS:
                detailSurahResponses.add(response.getData());
                if(index == arraySurahInJuz.length - 1) {
                    binding.recyclerView.setVisibility(View.VISIBLE);
                    binding.shimmer.setVisibility(View.GONE);
                    if (binding.shimmer.isShimmerStarted()) {
                        binding.shimmer.stopShimmer();
                    }
                    if(binding.refreshLayout.isRefreshing()) {
                        binding.refreshLayout.setRefreshing(false);
                    }

                    DetailJuzAdapter adapter = new DetailJuzAdapter(detailSurahResponses, arraySurahInJuz);
                    binding.recyclerView.setAdapter(adapter);
                }

                index++;
                if(index < arraySurahInJuz.length) {
                    new Handler().postDelayed(() -> {
                        viewModel.getDetailSurahReload(arraySurahInJuz[index].getUrutanSurah()).observe(OWNER, this::observe);
                    }, 1000);
                }

                Print.log(index);
                Print.log(arraySurahInJuz.length);
                break;
            case ERROR:
                showToast(response.getMessage());
                break;
        }
        Print.log(response.getStatus());
    }

}