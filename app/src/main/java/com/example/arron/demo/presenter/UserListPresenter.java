package com.example.arron.demo.presenter;

import com.example.arron.demo.domain.User;
import com.example.arron.demo.rx.DefaultSubscriber;
import com.example.arron.demo.view.UserListView;
import com.example.arron.demo.view.base.BaseFragment;

import java.util.List;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Arron on 16/7/26.
 */
public class UserListPresenter extends BasePresenter {
    private UserListView mView;
    private Subscription subscription;

    public UserListPresenter(UserListView view) {
        mView = view;
    }

    @Override
    public void requestData(Object... o) {
        mView.showLoading();
        subscription = apiService.getUserList().compose(((BaseFragment) mView).<List<User>>bindToLifecycle()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new UserListSubscriber());
    }

    public void onUserClicked(User userModel) {
        mView.viewUser(userModel);
    }

    @Override
    public void destroy() {
        super.destroy();
        if (subscription != null)
            subscription.unsubscribe();
    }

    public class UserListSubscriber extends DefaultSubscriber<List<User>> {
        @Override
        public void onNext(List<User> users) {
            if (users == null || users.size() == 0)
                mView.showEmptyView("无数据！");
            else {
                mView.refreshView();
                mView.renderUserList(users);
            }
        }

        @Override
        public void onError(Throwable e) {
            mView.showNetError();
        }
    }
}
