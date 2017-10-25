package com.example.ducviet.mvvmpdemo.data.source.remote.api;

import com.example.ducviet.mvvmpdemo.data.model.User;
import com.example.ducviet.mvvmpdemo.data.source.remote.UserDataSource;
import com.example.ducviet.mvvmpdemo.data.source.remote.api.service.UserApi;
import io.reactivex.Observable;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public class UserRemoteDataSource extends BaseRemoteDataSource implements UserDataSource {
    public UserRemoteDataSource(UserApi userApi) {
        super(userApi);
    }

    @Override
    public Observable<ArrayList<User>> getUsers() {
        return mUserApi.getUsers() ;
    }
}
