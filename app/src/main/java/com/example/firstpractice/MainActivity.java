package com.example.firstpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "firstpractice";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Application Created", Toast.LENGTH_SHORT).show();
        Log.v(TAG, "This application is created");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PicActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Application Started", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "This application has started");
        });
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(MainActivity.this, "Application Stopped", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "This application is stopped");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "Application Destroyed", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "This application is destroyed");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(MainActivity.this, "Application Paused", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "This application is paused");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(MainActivity.this, "Application Resumed", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "This application is resumed");
    }
}