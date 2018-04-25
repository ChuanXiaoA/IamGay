// Generated code from Butter Knife. Do not modify!
package com.bwei.myyikezhong;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.hjm.bottomtabbar.BottomTabBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165220;

  private View view2131165275;

  private View view2131165362;

  private View view2131165276;

  private View view2131165371;

  private View view2131165294;

  private View view2131165315;

  private View view2131165382;

  private View view2131165381;

  private View view2131165277;

  private View view2131165278;

  private View view2131165284;

  private View view2131165248;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnbar, "field 'mBtnbar' and method 'onClick'");
    target.mBtnbar = Utils.castView(view, R.id.btnbar, "field 'mBtnbar'", BottomTabBar.class);
    view2131165220 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView, "field 'mImageView' and method 'onClick'");
    target.mImageView = Utils.castView(view, R.id.imageView, "field 'mImageView'", SimpleDraweeView.class);
    view2131165275 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.textView, "field 'mTextView' and method 'onClick'");
    target.mTextView = Utils.castView(view, R.id.textView, "field 'mTextView'", TextView.class);
    view2131165362 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView2, "field 'mImageView2' and method 'onClick'");
    target.mImageView2 = Utils.castView(view, R.id.imageView2, "field 'mImageView2'", ImageView.class);
    view2131165276 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.touxiang, "field 'mTouxiang' and method 'onClick'");
    target.mTouxiang = Utils.castView(view, R.id.touxiang, "field 'mTouxiang'", SimpleDraweeView.class);
    view2131165371 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.naicha, "field 'mNaicha' and method 'onClick'");
    target.mNaicha = Utils.castView(view, R.id.naicha, "field 'mNaicha'", TextView.class);
    view2131165294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rlv, "field 'mRlv' and method 'onClick'");
    target.mRlv = Utils.castView(view, R.id.rlv, "field 'mRlv'", RecyclerView.class);
    view2131165315 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.yueliang, "field 'mYueliang' and method 'onClick'");
    target.mYueliang = Utils.castView(view, R.id.yueliang, "field 'mYueliang'", ImageView.class);
    view2131165382 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.yejianmoshi, "field 'mYejianmoshi' and method 'onClick'");
    target.mYejianmoshi = Utils.castView(view, R.id.yejianmoshi, "field 'mYejianmoshi'", TextView.class);
    view2131165381 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView3, "field 'mImageView3' and method 'onClick'");
    target.mImageView3 = Utils.castView(view, R.id.imageView3, "field 'mImageView3'", ImageView.class);
    view2131165277 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView4, "field 'mImageView4' and method 'onClick'");
    target.mImageView4 = Utils.castView(view, R.id.imageView4, "field 'mImageView4'", ImageView.class);
    view2131165278 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.left, "field 'mLeft' and method 'onClick'");
    target.mLeft = Utils.castView(view, R.id.left, "field 'mLeft'", LinearLayout.class);
    view2131165284 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.drawer_layout, "field 'mDrawerLayout' and method 'onClick'");
    target.mDrawerLayout = Utils.castView(view, R.id.drawer_layout, "field 'mDrawerLayout'", DrawerLayout.class);
    view2131165248 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBtnbar = null;
    target.mImageView = null;
    target.mTextView = null;
    target.mImageView2 = null;
    target.mTouxiang = null;
    target.mNaicha = null;
    target.mRlv = null;
    target.mYueliang = null;
    target.mYejianmoshi = null;
    target.mImageView3 = null;
    target.mImageView4 = null;
    target.mLeft = null;
    target.mDrawerLayout = null;

    view2131165220.setOnClickListener(null);
    view2131165220 = null;
    view2131165275.setOnClickListener(null);
    view2131165275 = null;
    view2131165362.setOnClickListener(null);
    view2131165362 = null;
    view2131165276.setOnClickListener(null);
    view2131165276 = null;
    view2131165371.setOnClickListener(null);
    view2131165371 = null;
    view2131165294.setOnClickListener(null);
    view2131165294 = null;
    view2131165315.setOnClickListener(null);
    view2131165315 = null;
    view2131165382.setOnClickListener(null);
    view2131165382 = null;
    view2131165381.setOnClickListener(null);
    view2131165381 = null;
    view2131165277.setOnClickListener(null);
    view2131165277 = null;
    view2131165278.setOnClickListener(null);
    view2131165278 = null;
    view2131165284.setOnClickListener(null);
    view2131165284 = null;
    view2131165248.setOnClickListener(null);
    view2131165248 = null;
  }
}