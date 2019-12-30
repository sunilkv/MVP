package com.sunil.mvptut1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.sunil.mvptut1.R;
import com.sunil.mvptut1.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity  implements MainActivityPresenter.View {

    TextView user_details_tv;
    EditText fullname,email;

    //Presenter variable
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        //view init
        presenter=new MainActivityPresenter(this);

        user_details_tv=(TextView)findViewById(R.id.user_details_tv);
        email=(EditText) findViewById(R.id.email);
        fullname=(EditText) findViewById(R.id.fullname);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            presenter.UpdateUserEmail(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        fullname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                presenter.UpdateUserFullName(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }

    @Override
    public void updateUserInfoTextView(String info) {
        user_details_tv.setText(info);
    }
}
