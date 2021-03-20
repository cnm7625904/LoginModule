package com.example.loginmodule.login.mvp;

import com.cdwang.httpmodule.http.CommonSubscriber;
import com.cdwang.httpmodule.http.RxTool;
import com.example.basemodule.base.baseView.Rxpresenter;
import com.example.basemodule.base.basebean.BaseResponse;
import com.example.loginmodule.login.module.LoginModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.LongConsumer;
import io.reactivex.schedulers.Schedulers;

/**
 * copyright (C), 2021, 运达科技有限公司
 * fileName LoginPresenter
 *
 * @author 王玺权
 * date 2021-03-09 19:30
 * description
 * history
 */
public class LoginPresenter extends Rxpresenter<LoginContact.loginIml> implements LoginContact.preseter {

    @Override
    public void login(String userName,String passWord) {
        addSubscribe(LoginModel.getInstance().login("http://139.9.246.226:8081/DTCG/app/appLogin.action", userName, passWord)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new CommonSubscriber<BaseResponse>(mView) {
                    @Override
                    public void onNext(BaseResponse baseResponse) {
                        mView.showNormalMsg("登录成功！");
                    }
                }));



//        addSubscribe(
//        LoginModel.getInstance().login("http://139.9.246.226:8081/DTCG/app/appLogin.action","01010002277","123")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
////                .compose(RxT)
//                .compose(RxTool.rxSchedulerHelper(mView))
//                .doOnRequest(new LongConsumer() {
//                    @Override
//                    public void accept(long t) throws Exception {
//                    }
//                })
//                .subscribeWith(new CommonSubscriber<BaseResponse>(mView) {
//                    @Override
//                    public void onNext(BaseResponse baseResponse) {
//                        mView.showNormalMsg("登录成功！");mView.loginSuccess();
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        super.onComplete();
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        super.onError(e);
//                    }
//                }));
    }
}
