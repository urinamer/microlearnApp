package com.example.microlearn;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton btHistory;
    MaterialButton btPhysics;
    MaterialButton btRobotics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btHistory = findViewById(R.id.btHistory);
        btPhysics = findViewById(R.id.btPhysics);
        btRobotics = findViewById(R.id.btRobotics);

        btHistory.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(intent);
        });

        btPhysics.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PhysicsActivity.class);
            startActivity(intent);
        });


        btRobotics.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RoboticsActivity.class);
            startActivity(intent);
        });



    }



}