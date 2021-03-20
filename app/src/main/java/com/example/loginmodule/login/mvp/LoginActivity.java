package com.example.loginmodule.login.mvp;

import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basemodule.base.baseActivity.BaseActivity;
import com.example.loginmodule.R;

import java.util.ArrayList;
import java.util.List;

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
    /** 登录 */
    private TextView btm_login;
    /** 记住密码 */
    private CheckBox cb_rememberAccount;
    /** 用户名 */
    private TextView tie_username;
    /** 密码 */
    private TextView tie_pw;
    /** 设置 */
    private TextView tv_setting;
    /** 下拉 */
    private ImageView ivSpring;
    /** 历史登录用户 */
//    List<AccountEntity> users = new ArrayList<>();
    /** 弹出框 */
//    private SpinnerPopWindow accountPopup;
    /** 父布局 */
    private LinearLayout input_account;
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
        tv_setting=findViewById(R.id.tv_setting);
        btm_login=findViewById(R.id.btm_login);
        cb_rememberAccount=findViewById(R.id.cb_rememberAccount);
        tie_username=findViewById(R.id.tie_username);
        tie_pw=findViewById(R.id.tie_pw);
        ivSpring=findViewById(R.id.ivSpring);
        input_account=findViewById(R.id.input_account);
    }

    @Override
    public void clicks() {
        btm_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(tie_username.getText().toString().trim())){
//                    Toasty.error(LoginActivity.this,"请输入用户名").show();
                    Toast.makeText(LoginActivity.this,"请输入用户名",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(tie_pw.getText().toString().trim())){
//                    Toasty.error(LoginActivity.this,"请输入密码").show();
                    Toast.makeText(LoginActivity.this,"请输入密码",Toast.LENGTH_SHORT).show();
                    return;
                }
                mPresenter.login(tie_username.getText().toString().trim(),tie_pw.getText().toString().trim());
            }
        });
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
