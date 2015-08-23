package com.example.zhangcheng.yanjiuseng;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.NumberPicker.OnScrollListener;
import android.widget.NumberPicker.Formatter;

public class MajorChoosingActivity extends Activity implements OnValueChangeListener,OnScrollListener,Formatter{
    private NumberPicker subjectpicker;

    private NumberPicker majorpicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majorchoosing);
//        //设置学科选择器

        subjectpicker = (NumberPicker) findViewById(R.id.subjectpicker);
        majorpicker = (NumberPicker) findViewById(R.id.majorpicker);


        String[] subject = {"生物","化学","计算机","物理","数学","经济"};
        subjectpicker.setDisplayedValues(subject);
        subjectpicker.setMinValue(0);
        subjectpicker.setMaxValue(subject.length-1);
        subjectpicker.setValue(0);

        //设置专业选择器

        String[] major = {"纳米学","高分子","软件工程","核物理","高等数学","计量经济学"};
        majorpicker.setDisplayedValues(major);
        majorpicker.setMinValue(0);
        majorpicker.setMaxValue(major.length - 1);
        majorpicker.setValue(0);
    }

    public void onScrollStateChange(NumberPicker view, int scrollState) {}

    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {}

    public String format(int value) {return "";}
}
