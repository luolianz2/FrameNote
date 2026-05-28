package com.luolian.framenote;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * 我的页 —— 个人中心与设置界面
 * 展示用户信息、同步状态，提供设置和关于入口
 */
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //启用边到边布局，让应用内容延伸到状态栏和导航栏后面
        EdgeToEdge.enable(this);

        //加载我的页的界面布局文件
        setContentView(R.layout.activity_profile);

        //处理系统栏内边距，使内容不被状态栏和导航栏遮挡
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
