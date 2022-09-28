package ndong.simple.quran.repository;

import androidx.lifecycle.LiveData;

import java.io.IOException;

import javax.inject.Inject;

import ndong.simple.quran.data.network.interfaces.ApiServiceQuran;
import ndong.simple.quran.data.network.response.DetailJuzResponse;
import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.data.network.response.ListSurahResponse;
import ndong.simple.quran.utils.RepositoryFactory;
import ndong.simple.quran.utils.Resource;

public class QuranRepository {

    private final ApiServiceQuran apiServiceQuran;

    @Inject
    public QuranRepository(ApiServiceQuran apiServiceQuran) {
        this.apiServiceQuran = apiServiceQuran;
    }

    public LiveData<Resource<ListSurahResponse>> getListSurah() {
        return new RepositoryFactory<>(this.apiServiceQuran.getListSurah()).getData();
    }

    public LiveData<Resource<DetailSurahResponse>> getDetailSurah(int urutanSurah) {
        return new RepositoryFactory<>(this.apiServiceQuran.getDetailSurah(urutanSurah)).getData();
    }

    public LiveData<Resource<DetailJuzResponse>> getDetailJuz(int urutanJuz) {
        return new RepositoryFactory<>(this.apiServiceQuran.getDetailJuz(urutanJuz)).getData();
    }

}
