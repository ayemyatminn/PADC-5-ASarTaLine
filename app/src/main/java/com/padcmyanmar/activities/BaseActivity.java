package com.padcmyanmar.activities;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.arch.lifecycle.Observer;

public abstract class BaseActivity extends AppCompatActivity implements Observer<String>{

    @Override
    public void onChanged(@Nullable String errorMsg) {
        displayErrorMsg(errorMsg);
    }

    protected void displayErrorMsg(String errorMsg) {

    }

}
