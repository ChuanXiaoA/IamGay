package com.bwei.myyikezhong.DrawerLayout.presenter;

import android.util.Log;

import com.bwei.myyikezhong.DrawerLayout.model.RegModel;
import com.bwei.myyikezhong.DrawerLayout.view.RegView;

/**
 * Created by lenovo on 2018/4/25.
 */

public class RegPresenter {

    RegModel regModel;
    RegView regView;

    public RegPresenter(RegView regView) {
        this.regView = regView;
        regModel=new RegModel();
    }
    public void getRegPresenter11(String type,String mobile,String password){

        regModel.getRegModel(type,mobile,password);
        regModel.getSetOnReg(new RegModel.setOnReg() {
            @Override
            public void OnSuccess(String msg) {
                regView.OnSuccess(msg);
            }

            @Override
            public void OnErorr(String msg) {
                regView.OnErorr(msg);
            }
        });
    }
}