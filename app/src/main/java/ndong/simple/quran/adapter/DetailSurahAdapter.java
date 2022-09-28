package ndong.simple.quran.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.databinding.ItemAyatBinding;
import ndong.simple.quran.model.DetailSurahModel;

public class DetailSurahAdapter extends RecyclerView.Adapter<DetailSurahAdapter.ViewHolder> {

    private ItemAyatBinding binding;
    private final DetailSurahResponse response;

    public DetailSurahAdapter(DetailSurahResponse response) {
        this.response = response;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding =ItemAyatBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        final DetailSurahModel model = new DetailSurahModel(
                position + 1,
                response.getData().getVerses().get(position).getText().getArab(),
                response.getData().getVerses().get(position).getText().getTransliteration().getEn(),
                response.getData().getVerses().get(position).getTranslation().getId()
        );
        binding.setDetail(model);
    }

    @Override
    public int getItemCount() {
        return response.getData().getVerses().size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(ItemAyatBinding binding) {
            super(binding.getRoot());
        }
    }
}
