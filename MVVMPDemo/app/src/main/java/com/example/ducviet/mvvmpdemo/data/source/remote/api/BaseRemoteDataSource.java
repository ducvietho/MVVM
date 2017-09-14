package com.example.ducviet.mvvmpdemo.data.source.remote.api;

import com.example.ducviet.mvvmpdemo.data.source.remote.api.service.UserApi;

/**
 * Created by ducviet on 14/09/2017.
 */

public abstract class BaseRemoteDataSource {
    UserApi mUserApi;

    public BaseRemoteDataSource(UserApi userApi) {
        mUserApi = userApi;
    }
}
