package com.example.arron.demo.view.activity;

import android.content.Intent;

import com.example.arron.demo.R;
import com.example.arron.demo.config.Constants;
import com.example.arron.demo.view.base.AppActivity;
import com.example.arron.demo.view.base.BaseFragment;
import com.example.arron.demo.view.fragment.UserDetailFragment;

public class UserDetailsActivity extends AppActivity {
    private String userId;

    @Override
    protected BaseFragment getFirstFragment() {
        return UserDetailFragment.getInstance(userId);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void handleIntent(Intent intent) {
        if (null == intent)
            return;
        userId = intent.getStringExtra(Constants.USER_ID);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_user_details;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.content;
    }
}
