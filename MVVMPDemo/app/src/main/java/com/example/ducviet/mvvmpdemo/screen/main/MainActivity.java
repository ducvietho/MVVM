package com.example.ducviet.mvvmpdemo.screen.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.ducviet.mvvmpdemo.R;
import com.example.ducviet.mvvmpdemo.data.source.remote.UserRepository;
import com.example.ducviet.mvvmpdemo.data.source.remote.api.UserRemoteDataSource;
import com.example.ducviet.mvvmpdemo.data.source.remote.api.service.UserServiceClient;
import com.example.ducviet.mvvmpdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserRepository repository = new UserRepository(new UserRemoteDataSource(UserServiceClient.getInstance()));
        MainViewModel mainViewModel = new MainViewModel(MainActivity.this,repository);
        MainPresenter mainPresenter = new MainPresenter(mainViewModel,repository);
        mainViewModel.setMainPresenter(mainPresenter);
        mBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        mBinding.setMainviewmodel(mainViewModel);

    }
}
