package com.example.zhangcheng.fragmentdemo;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GrxxFragment extends Fragment {


    private TitleView titleView;
    private FragmentActivity mActivity;
    private View mParent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grxx, container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mActivity = getActivity();
        mParent = getView();
        titleView = (TitleView) mActivity.findViewById(R.id.title);
        titleView.setTitle("个人信息");
        titleView.setBackButton(new TitleView.OnBackButtonClickListener() {
            @Override
            public void onClick(View button) {
                getFragmentManager().beginTransaction()
                        .hide(com.qyh.main.MainActivity.mFragments[1])
                        .show(com.qyh.main.MainActivity.mFragments[0]).commit();
                FragmentIndicator.setIndicator(0);
            }
        });
    }


}
