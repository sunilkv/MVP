package com.sunil.mvptut2.contract;

public interface MainActivityContract {

    //add the functionality of presentor
    public interface presenter{
        void loadMessage();

        void UpdateUserFullName(String firstName);
        void UpdateUserEmail(String email);
    }

    //add the functionality of view
    public  interface View{
        void updateUserInfoTextView(String info);
    }
}

