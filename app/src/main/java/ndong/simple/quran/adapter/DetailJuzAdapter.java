package ndong.simple.quran.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.databinding.ItemAyatBinding;
import ndong.simple.quran.databinding.ItemPerSurahBinding;
import ndong.simple.quran.model.DetailSurahModel;
import ndong.simple.quran.model.ListSurahInJuz;

public class DetailJuzAdapter extends RecyclerView.Adapter<DetailJuzAdapter.ViewHolder> {

    private ItemPerSurahBinding binding;
    private final List<DetailSurahResponse> response;
    private final ListSurahInJuz[] arraySurah;

    public DetailJuzAdapter(List<DetailSurahResponse> response, ListSurahInJuz[] arraySurah) {
        this.response = response;
        this.arraySurah = arraySurah;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding =ItemPerSurahBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        binding.setJudul(response.get(position).getData().getName().getTransliteration().getId());
        binding.setArti(response.get(position).getData().getName().getTranslation().getId());

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setAdapter(new DetailSurahInJuzAdapter(response.get(position), arraySurah[position]));
    }

    @Override
    public int getItemCount() {
        return response.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(ItemPerSurahBinding binding) {
            super(binding.getRoot());
        }
    }
}
