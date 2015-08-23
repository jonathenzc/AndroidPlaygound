package com.example.zhangcheng.yanjiuseng;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyPhoneCodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifyphonecode);
    }

    //登录按钮事件
    public void choosingMajor(View v)
    {
        Intent in=new Intent(VerifyPhoneCodeActivity.this,MajorChoosingActivity.class);
        startActivity(in);
    }
}
