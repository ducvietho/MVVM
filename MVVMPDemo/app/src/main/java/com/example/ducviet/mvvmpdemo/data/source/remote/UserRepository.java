package com.example.ducviet.mvvmpdemo.data.source.remote;

import com.example.ducviet.mvvmpdemo.data.model.User;
import com.example.ducviet.mvvmpdemo.data.source.remote.api.UserRemoteDataSource;
import io.reactivex.Observable;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public class UserRepository implements UserDataSource {
    private UserRemoteDataSource mDataSource;

    public UserRepository(UserRemoteDataSource dataSource) {
        mDataSource = dataSource;
    }

    @Override
    public Observable<ArrayList<User>> getUsers() {
        return mDataSource.getUsers();
    }
}
