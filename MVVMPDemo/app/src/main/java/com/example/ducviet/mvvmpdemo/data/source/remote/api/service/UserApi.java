package com.example.ducviet.mvvmpdemo.data.source.remote.api.service;

import com.example.ducviet.mvvmpdemo.data.model.User;
import io.reactivex.Observable;
import java.util.ArrayList;
import retrofit2.http.GET;

/**
 * Created by ducviet on 14/09/2017.
 */

public interface UserApi {
    @GET("/users/follower/followers")
    Observable<ArrayList<User>> getUsers();
}

