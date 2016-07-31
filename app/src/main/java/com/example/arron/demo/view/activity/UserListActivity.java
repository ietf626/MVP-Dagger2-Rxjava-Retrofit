package com.example.arron.demo.view.activity;

import com.example.arron.demo.R;
import com.example.arron.demo.domain.User;
import com.example.arron.demo.view.base.AppActivity;
import com.example.arron.demo.view.base.BaseFragment;
import com.example.arron.demo.view.fragment.UserListFragment;

public class UserListActivity extends AppActivity implements UserListFragment.UserListListener {

    @Override
    protected int getContentViewId() {
        return R.layout.activity_user_list;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.content;
    }

    @Override
    protected BaseFragment getFirstFragment() {
        return new UserListFragment();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public void onUserClicked(User userModel) {
        if (null == userModel)
            return;
        navigator.toUserDetail(this, String.valueOf(userModel.getUserId()));
    }
}
