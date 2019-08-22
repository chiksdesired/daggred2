package com.example.myapplication;

import dagger.Module;
import dagger.Provides;

@Module
public class RefrigeratorModule {


    public RefrigeratorModule() {
    }

    @Provides
    String provideEggs() {
        return "this is demo of Daggred 2 for eggs";
    }





}
