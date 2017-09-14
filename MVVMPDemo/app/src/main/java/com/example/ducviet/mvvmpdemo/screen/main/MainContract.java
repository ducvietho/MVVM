package com.example.ducviet.mvvmpdemo.screen.main;

import com.example.ducviet.mvvmpdemo.data.model.User;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public class MainContract {
    interface PresenterMain{
        void getUsers();
    }
    interface ViewModel{
        void onSuccess(ArrayList<User> users);
        void onError();
    }
}
