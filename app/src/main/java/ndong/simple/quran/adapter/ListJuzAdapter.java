package ndong.simple.quran.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ndong.simple.quran.databinding.ItemJuzBinding;
import ndong.simple.quran.model.ListJuzModel;
import ndong.simple.quran.view.activity.DetailJuzActivity;

public class ListJuzAdapter extends RecyclerView.Adapter<ListJuzAdapter.ViewHolder> {

    private ItemJuzBinding binding;
    private final String[] keteranganJuz;

    public ListJuzAdapter(String[] keteranganJuz) {
        this.keteranganJuz = keteranganJuz;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding =ItemJuzBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        binding.setListJuz(new ListJuzModel(
                "Juz " +(position +1), keteranganJuz[position]
        ));
        binding.getRoot().setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), DetailJuzActivity.class);
            intent.putExtra("URUTAN", position + 1);
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return keteranganJuz.length;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(ItemJuzBinding binding) {
            super(binding.getRoot());
        }
    }
}
