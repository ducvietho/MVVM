package com.example.ducviet.mvvmpdemo.data.source.remote;

import com.example.ducviet.mvvmpdemo.data.model.User;
import io.reactivex.Observable;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public interface UserDataSource {
    Observable<ArrayList<User>> getUsers();
}
