package com.bwei.myyikezhong.Fragment.f1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bwei.myyikezhong.R;
import com.bwei.myyikezhong.ShiPin.Adapter.MyHotAdapter;
import com.bwei.myyikezhong.ShiPin.Bean.HotVideoBean;
import com.bwei.myyikezhong.ShiPin.Presenter.MyHotPresenter;
import com.bwei.myyikezhong.ShiPin.View.MyViewHot;

import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */

public class F31 extends Fragment implements MyViewHot{

    private MyHotPresenter myHotPresenter;
    private RecyclerView hotvideo_recy1;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f31,container,false);
        myHotPresenter = new MyHotPresenter(this);
        hotvideo_recy1 = view.findViewById(R.id.hotvideo_recy);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        hotvideo_recy1.setLayoutManager(staggeredGridLayoutManager);
     //   hotvideo_recy1.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myHotPresenter.reteleHotVideo("1","android","android","101");

        return view;
    }

    @Override
    public void setSuccess(HotVideoBean hotVideoBean) {
        Log.i("sss",hotVideoBean.getMsg()+"++++++++++");
        Toast.makeText(getActivity(),hotVideoBean.getMsg(),Toast.LENGTH_SHORT).show();
        List<HotVideoBean.DataBean> data = hotVideoBean.getData();
        MyHotAdapter myHotAdapter= new MyHotAdapter(data,getActivity());
        hotvideo_recy1.setAdapter(myHotAdapter);

    }

    @Override
    public void setError(String msg) {
        Log.i("xxx",msg);
        Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
    }
}
