package com.example.loginmodule.login.module;


import android.text.TextUtils;

import com.cdwang.httpmodule.http.ApiWrapper;
import com.example.basemodule.base.baseConstant.HttpConstant;
import com.example.basemodule.base.basebean.BaseResponse;
import com.example.loginmodule.login.api.LoginApi;

import java.util.ArrayList;

import io.reactivex.Flowable;
import okhttp3.Interceptor;

/**
 * copyright (C), 2021, 运达科技有限公司
 * fileName LoginModel
 *
 * @author 王玺权
 * date 2021-03-09 19:52
 * description
 * history
 */
public class LoginModel implements LoginApi {
    private static volatile LoginModel model;
    private LoginApi mLoginApi;
    private LoginModel() {
        mLoginApi= ApiWrapper.getInstance(LoginApi.class);
    }
    public static LoginModel getInstance()  {
        if(model == null) {
            synchronized (LoginModel.class){
                if(model == null){
                    model = new LoginModel();
                }
            }
        }
        return model;
    }

    @Override
    public Flowable<BaseResponse> login(String url, String userId, String passWord) {
        return mLoginApi.login(url, userId, passWord);
    }
}
