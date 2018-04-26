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

  private View view2131230796;

<<<<<<< HEAD
  private View view2131230867;

  private View view2131230986;

  private View view2131230868;

  private View view2131230996;

  private View view2131230893;

  private View view2131230927;

  private View view2131231013;

  private View view2131231010;

  private View view2131230869;

  private View view2131230870;

  private View view2131230879;
=======
  private View view2131230866;

  private View view2131230977;

  private View view2131230867;

  private View view2131230987;

  private View view2131230891;

  private View view2131230920;

  private View view2131231000;

  private View view2131230999;

  private View view2131230868;

  private View view2131230869;

  private View view2131230878;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d

  private View view2131230830;

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
    view2131230796 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView, "field 'mImageView' and method 'onClick'");
    target.mImageView = Utils.castView(view, R.id.imageView, "field 'mImageView'", SimpleDraweeView.class);
<<<<<<< HEAD
    view2131230867 = view;
=======
    view2131230866 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.textView, "field 'mTextView' and method 'onClick'");
    target.mTextView = Utils.castView(view, R.id.textView, "field 'mTextView'", TextView.class);
<<<<<<< HEAD
    view2131230986 = view;
=======
    view2131230977 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView2, "field 'mImageView2' and method 'onClick'");
    target.mImageView2 = Utils.castView(view, R.id.imageView2, "field 'mImageView2'", ImageView.class);
<<<<<<< HEAD
    view2131230868 = view;
=======
    view2131230867 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.touxiang, "field 'mTouxiang' and method 'onClick'");
    target.mTouxiang = Utils.castView(view, R.id.touxiang, "field 'mTouxiang'", SimpleDraweeView.class);
<<<<<<< HEAD
    view2131230996 = view;
=======
    view2131230987 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.naicha, "field 'mNaicha' and method 'onClick'");
    target.mNaicha = Utils.castView(view, R.id.naicha, "field 'mNaicha'", TextView.class);
<<<<<<< HEAD
    view2131230893 = view;
=======
    view2131230891 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rlv, "field 'mRlv' and method 'onClick'");
    target.mRlv = Utils.castView(view, R.id.rlv, "field 'mRlv'", RecyclerView.class);
<<<<<<< HEAD
    view2131230927 = view;
=======
    view2131230920 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.yueliang, "field 'mYueliang' and method 'onClick'");
    target.mYueliang = Utils.castView(view, R.id.yueliang, "field 'mYueliang'", ImageView.class);
<<<<<<< HEAD
    view2131231013 = view;
=======
    view2131231000 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.yejianmoshi, "field 'mYejianmoshi' and method 'onClick'");
    target.mYejianmoshi = Utils.castView(view, R.id.yejianmoshi, "field 'mYejianmoshi'", TextView.class);
<<<<<<< HEAD
    view2131231010 = view;
=======
    view2131230999 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView3, "field 'mImageView3' and method 'onClick'");
    target.mImageView3 = Utils.castView(view, R.id.imageView3, "field 'mImageView3'", ImageView.class);
<<<<<<< HEAD
    view2131230869 = view;
=======
    view2131230868 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imageView4, "field 'mImageView4' and method 'onClick'");
    target.mImageView4 = Utils.castView(view, R.id.imageView4, "field 'mImageView4'", ImageView.class);
<<<<<<< HEAD
    view2131230870 = view;
=======
    view2131230869 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.left, "field 'mLeft' and method 'onClick'");
    target.mLeft = Utils.castView(view, R.id.left, "field 'mLeft'", LinearLayout.class);
<<<<<<< HEAD
    view2131230879 = view;
=======
    view2131230878 = view;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.drawer_layout, "field 'mDrawerLayout' and method 'onClick'");
    target.mDrawerLayout = Utils.castView(view, R.id.drawer_layout, "field 'mDrawerLayout'", DrawerLayout.class);
    view2131230830 = view;
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

    view2131230796.setOnClickListener(null);
    view2131230796 = null;
<<<<<<< HEAD
    view2131230867.setOnClickListener(null);
    view2131230867 = null;
    view2131230986.setOnClickListener(null);
    view2131230986 = null;
    view2131230868.setOnClickListener(null);
    view2131230868 = null;
    view2131230996.setOnClickListener(null);
    view2131230996 = null;
    view2131230893.setOnClickListener(null);
    view2131230893 = null;
    view2131230927.setOnClickListener(null);
    view2131230927 = null;
    view2131231013.setOnClickListener(null);
    view2131231013 = null;
    view2131231010.setOnClickListener(null);
    view2131231010 = null;
    view2131230869.setOnClickListener(null);
    view2131230869 = null;
    view2131230870.setOnClickListener(null);
    view2131230870 = null;
    view2131230879.setOnClickListener(null);
    view2131230879 = null;
=======
    view2131230866.setOnClickListener(null);
    view2131230866 = null;
    view2131230977.setOnClickListener(null);
    view2131230977 = null;
    view2131230867.setOnClickListener(null);
    view2131230867 = null;
    view2131230987.setOnClickListener(null);
    view2131230987 = null;
    view2131230891.setOnClickListener(null);
    view2131230891 = null;
    view2131230920.setOnClickListener(null);
    view2131230920 = null;
    view2131231000.setOnClickListener(null);
    view2131231000 = null;
    view2131230999.setOnClickListener(null);
    view2131230999 = null;
    view2131230868.setOnClickListener(null);
    view2131230868 = null;
    view2131230869.setOnClickListener(null);
    view2131230869 = null;
    view2131230878.setOnClickListener(null);
    view2131230878 = null;
>>>>>>> 6526704cffd1d35593050a2489e3a65744ea1f0d
    view2131230830.setOnClickListener(null);
    view2131230830 = null;
  }
}
