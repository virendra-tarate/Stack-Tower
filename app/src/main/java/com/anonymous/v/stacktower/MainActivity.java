package com.anonymous.v.stacktower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    //time for splash screen
    private static int t=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //passing intent || changing activaty

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //passing intent
                MainActivity.this.startActivity(new Intent(MainActivity.this, game_bord.class));
                MainActivity.this.finish();
            }
        },t);

    }
}