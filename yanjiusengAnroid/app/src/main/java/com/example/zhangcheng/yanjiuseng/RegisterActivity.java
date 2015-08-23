package com.example.zhangcheng.yanjiuseng;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    //注册按钮事件
    public void registerChecking(View v)
    {
        Intent in=new Intent(RegisterActivity.this,VerifyPhoneCodeActivity.class);
        startActivity(in);
    }
}
