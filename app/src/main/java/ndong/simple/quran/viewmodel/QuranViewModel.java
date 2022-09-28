package ndong.simple.quran.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;
import dagger.hilt.android.lifecycle.HiltViewModel;
import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.data.network.response.ListSurahResponse;
import ndong.simple.quran.repository.QuranRepository;
import ndong.simple.quran.utils.Resource;

@HiltViewModel
public class QuranViewModel extends ViewModel {

    //======================
    //=> START INIT REPOSITORY FROM INJECT
    //======================

    private final QuranRepository repository;

    @Inject
    public QuranViewModel(QuranRepository repository) {
        this.repository = repository;
    }

    //======================


    private MutableLiveData<Resource<ListSurahResponse>> tempListSurah;
    public LiveData<Resource<ListSurahResponse>> getListSurah() {
        if(tempListSurah == null) {
            tempListSurah = new MutableLiveData<>();
            return getListSurahReload();
        }
        return tempListSurah;
    }

    public LiveData<Resource<ListSurahResponse>> getListSurahReload() {
            return repository.getListSurah();
    }

    public void setTempListSurah(Resource<ListSurahResponse> responseResource) {
        if(tempListSurah.getValue() == null) {
            tempListSurah.setValue(responseResource);
        }
    }


    //======================

    private MutableLiveData<Resource<DetailSurahResponse>> tempDetailSurah;
    public LiveData<Resource<DetailSurahResponse>> getDetailSurah(int urutanSurah) {
        if(tempDetailSurah == null) {
            tempDetailSurah = new MutableLiveData<>();
            return getDetailSurahReload(urutanSurah);
        }
        return tempDetailSurah;
    }

    public LiveData<Resource<DetailSurahResponse>> getDetailSurahReload(int urutanSurah) {
            return repository.getDetailSurah(urutanSurah);
    }

    public void setTempDetailSurah(Resource<DetailSurahResponse> responseResource) {
        if(tempDetailSurah.getValue() == null) {
            tempDetailSurah.setValue(responseResource);
        }
    }



}
