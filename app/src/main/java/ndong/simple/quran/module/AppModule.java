package ndong.simple.quran.module;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import ndong.simple.quran.data.network.interfaces.ApiServiceQuran;
import ndong.simple.quran.model.ListSurahInJuz;
import ndong.simple.quran.repository.QuranRepository;
import ndong.simple.quran.utils.ListJuz;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public String[] provideArrayJudul() {
        return new String[]{"Surah", "Juz", "Kiblah"};
    }

    @Provides
    @Singleton
    public Context provideContext(@ApplicationContext Context context) {
        return context;
    }

    @Provides
    @Singleton
    public List<ListSurahInJuz[]> provideListSurahInJuz() {
        return new ListJuz().getList();
    }


}
