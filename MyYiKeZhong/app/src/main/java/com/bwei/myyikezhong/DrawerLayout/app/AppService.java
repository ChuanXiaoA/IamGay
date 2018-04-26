package com.bwei.myyikezhong.DrawerLayout.app;

import com.bwei.myyikezhong.DrawerLayout.Bean.LoginInfo;
import com.bwei.myyikezhong.DrawerLayout.Bean.RegInfo;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 2018/4/25.
 */

public interface AppService {

@GET("quarter/register")
    Flowable<RegInfo> getRegInfo(@Query("regtype") String regtype,@Query("mobile") String mobile,@Query("password") String passwprd);
@GET("user/login")
    Flowable<LoginInfo> getLoginInfo(@Query("mobile") String mobile,@Query("password") String passwprd);
}
