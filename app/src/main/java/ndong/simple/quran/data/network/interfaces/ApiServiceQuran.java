package ndong.simple.quran.data.network.interfaces;

import ndong.simple.quran.data.network.response.DetailJuzResponse;
import ndong.simple.quran.data.network.response.DetailSurahResponse;
import ndong.simple.quran.data.network.response.ListSurahResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiServiceQuran {

    @GET("surah")
    Call<ListSurahResponse> getListSurah();

    @GET("surah/{urutan}")
    Call<DetailSurahResponse> getDetailSurah(@Path("urutan") int urutanSurah);

    @GET("juz/{urutan}")
    Call<DetailJuzResponse> getDetailJuz(@Path("urutan") int urutanJuz);

}
