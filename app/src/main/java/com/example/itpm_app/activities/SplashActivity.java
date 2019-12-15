package com.example.itpm_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.itpm_app.R;

public class SplashActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();
    private Runnable mRunnable = new Runnable() {
        @Override
            public void run() {
                Intent intent = new Intent( SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler.postDelayed(mRunnable,2000L) ;

    }

    @Override
    protected void onPause() {
        super.onPause();

        mHandler.removeCallbacks(mRunnable);
        finish();

    }
}
