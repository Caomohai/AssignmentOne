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

        // 设置内容 - 使用arrays.xml数据
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

        // Part H: 从arrays.xml获取数据 - 使用正确的数组名称
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);

        // 直接使用数组索引设置内容（不使用if/switch）
        eventTitle.setText(titles[topicIndex]);
        contentTextView.setText(contents[topicIndex]);

        // 设置图片
        setImageResource(imageNames[topicIndex]);
    }

    private void setImageResource(String imageName) {
        // 根据图片名称获取资源ID - 注意去除可能的空格
        String cleanImageName = imageName.trim();
        int resourceId = getResources().getIdentifier(cleanImageName, "drawable", getPackageName());
        if (resourceId != 0) {
            eventIcon.setImageResource(resourceId);
        } else {
            // 如果图片不存在，使用默认图片
            eventIcon.setImageResource(R.drawable.img_btn_facilities);
        }
    }
}