package example.loginapidemo.services;

import example.loginapidemo.models.Message;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by nam on 01/04/2017.
 */

public interface ApiService {
    @POST("INPUT HERE")
    Call<Message> login(@Body RequestBody jsonString);
}
