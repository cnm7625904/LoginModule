package com.example.loginmodule.login.api;

import com.example.basemodule.base.basebean.BaseResponse;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * copyright (C), 2021, 运达科技有限公司
 * fileName LoginApi
 *
 * @author 王玺权
 * date 2021-03-09 19:49
 * description
 * history
 */
public interface LoginApi {
    /**
     * 登录
     * @param userId 用户名
     * @param passWord 密码
     * @param url 地址
     * @return
     */
    @FormUrlEncoded
    @POST
    Flowable<BaseResponse> login(@Url String url, @Field("userId") String userId, @Field("passWord") String passWord);
}
