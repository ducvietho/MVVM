package com.example.ducviet.mvvmpdemo.data.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.example.ducviet.mvvmpdemo.BR;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ducviet on 14/09/2017.
 */

public class User extends BaseObservable {
    @SerializedName("login")
    private String mLogin;
    @SerializedName("avatar_url")
    private String mUrl;

    public User(String login, String url) {
        mLogin = login;
        mUrl = url;
    }
    @Bindable
    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
        notifyPropertyChanged(BR.login);
    }
    @Bindable
    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
        notifyPropertyChanged(BR.url);
    }
}
