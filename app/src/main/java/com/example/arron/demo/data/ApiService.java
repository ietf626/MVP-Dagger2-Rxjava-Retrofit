package com.example.arron.demo.data;

import com.example.arron.demo.config.Constants;
import com.example.arron.demo.domain.User;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Arron on 16/7/26.
 */
public interface ApiService {
    @GET(Constants.API_URL_GET_USER_LIST)
    Observable<List<User>> getUserList();

    @GET(Constants.API_URL_GET_USER_DETAILS + "{id}.json")
    Observable<User> getUser(@Path("id") String userId);
}
