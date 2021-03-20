package com.example.loginmodule.login.mvp;


import com.example.basemodule.base.baseView.BasePresenter;
import com.example.basemodule.base.baseView.BaseView;

/**
 * copyright (C), 2021, 运达科技有限公司
 * fileName LoginContact
 *
 * @author 王玺权
 * date 2021-03-09 19:29
 * description
 * history
 */
public interface LoginContact {
    interface loginIml extends BaseView {
         void loginSuccess();
    }
    interface preseter extends BasePresenter<loginIml> {
            void login(String userName,String passWord);
    }
}
