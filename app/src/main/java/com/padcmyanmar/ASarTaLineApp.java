package com.padcmyanmar;

import android.app.Application;

import com.padcmyanmar.data.model.WarTeeModel;

public class ASarTaLineApp extends Application {

    public static final String LOG_TAG="ASarTaLineApp";

    @Override
    public void onCreate() {
        super.onCreate();

        WarTeeModel.initModel(getApplicationContext());
    }
}
