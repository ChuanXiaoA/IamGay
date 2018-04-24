package gitstudy.com.bw.myzhong;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gitstudy.com.bw.myzhong.fragment.F1;
import gitstudy.com.bw.myzhong.fragment.F2;
import gitstudy.com.bw.myzhong.fragment.F3;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btnbar)
    BottomTabBar mBtnbar;
    @BindView(R.id.imageView)
    ImageView mImageView;
    @BindView(R.id.textView)
    TextView mTextView;
    @BindView(R.id.imageView2)
    ImageView mImageView2;
    @BindView(R.id.touxiang)
    ImageView mTouxiang;
    @BindView(R.id.naicha)
    TextView mNaicha;
    @BindView(R.id.rlv)
    RecyclerView mRlv;
    @BindView(R.id.yueliang)
    ImageView mYueliang;
    @BindView(R.id.yejianmoshi)
    TextView mYejianmoshi;
    @BindView(R.id.imageView3)
    ImageView mImageView3;
    @BindView(R.id.imageView4)
    ImageView mImageView4;
    @BindView(R.id.left)
    LinearLayout mLeft;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
//haha
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBtnbar.init(getSupportFragmentManager())
                .setFontSize(0)
                .addTabItem("", R.drawable.tuijian2, R.drawable.tuijian1, F1.class)
                .addTabItem("", R.drawable.duanzi2, R.drawable.duanzi1, F2.class)
                .addTabItem("", R.drawable.shipin2, R.drawable.shipin1, F3.class)
                .isShowDivider(false);


    }
    @OnClick({R.id.btnbar, R.id.imageView, R.id.textView, R.id.imageView2, R.id.touxiang, R.id.naicha, R.id.rlv, R.id.yueliang, R.id.yejianmoshi, R.id.imageView3, R.id.imageView4, R.id.left, R.id.drawer_layout})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btnbar:
                break;
            case R.id.imageView:
                break;
            case R.id.textView:
                break;
            case R.id.imageView2:
                break;
            case R.id.touxiang:
                break;
            case R.id.naicha:
                break;
            case R.id.rlv:
                break;
            case R.id.yueliang:
                break;
            case R.id.yejianmoshi:
                break;
            case R.id.imageView3:
                break;
            case R.id.imageView4:
                break;
            case R.id.left:
                break;
            case R.id.drawer_layout:
                break;
        }
    }
}
