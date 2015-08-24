package com.example.zhangcheng.yanjiuseng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class meFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container,
                false);
        return view;
    }

    //个人信息事件
    public void personalInfo(View v)
    {
//        Intent in=new Intent(meFragment.this,RegisterActivity.class);
//        startActivity(in);
    }
}
