package com.bwei.myyikezhong.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bwei.myyikezhong.Base.BaseActivity;
import com.bwei.myyikezhong.DrawerLayout.presenter.RegPresenter;
import com.bwei.myyikezhong.DrawerLayout.view.RegView;
import com.bwei.myyikezhong.R;

public class RegActivity extends BaseActivity<RegPresenter> implements RegView{

    private ImageView mHuitui;
    /**
     * 已有账号?
     */
    private TextView mYiyouzhanghao;
    /**
     * 请输入手机号
     */
    private EditText mShuruname;
    /**
     * 输入大小写和数字,密码不能超过8位
     */
    private EditText mShurupwd;
    /**
     * 注册
     */
    private Button mRegbtn;
    /**
     * 游客登录
     */
    private TextView mYoukedenglu;
    @Override
    public void getData() {
        mRegbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getRegPresenter11("本地注册",mShuruname.getText().toString(),mShurupwd.getText().toString());
           }
        });
    }
    @Override
    public int getLayout() {
        return R.layout.activity_reg;
    }

    @Override
    public RegPresenter getPresenter() {
        presenter=new RegPresenter(this);
        return presenter;
    }

    public void initView() {
        mHuitui =  findViewById(R.id.huitui);
        mYiyouzhanghao = findViewById(R.id.yiyouzhanghao);
        mShuruname =  findViewById(R.id.shuruname);
        mShurupwd =  findViewById(R.id.shurupwd);
        mRegbtn =  findViewById(R.id.regbtn);
        mYoukedenglu =findViewById(R.id.youkedenglu);
    }



    @Override
    public void OnSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegActivity.this,LoginRegActivity.class));
    }

    @Override
    public void OnErorr(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
