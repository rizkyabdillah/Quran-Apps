package ndong.simple.quran.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ndong.simple.quran.data.network.response.ListSurahResponse;
import ndong.simple.quran.databinding.ItemSurahBinding;
import ndong.simple.quran.model.ListSurahModel;
import ndong.simple.quran.view.activity.DetailSurahActivity;

public class ListSurahAdapter extends RecyclerView.Adapter<ListSurahAdapter.ViewHolder> {

    private ItemSurahBinding binding;
    private final ListSurahResponse response;

    public ListSurahAdapter(ListSurahResponse response) {
        this.response = response;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding =ItemSurahBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        final ListSurahModel model = new ListSurahModel(
                String.valueOf(response.getData().get(position).getNumber()),
                response.getData().get(position).getName().getTransliteration().getId(),
                response.getData().get(position).getRevelation().getId() + " - " + response.getData().get(position).getNumberOfVerses() + " ayat",
                response.getData().get(position).getName().getShorts()
        );
        binding.setListSurah(model);
        binding.getRoot().setOnClickListener(v -> {
            final Intent intent = new Intent(v.getContext(), DetailSurahActivity.class);
            intent.putExtra("URUTAN", position +1);
            intent.putExtra("RELEVASI", response.getData().get(position).getRevelation().getId() + " - " + response.getData().get(position).getNumberOfVerses() + " ayat");
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return response.getData().size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(ItemSurahBinding binding) {
            super(binding.getRoot());
        }
    }
}
