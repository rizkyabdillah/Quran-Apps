package ndong.simple.quran.utils;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class ServiceGenerator<S> {

    private final Retrofit retrofit;

    @Inject
    public ServiceGenerator(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public S createService(Class<S> cls) {
        return retrofit.create(cls);
    }

    // USAGE => ApiServiceQuran apiServiceQuran = serviceGenerator.createService(ApiServiceQuran.class);
}
