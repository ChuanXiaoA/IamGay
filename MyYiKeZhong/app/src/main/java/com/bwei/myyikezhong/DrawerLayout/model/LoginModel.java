package com.bwei.myyikezhong.DrawerLayout.model;

import com.bwei.myyikezhong.Api.Api;
import com.bwei.myyikezhong.DrawerLayout.Bean.LoginInfo;
import com.bwei.myyikezhong.DrawerLayout.Bean.RegInfo;
import com.bwei.myyikezhong.DrawerLayout.app.AppService;
import com.bwei.myyikezhong.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/25.
 */

public class LoginModel {

    public interface setOnLogin{
        void OnSuccess(String msg);
        void OnErorr(String msg);
    }
    setOnLogin setOnLogin;
    public void getSetOnLogin(setOnLogin setOnLogin){

        this.setOnLogin=setOnLogin;
    }

    public void getLoginModel(String mobile,String password){
        RetrofitUtils inData = RetrofitUtils.getInData();
        AppService retrofit = inData.getRetrofit(Api.URL_, AppService.class);
        Flowable<LoginInfo> loginInfo = retrofit.getLoginInfo(mobile, password);
        loginInfo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<LoginInfo>() {
                    @Override
                    public void onNext(LoginInfo loginInfo) {
                        String code = loginInfo.getCode();
                        String msg = loginInfo.getMsg();
                        if(code.equals("0")){
                            if(setOnLogin!=null){
                                setOnLogin.OnSuccess(msg);
                            }
                        }else {
                            if(setOnLogin!=null){
                                setOnLogin.OnErorr(msg);
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
