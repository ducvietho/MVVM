package com.example.ducviet.mvvmpdemo.screen.main;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.Toast;
import com.android.databinding.library.baseAdapters.BR;
import com.example.ducviet.mvvmpdemo.data.model.User;
import com.example.ducviet.mvvmpdemo.data.source.remote.UserRepository;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public class MainViewModel extends BaseObservable implements MainContract.ViewModel{
    private RecyclerAdapterUser mAdapterUser;
    private Context mContext;
    private UserRepository mUserRepository;
    private MainPresenter mMainPresenter;

    public MainViewModel(Context context,UserRepository userRepository) {
        mUserRepository = userRepository;
        mContext = context;
    }
    public void setMainPresenter(MainPresenter mainPresenter){
        mMainPresenter = mainPresenter;
        mainPresenter.getUsers();

    }
    @Bindable
    public RecyclerAdapterUser getAdapterUser() {
        return mAdapterUser;
    }

    public void setAdapterUser(RecyclerAdapterUser adapterUser) {
        mAdapterUser = adapterUser;
        notifyPropertyChanged(BR.adapterUser);
    }

    @Override
    public void onSuccess(ArrayList<User> users) {
        mAdapterUser = new RecyclerAdapterUser(mContext,users);

    }

    @Override
    public void onError() {
        Toast.makeText(mContext,"access Error",Toast.LENGTH_LONG);
    }
}
