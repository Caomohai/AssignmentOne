package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取四个ImageButton
        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        // 为Facilities按钮添加点击事件
        btnFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Facilities clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // 为Events按钮添加点击事件
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Events clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // 为Clubs按钮添加点击事件
        btnClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clubs clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // 为Support按钮添加点击事件
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Support clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}