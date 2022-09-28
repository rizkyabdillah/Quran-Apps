package ndong.simple.quran.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.databinding.ItemAyatBinding;
import ndong.simple.quran.model.DetailSurahModel;
import ndong.simple.quran.model.ListSurahInJuz;

public class DetailSurahInJuzAdapter extends RecyclerView.Adapter<DetailSurahInJuzAdapter.ViewHolder> {

    private ItemAyatBinding binding;
    private final DetailSurahResponse response;
    private final ListSurahInJuz surahInJuz;

    public DetailSurahInJuzAdapter(DetailSurahResponse response, ListSurahInJuz surahInJuz) {
        this.response = response;
        this.surahInJuz = surahInJuz;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding =ItemAyatBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        int posisi = position;
        int urutan = position + 1;
        if(surahInJuz.getNomorStart() > 0) {
            posisi = (surahInJuz.getNomorStart() - 1) + position;
            urutan = surahInJuz.getNomorStart() + position;
        }

        final DetailSurahModel model = new DetailSurahModel(
                urutan,
                response.getData().getVerses().get(posisi).getText().getArab(),
                response.getData().getVerses().get(posisi).getText().getTransliteration().getEn(),
                response.getData().getVerses().get(posisi).getTranslation().getId()
        );
        binding.setDetail(model);
    }

    @Override
    public int getItemCount() {
        int versesLength = response.getData().getVerses().size();

        if(surahInJuz.getNomorStart() < 1 && surahInJuz.getNomorStop() < 1) {
            return versesLength;
        } else if(surahInJuz.getNomorStart() > 0 && surahInJuz.getNomorStop() > 0) {
            return surahInJuz.getNomorStop() - surahInJuz.getNomorStart();
        } else if(surahInJuz.getNomorStart() > 0) {
            return versesLength - surahInJuz.getNomorStart();
        } else {
            return surahInJuz.getNomorStop();
        }

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
