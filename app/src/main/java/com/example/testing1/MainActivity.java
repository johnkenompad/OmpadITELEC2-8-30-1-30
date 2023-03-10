package com.example.testing1;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG,"This is a verbose log.");
        Log.d(TAG,"This is a debug log.");
        Log.i(TAG,"This is an info log.");
        Log.w(TAG,"This is a warn log.");
        Log.e(TAG,"This is an error log.");

        Button button=(Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Button Clicker");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }


        });
    }
}