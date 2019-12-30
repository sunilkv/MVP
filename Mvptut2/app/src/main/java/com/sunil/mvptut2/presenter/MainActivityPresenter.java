package com.sunil.mvptut2.presenter;

import android.view.View;

import com.sunil.mvptut2.contract.MainActivityContract;
import com.sunil.mvptut2.model.Users;

public class MainActivityPresenter implements MainActivityContract.presenter {

    Users users;
    View view;

    public MainActivityPresenter(View view) {
        this.view = view;
        this.users= new Users();
    }

    @Override
    public void loadMessage() {

    }

    @Override
    public void UpdateUserFullName(String firstName) {
    this.users.setFullName(firstName);
    }

    @Override
    public void UpdateUserEmail(String email) {
        this.users.setFullName(email);

    }
}
