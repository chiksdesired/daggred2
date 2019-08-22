package com.example.myapplication;

import android.app.Application;

public class EggApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().refrigeratorModule(new RefrigeratorModule()).build();


    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
