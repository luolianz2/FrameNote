package com.luolian.framenote;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * 笔记本页 —— 笔记本列表管理界面
 * 展示所有笔记本，支持新建、搜索和筛选
 */
public class NotebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //启用边到边布局，让应用内容延伸到状态栏和导航栏后面
        EdgeToEdge.enable(this);

        //加载笔记本页的界面布局文件
        setContentView(R.layout.activity_notebook);

        //处理系统栏内边距，使内容不被状态栏和导航栏遮挡
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
