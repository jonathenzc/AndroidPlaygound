package com.example.zhangcheng.yanjiuseng;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AcademicCircle extends FragmentActivity implements OnClickListener  {

//    //用于Fragment逐级跳转
//    private static AcademicCircle mInstance;
//    private BackHandledFragment mBackHandedFragment;
//    private Button btnSecond;

    // 四个tab布局
    private RelativeLayout homeLayout, messageLayout, serviceLayout, meLayout;

    // 底部标签切换的Fragment
    private Fragment home_fragment, message_fragment, service_fragment,me_fragment,
            currentFragment;
    // 底部标签图片
    private ImageView homeImg, messageImg, serviceImg ,meImg;
    // 底部标签的文本
    private TextView homeTv, messageTv, serviceTv ,meTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.academiccircle);

        initUI();
        initTab();
    }

//    public static AcademicCircle getInstance() {
//        if (mInstance == null) {
//            mInstance = new AcademicCircle();
//        }
//        return mInstance;
//    }

    /**
     * 初始化UI
     */
    private void initUI() {
        //获取layout
        homeLayout = (RelativeLayout) findViewById(R.id.rl_home);
        messageLayout = (RelativeLayout) findViewById(R.id.rl_message);
        serviceLayout = (RelativeLayout) findViewById(R.id.rl_service);
        meLayout = (RelativeLayout) findViewById(R.id.rl_me);

        homeLayout.setOnClickListener(this);
        messageLayout.setOnClickListener(this);
        serviceLayout.setOnClickListener(this);
        meLayout.setOnClickListener(this);


        //获取图片
        homeImg = (ImageView) findViewById(R.id.iv_home);
        messageImg = (ImageView) findViewById(R.id.iv_message);
        serviceImg = (ImageView) findViewById(R.id.iv_service);
        meImg = (ImageView) findViewById(R.id.iv_me);

        //获取文字
        homeTv = (TextView) findViewById(R.id.tv_home);
        messageTv = (TextView) findViewById(R.id.tv_message);
        serviceTv = (TextView) findViewById(R.id.tv_service);
        meTv = (TextView) findViewById(R.id.tv_me);
    }

    /**
     * 初始化底部标签
     */
    private void initTab() {
        if (home_fragment == null) {
            home_fragment = new homeFragment();
        }

        if (!home_fragment.isAdded()) {
            // 提交事务
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content_layout, home_fragment).commit();

            // 记录当前Fragment
            currentFragment = home_fragment;
            // 设置图片文本的变化
            homeImg.setImageResource(R.drawable.home);

            homeTv.setTextColor(getResources().getColor(R.color.skyblue));
            messageTv.setTextColor(getResources().getColor(R.color.darkGrey));
            serviceTv.setTextColor(getResources().getColor(R.color.darkGrey));
            meTv.setTextColor(getResources().getColor(R.color.darkGrey));

            //没有设置按下标签的图片
//            messageImg.setImageResource(R.drawable.btn_wantknow_nor);
//            meImg.setImageResource(R.drawable.btn_my_nor);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_home: // 学术圈
                clickTab1Layout();
                break;
            case R.id.rl_message: // 消息
                clickTab2Layout();
                break;
            case R.id.rl_service: // 服务
                clickTab3Layout();
                break;
            case R.id.rl_me: // 我
                clickTab4Layout();
                break;
            default:
                break;
        }
    }

    /**
     * 点击第一个tab
     */
    private void clickTab1Layout() {
        if (home_fragment == null) {
            home_fragment = new homeFragment();
        }
        addOrShowFragment(getSupportFragmentManager().beginTransaction(), home_fragment);

        // 设置底部tab变化
        homeTv.setTextColor(getResources().getColor(R.color.skyblue));
        messageTv.setTextColor(getResources().getColor(R.color.darkGrey));
        serviceTv.setTextColor(getResources().getColor(R.color.darkGrey));
        meTv.setTextColor(getResources().getColor(R.color.darkGrey));

        //按下图片还没有设置
//        knowImg.setImageResource(R.drawable.btn_know_pre);
//        iWantKnowImg.setImageResource(R.drawable.btn_wantknow_nor);
//        meImg.setImageResource(R.drawable.btn_my_nor);
    }

    /**
     * 点击第二个tab
     */
    private void clickTab2Layout() {
        if (message_fragment == null) {
            message_fragment = new messageFragment();
        }
        addOrShowFragment(getSupportFragmentManager().beginTransaction(), message_fragment);

        // 设置底部tab变化
        homeTv.setTextColor(getResources().getColor(R.color.darkGrey));
        messageTv.setTextColor(getResources().getColor(R.color.skyblue));
        serviceTv.setTextColor(getResources().getColor(R.color.darkGrey));
        meTv.setTextColor(getResources().getColor(R.color.darkGrey));

        //按下图片还没有设置
//        knowImg.setImageResource(R.drawable.btn_know_pre);
//        iWantKnowImg.setImageResource(R.drawable.btn_wantknow_nor);
//        meImg.setImageResource(R.drawable.btn_my_nor);

    }

    /**
     * 点击第三个tab
     */
    private void clickTab3Layout() {
        if (service_fragment == null) {
            service_fragment = new serviceFragment();
        }

        addOrShowFragment(getSupportFragmentManager().beginTransaction(), service_fragment);

        // 设置底部tab变化
        homeTv.setTextColor(getResources().getColor(R.color.darkGrey));
        messageTv.setTextColor(getResources().getColor(R.color.darkGrey));
        serviceTv.setTextColor(getResources().getColor(R.color.skyblue));
        meTv.setTextColor(getResources().getColor(R.color.darkGrey));

        //按下图片还没有设置
//        knowImg.setImageResource(R.drawable.btn_know_pre);
//        iWantKnowImg.setImageResource(R.drawable.btn_wantknow_nor);
//        meImg.setImageResource(R.drawable.btn_my_nor);

    }

    /**
     * 点击第四个tab
     */
    private void clickTab4Layout() {
        if (me_fragment == null) {
            me_fragment = new meFragment();
        }

        addOrShowFragment(getSupportFragmentManager().beginTransaction(), me_fragment);

        // 设置底部tab变化
        homeTv.setTextColor(getResources().getColor(R.color.darkGrey));
        messageTv.setTextColor(getResources().getColor(R.color.darkGrey));
        serviceTv.setTextColor(getResources().getColor(R.color.darkGrey));
        meTv.setTextColor(getResources().getColor(R.color.skyblue));

        //按下图片还没有设置
//        knowImg.setImageResource(R.drawable.btn_know_pre);
//        iWantKnowImg.setImageResource(R.drawable.btn_wantknow_nor);
//        meImg.setImageResource(R.drawable.btn_my_nor);

    }

    /**
     * 添加或者显示碎片
     *
     * @param transaction
     * @param fragment
     */
    private void addOrShowFragment(FragmentTransaction transaction,
                                   Fragment fragment) {
        if (currentFragment == fragment)
            return;

        if (!fragment.isAdded()) { // 如果当前fragment未被添加，则添加到Fragment管理器中
            transaction.hide(currentFragment)
                    .add(R.id.content_layout, fragment).commit();
        } else {
            transaction.hide(currentFragment).show(fragment).commit();
        }

        currentFragment = fragment;
    }

//    @Override
//    public void setSelectedFragment(BackHandledFragment selectedFragment) {
//        this.mBackHandedFragment = selectedFragment;
//    }
}
