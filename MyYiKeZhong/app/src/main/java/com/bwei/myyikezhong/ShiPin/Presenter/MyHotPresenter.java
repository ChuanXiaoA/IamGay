package com.bwei.myyikezhong.ShiPin.Presenter;

import com.bwei.myyikezhong.ShiPin.Bean.HotVideoBean;
import com.bwei.myyikezhong.ShiPin.Model.MyHotVideoModel;
import com.bwei.myyikezhong.ShiPin.View.MyViewHot;

/**
 * Created by zh on 2018/4/25.
 */

public class MyHotPresenter {
    MyViewHot myViewHot;
    MyHotVideoModel myHotVideoModel;

    public MyHotPresenter(MyViewHot myViewHot) {
        this.myViewHot = myViewHot;
        myHotVideoModel=new MyHotVideoModel();
    }
    public void reteleHotVideo(String page,String token,String source,String appvesiton){
    myHotVideoModel.getHotVideoData(page,token,source,appvesiton);
    myHotVideoModel.setHotVideo(new MyHotVideoModel.setHotVideojiekou() {
        @Override
        public void setSuccess(HotVideoBean hotVideoBean) {
            if (hotVideoBean.getData().equals("0")){
                myViewHot.setSuccess(hotVideoBean);
            }else {
                myViewHot.setError(hotVideoBean.getMsg());
            }
        }

        @Override
        public void setError(String errors) {
             myViewHot.setError(errors);
        }
    });
    }
}
