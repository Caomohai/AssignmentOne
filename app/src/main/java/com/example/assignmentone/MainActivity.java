package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化按钮和点击事件
        initButtons();
    }

    private void initButtons() {
        // 获取四个ImageButton
        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        // 为每个按钮添加点击事件 - 包含Part G要求的Intent
        btnFacilities.setOnClickListener(v -> {
            showToast("Facilities clicked");
            startDetailActivity(0); // 传递唯一标识符 0
        });

        btnEvents.setOnClickListener(v -> {
            showToast("Events clicked");
            startDetailActivity(1); // 传递唯一标识符 1
        });

        btnClubs.setOnClickListener(v -> {
            showToast("Clubs clicked");
            startDetailActivity(2); // 传递唯一标识符 2
        });

        btnSupport.setOnClickListener(v -> {
            showToast("Support clicked");
            startDetailActivity(3); // 传递唯一标识符 3
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // Part G: 创建显式Intent并传递唯一标识符
    private void startDetailActivity(int topicIndex) {
        // 创建显式Intent
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        // 传递唯一标识符 - 使用数字便于在Part H中使用数组
        intent.putExtra("TOPIC_INDEX", topicIndex);

        // 启动DetailActivity
        startActivity(intent);
    }
}