package com.example.ducviet.mvvmpdemo.data.source.remote.api.service;

import com.example.ducviet.mvvmpdemo.utils.Constain;

/**
 * Created by ducviet on 14/09/2017.
 */

public class UserServiceClient extends ServiceClient {
    private static UserApi mUserApi;
    public static UserApi getInstance(){
        if(mUserApi == null){
            mUserApi = ServiceClient.createService(Constain.END_POINT,UserApi.class,null);
        }
        return mUserApi;
    }
}
