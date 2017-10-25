package com.example.ducviet.mvvmpdemo.screen.main;

import com.example.ducviet.mvvmpdemo.data.model.User;
import com.example.ducviet.mvvmpdemo.data.source.remote.UserRepository;
import com.example.ducviet.mvvmpdemo.screen.main.MainContract.PresenterMain;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public class MainPresenter implements PresenterMain {
    private MainContract.ViewModel mViewModel;
    private UserRepository mUserRepository;
    private CompositeDisposable mDisposable;

    public MainPresenter(MainContract.ViewModel viewModel, UserRepository userRepository) {
        mViewModel = viewModel;
        mUserRepository = userRepository;
        mDisposable = new CompositeDisposable();
    }

    @Override
    public void getUsers() {
        mDisposable.add(mUserRepository.getUsers().subscribeOn(Schedulers.newThread()).observeOn(
                AndroidSchedulers.mainThread()).subscribeWith(
                new DisposableObserver<ArrayList<User>>() {
                    @Override
                    public void onNext(ArrayList<User> value) {
                        mViewModel.onSuccess(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        mViewModel.onError();
                    }

                    @Override
                    public void onComplete() {

                    }
                })) ;
    }
}
