package ndong.simple.quran.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import dagger.hilt.android.AndroidEntryPoint;
import ndong.simple.quran.adapter.DetailSurahAdapter;
import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.databinding.ActivityDetailSurahBinding;
import ndong.simple.quran.helper.Print;
import ndong.simple.quran.utils.Resource;
import ndong.simple.quran.view.base.BaseActivity;
import ndong.simple.quran.viewmodel.QuranViewModel;

@AndroidEntryPoint
public class DetailSurahActivity extends BaseActivity {

    private ActivityDetailSurahBinding binding;
    private QuranViewModel viewModel;
    private LifecycleOwner getOwner() {
        return this;
    }

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        binding = ActivityDetailSurahBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(QuranViewModel.class);

        final int URUTAN = intent.getIntExtra("URUTAN", 1);
        viewModel.getDetailSurah(URUTAN).observe(getOwner(), this::observer);

        binding.recyclerVIew.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerVIew.setHasFixedSize(true);

        binding.buttonBack.setOnClickListener(v -> finish());
        binding.swipeRefreshLayout.setOnRefreshListener(() -> viewModel.getDetailSurahReload(URUTAN).observe(getOwner(), this::observer));

    }

    private void observer(@NonNull Resource<DetailSurahResponse> response) {
        switch (response.getStatus()) {
            case LOADING:
                binding.shimmer.startShimmer();
                binding.shimmer.setVisibility(View.VISIBLE);
                binding.constrainLayoutBar.setVisibility(View.GONE);
                binding.nestedScrollView.setVisibility(View.GONE);
                break;
            case SUCCESS:
                binding.setJudul(response.getData().getData().getName().getTransliteration().getId());
                binding.setArti(response.getData().getData().getName().getTranslation().getId());
                binding.setRelevasi(getIntent().getStringExtra("RELEVASI"));

                DetailSurahAdapter adapter = new DetailSurahAdapter(response.getData());
                binding.recyclerVIew.setAdapter(adapter);

                binding.shimmer.setVisibility(View.GONE);
                binding.constrainLayoutBar.setVisibility(View.VISIBLE);
                binding.nestedScrollView.setVisibility(View.VISIBLE);

                if(binding.shimmer.isShimmerStarted()) {
                    binding.shimmer.stopShimmer();
                }

                if(binding.swipeRefreshLayout.isRefreshing()) {
                    binding.swipeRefreshLayout.setRefreshing(false);
                }

                viewModel.setTempDetailSurah(response);
                break;
            case ERROR:
                showToast(response.getMessage());
                break;
        }
        Print.log(response.getStatus());
    }

}