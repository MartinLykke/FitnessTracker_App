package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openWorkoutsBtn = (Button)findViewById(R.id.openWorkoutsButton);
        openWorkoutsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), workoutsView.class);
                startIntent.putExtra("com.example.quicklauncher.something","hello world");
                startActivity(startIntent);

            }
        });


    }
}
