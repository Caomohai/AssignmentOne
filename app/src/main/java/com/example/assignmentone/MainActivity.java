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

        // 为每个按钮添加点击事件
        btnFacilities.setOnClickListener(v -> {
            showToast("Facilities clicked");
            startDetailActivity(0); // 传递数字标识符
        });

        btnEvents.setOnClickListener(v -> {
            showToast("Events clicked");
            startDetailActivity(1); // 传递数字标识符
        });

        btnClubs.setOnClickListener(v -> {
            showToast("Clubs clicked");
            startDetailActivity(2); // 传递数字标识符
        });

        btnSupport.setOnClickListener(v -> {
            showToast("Support clicked");
            startDetailActivity(3); // 传递数字标识符
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void startDetailActivity(int topicIndex) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("TOPIC_INDEX", topicIndex); // 传递数字标识符
        startActivity(intent);
    }
}