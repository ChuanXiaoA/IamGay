package com.bwei.myyikezhong.DrawerLayout.presenter;

import com.bwei.myyikezhong.DrawerLayout.model.LoginModel;
import com.bwei.myyikezhong.DrawerLayout.view.LoginView;

/**
 * Created by lenovo on 2018/4/25.
 */

public class LoginPresenter {
    LoginModel loginModel;
    LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModel=new LoginModel();
    }
    public void getLoginPresenter(String mobile,String password){
        loginModel.getLoginModel(mobile,password);
        loginModel.getSetOnLogin(new LoginModel.setOnLogin() {
            @Override
            public void OnSuccess(String msg) {
                loginView.OnSuccess(msg);
            }

            @Override
            public void OnErorr(String msg) {
                loginView.OnErorr(msg);
            }
        });

    }
}
