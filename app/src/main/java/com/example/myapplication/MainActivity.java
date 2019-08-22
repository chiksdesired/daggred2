package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    String provide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((EggApplication) getApplication())
                .getAppComponent()
                .inject(this);


        TextView eggsView = findViewById(R.id.eggs);
        eggsView.setText(provide);


    }
}
