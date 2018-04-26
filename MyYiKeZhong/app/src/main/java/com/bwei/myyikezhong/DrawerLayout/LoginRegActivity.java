package com.bwei.myyikezhong.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bwei.myyikezhong.DrawerLayout.presenter.LoginPresenter;
import com.bwei.myyikezhong.DrawerLayout.view.LoginView;
import com.bwei.myyikezhong.MainActivity;
import com.bwei.myyikezhong.R;

public class LoginRegActivity extends AppCompatActivity implements View.OnClickListener,LoginView {

    private ImageView mHuitui;
    /**
     * 注册账号
     */
    private TextView mZhucezhanghao;
    /**
     * 账号
     */
    private EditText mName;
    /**
     * 密码
     */
    private EditText mPwd;
    /**
     * 登录
     */
    private Button mLoginbtn;
    /**
     * 忘记密码
     */
    private TextView mWangjimima;
    /**
     * 游客登录
     */
    private TextView mYoukedenglu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_reg);
        initView();
        getData();


    }

    private void initView() {
        mHuitui =  findViewById(R.id.huitui);
        mZhucezhanghao =  findViewById(R.id.zhucezhanghao);
        mName =  findViewById(R.id.name);
        mPwd =  findViewById(R.id.pwd);
        mLoginbtn =  findViewById(R.id.loginbtn);
        mLoginbtn.setOnClickListener(this);
        mWangjimima =  findViewById(R.id.wangjimima);
        mYoukedenglu =  findViewById(R.id.youkedenglu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.loginbtn:
                break;
        }
    }

    public void getData(){
        mZhucezhanghao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginRegActivity.this,RegActivity.class));
            }
        });

        final LoginPresenter loginPresenter=new LoginPresenter(this);
        mLoginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.getLoginPresenter(mName.getText().toString(),mPwd.getText().toString());
            }
        });
    }

    @Override
    public void OnSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginRegActivity.this, MainActivity.class));
    }

    @Override
    public void OnErorr(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
