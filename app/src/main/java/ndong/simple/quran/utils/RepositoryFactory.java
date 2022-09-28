package ndong.simple.quran.utils;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import ndong.simple.quran.helper.Throw;
import ndong.simple.quran.utils.Resource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryFactory<T> {
    private final MutableLiveData<Resource<T>> data = new MutableLiveData<>();

    public RepositoryFactory(Call<T> calling) {
        data.postValue(Resource.loading(null));
        calling.enqueue(new Callback<T>() {
            @Override
            public void onResponse(@NonNull Call<T> call, @NonNull Response<T> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    data.postValue(Resource.success(response.body()));
                }
            }

            @Override
            public void onFailure(@NonNull Call<T> call, @NonNull Throwable t) {
                data.postValue(Resource.error(Throw.getErrorResponse(t), null));
            }
        });
    }

    public LiveData<Resource<T>> getData() {
        return data;
    }
}
