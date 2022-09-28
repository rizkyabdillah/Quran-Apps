package ndong.simple.quran.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagger.hilt.android.scopes.FragmentScoped;
import ndong.simple.quran.adapter.ListSurahAdapter;
import ndong.simple.quran.data.network.response.ListSurahResponse;
import ndong.simple.quran.databinding.FragmentSurahBinding;
import ndong.simple.quran.helper.Print;
import ndong.simple.quran.utils.Resource;
import ndong.simple.quran.view.base.BaseFragment;
import ndong.simple.quran.viewmodel.QuranViewModel;

@FragmentScoped
public class SurahFragment extends BaseFragment {

    private FragmentSurahBinding binding;
    private ListSurahAdapter adapter;
    private QuranViewModel viewModel;

    @Override
    protected View getContentView() {
        return binding.getRoot();
    }

    @Override
    protected void onCreateViewBinding(LayoutInflater inflater, ViewGroup container) {
        super.onCreateViewBinding(inflater, container);
        binding = FragmentSurahBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.viewModel = new ViewModelProvider(requireActivity()).get(QuranViewModel.class);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        binding.recyclerView.setHasFixedSize(true);

        this.viewModel.getListSurah().observe(requireActivity(), this::observer);

        binding.refreshLayout.setOnRefreshListener(() -> {
            this.viewModel.getListSurahReload().observe(requireActivity(), this::observer);
        });

    }


    //======================
    //=> START OBSERVER
    //======================
    private void observer(Resource<ListSurahResponse> response) {
        switch (response.getStatus()) {
            case LOADING:
                binding.shimmer.startShimmer();
                binding.recyclerView.setVisibility(View.GONE);
                binding.shimmer.setVisibility(View.VISIBLE);
                break;
            case SUCCESS:
                adapter = new ListSurahAdapter(response.getData());
                binding.recyclerView.setAdapter(adapter);
                binding.recyclerView.setVisibility(View.VISIBLE);
                binding.shimmer.setVisibility(View.GONE);
                if (binding.shimmer.isShimmerStarted()) {
                    binding.shimmer.stopShimmer();
                }
                if(binding.refreshLayout.isRefreshing()) {
                    binding.refreshLayout.setRefreshing(false);
                }
                viewModel.setTempListSurah(response);
                break;
            case ERROR:
                showToast(response.getMessage());
                break;
        }
        Print.log(response.getStatus());
    }

}