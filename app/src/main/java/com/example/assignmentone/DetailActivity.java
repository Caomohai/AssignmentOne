package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView eventIcon;
    private TextView eventTitle;
    private TextView contentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 初始化视图
        initViews();

        // 设置内容 - 使用Intent传递的数据
        setupContent();
    }

    private void initViews() {
        eventIcon = findViewById(R.id.eventIcon);
        eventTitle = findViewById(R.id.eventTitle);
        contentTextView = findViewById(R.id.contentTextView);
    }

    private void setupContent() {
        // Part G: 从Intent获取唯一标识符
        int topicIndex = getIntent().getIntExtra("TOPIC_INDEX", 0);

        // 根据标识符显示不同内容
        switch (topicIndex) {
            case 0: // Facilities
                eventIcon.setImageResource(R.drawable.img_btn_facilities);
                eventTitle.setText("Facilities");
                contentTextView.setText("Discover our state-of-the-art campus facilities including libraries, sports centers, study spaces, and more.");
                break;
            case 1: // Events
                eventIcon.setImageResource(R.drawable.img_btn_events);
                eventTitle.setText("Events");
                contentTextView.setText("Stay updated with upcoming university events including academic conferences, cultural festivals, and social gatherings.");
                break;
            case 2: // Clubs
                eventIcon.setImageResource(R.drawable.img_btn_clubs);
                eventTitle.setText("Clubs");
                contentTextView.setText("Explore diverse student clubs and societies. From academic groups to cultural organizations and sports teams.");
                break;
            case 3: // Support
                eventIcon.setImageResource(R.drawable.img_btn_support);
                eventTitle.setText("Support");
                contentTextView.setText("Access comprehensive student support services including academic counseling, health services, and career guidance.");
                break;
            default:
                setDefaultContent();
        }
    }

    private void setDefaultContent() {
        eventIcon.setImageResource(R.drawable.img_btn_facilities);
        eventTitle.setText("CampusLife");
        contentTextView.setText("Welcome to CampusLife. Select a category to view detailed information.");
    }
}