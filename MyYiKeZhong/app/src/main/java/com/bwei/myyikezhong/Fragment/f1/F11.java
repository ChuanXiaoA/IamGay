package com.bwei.myyikezhong.Fragment.f1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.myyikezhong.R;
import com.youth.banner.Banner;

/**
 * Created by lenovo on 2018/4/23.
 */

public class F11 extends Fragment {
    private View view;
    private Banner mF11Banner;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f11, container, false);






        initView(view);
        return view;
    }

    private void initView(View view) {
        mF11Banner = (Banner) view.findViewById(R.id.f11_Banner);
    }
}
