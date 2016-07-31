package com.example.arron.demo.presenter;

import android.text.TextUtils;

import com.example.arron.demo.domain.User;
import com.example.arron.demo.rx.DefaultSubscriber;
import com.example.arron.demo.view.UserDetailsView;
import com.example.arron.demo.view.base.BaseFragment;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Arron on 16/7/26.
 */
public class UserDetailPresenter extends BasePresenter {

    private Subscription subscription;

    public UserDetailPresenter(UserDetailsView view) {
        mView = view;
    }

    @Override
    public void requestData(Object... o) {
        if (o == null)
            return;
        String userId = (String) o[0];
        if (TextUtils.isEmpty(userId))
            return;
        mView.showLoading();
        subscription = apiService.getUser(userId).compose(((BaseFragment) mView).<User>bindToLifecycle()).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new UserDetailSubscriber());
    }

    @Override
    public void destroy() {
        super.destroy();
        subscription.unsubscribe();
    }

    public class UserDetailSubscriber extends DefaultSubscriber<User> {
        @Override
        public void onNext(User user) {
            if (user == null)
                mView.showEmptyView("无数据！");
            else {
                mView.refreshView();
                ((UserDetailsView) mView).renderUser(user);
            }
        }

        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            mView.showNetError();
        }
    }
}
