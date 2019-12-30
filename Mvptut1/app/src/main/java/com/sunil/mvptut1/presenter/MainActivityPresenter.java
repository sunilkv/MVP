package com.sunil.mvptut1.presenter;

import android.view.View;

import com.sunil.mvptut1.model.Users;

public class MainActivityPresenter {
    //declare a view and model
    Users users;
    View view;

    public MainActivityPresenter(View view) {
        this.view = view;
        this.users=new Users();
    }


    //methods of the Presentors
    public  void UpdateUserFullName(String fullname){
        users.setFullName(fullname);
        // update the view .. sending info to view
        view.updateUserInfoTextView(users.toString());
    }
    public  void UpdateUserEmail(String email){
        users.setEmail(email);
        // update the view .. sending info to view
        view.updateUserInfoTextView(users.toString());

    }


    // interface to work with view
    public  interface View{
        void updateUserInfoTextView(String info);

    }

}
