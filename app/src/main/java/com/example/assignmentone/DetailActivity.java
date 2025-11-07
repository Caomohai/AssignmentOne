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

        // 设置内容
        setupContent();
    }

    private void initViews() {
        eventIcon = findViewById(R.id.eventIcon);
        eventTitle = findViewById(R.id.eventTitle);
        contentTextView = findViewById(R.id.contentTextView);
    }

    private void setupContent() {
        // 获取传递的主题索引
        int topicIndex = getIntent().getIntExtra("TOPIC_INDEX", 0);

        // 根据索引设置不同的内容
        switch (topicIndex) {
            case 0: // Facilities
                eventIcon.setImageResource(R.drawable.img_btn_facilities);
                eventTitle.setText("Facilities");
                contentTextView.setText("Discover our state-of-the-art campus facilities including libraries, sports centers, study spaces, and more. All facilities are designed to support your academic success and enhance your university experience.");
                break;
            case 1: // Events
                eventIcon.setImageResource(R.drawable.img_btn_events);
                eventTitle.setText("Events");
                contentTextView.setText("Stay updated with upcoming university events including academic conferences, cultural festivals, sports competitions, and social gatherings. Don't miss out on opportunities to connect and learn.");
                break;
            case 2: // Clubs
                eventIcon.setImageResource(R.drawable.img_btn_clubs);
                eventTitle.setText("Clubs");
                contentTextView.setText("Explore diverse student clubs and societies. From academic groups to cultural organizations and sports teams, find your community and get involved in campus life. Joining clubs is a great way to meet new people.");
                break;
            case 3: // Support
                eventIcon.setImageResource(R.drawable.img_btn_support);
                eventTitle.setText("Support");
                contentTextView.setText("Access comprehensive student support services including academic counseling, health services, career guidance, and wellness resources. We're here to help you succeed in your academic journey.");
                break;
            default:
                setDefaultContent();
        }
    }

    private void setDefaultContent() {
        eventIcon.setImageResource(R.drawable.img_btn_facilities);
        eventTitle.setText("CampusLife");
        contentTextView.setText("Welcome to CampusLife. Select a category to view detailed information about campus services and activities.");
    }
}