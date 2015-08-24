package com.example.zhangcheng.yanjiuseng;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    //登录按钮事件
    public void login(View v)
    {
        Intent in=new Intent(LoginActivity.this,AcademicCircle.class);
        startActivity(in);
    }
}
