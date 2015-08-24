package com.example.zhangcheng.yanjiuseng;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.NumberPicker.OnScrollListener;
import android.widget.NumberPicker.Formatter;

public class ResearchDirectionActivity extends Activity implements OnValueChangeListener,OnScrollListener,Formatter {
    private NumberPicker bigRDpicker; //研究方向大方向

    private NumberPicker littleRDpicker; //研究方向小方向

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.researchdirection);

        //        //设置学科选择器

        bigRDpicker = (NumberPicker) findViewById(R.id.bigRDpicker);
        littleRDpicker = (NumberPicker) findViewById(R.id.littleRDpicker);


        String[] bigDirection = {"生物","化学","计算机","物理","数学","经济","其他"};
        bigRDpicker.setDisplayedValues(bigDirection);
        bigRDpicker.setMinValue(0);
        bigRDpicker.setMaxValue(bigDirection.length-1);
        bigRDpicker.setValue(0);

        //设置专业选择器

        String[] littleDirection = {"纳米学","高分子","软件工程","核物理","高等数学","计量经济学","其他"};
        littleRDpicker.setDisplayedValues(littleDirection);
        littleRDpicker.setMinValue(0);
        littleRDpicker.setMaxValue(littleDirection.length - 1);
        littleRDpicker.setValue(0);
    }

    public void onScrollStateChange(NumberPicker view, int scrollState) {}

    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {}

    public String format(int value) {return "";}

    //研究方向选择完毕
    public void ChoosingFinished(View v)
    {
        Intent in=new Intent(ResearchDirectionActivity.this,MajorChoosingClosing.class);
        startActivity(in);
    }
}
