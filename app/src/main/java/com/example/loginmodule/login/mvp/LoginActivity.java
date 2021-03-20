package com.example.loginmodule.login.mvp;

import com.example.basemodule.base.baseActivity.BaseActivity;
import com.example.loginmodule.R;

/**
 * copyright (C), 2021, 运达科技有限公司
 * fileName LoginActivity
 *
 * @author 王玺权
 * date 2021-03-09 19:29
 * description
 * history
 */
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContact.loginIml {
    @Override
    protected void initInject() {
        mPresenter=new LoginPresenter();
    }

    @Override
    public int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initEventAndData() {
        mPresenter.login();
    }

    @Override
    public void clicks() {

    }

    @Override
    public void showErrorMsg(String msg) {
        super.showErrorMsg(msg);
//        startTo(HomeActivity.class,true);
    }

    @Override
    public void loginSuccess() {
//        startTo(HomeActivity.class,true);
    }
}
