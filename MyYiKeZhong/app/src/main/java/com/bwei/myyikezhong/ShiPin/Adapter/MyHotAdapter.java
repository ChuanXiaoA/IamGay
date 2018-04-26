package com.bwei.myyikezhong.ShiPin.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwei.myyikezhong.R;
import com.bwei.myyikezhong.ShiPin.Bean.HotVideoBean;

import java.util.List;

/**
 * Created by zh on 2018/4/25.
 */

public class MyHotAdapter extends RecyclerView.Adapter<MyHotAdapter.MyHolder> {
    List<HotVideoBean.DataBean> data;
    Context context;

    public MyHotAdapter(List<HotVideoBean.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hot_video, parent, false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Log.i("sss",data.get(position).getCover()+"++++______________");
        Glide.with(context).load(data.get(position).getUser().getIcon()).into(holder.image);
        holder.text.setText(data.get(position).getCreateTime());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView text;

        public MyHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.hot_video_image);
            text = itemView.findViewById(R.id.text_id);
        }
    }
}
