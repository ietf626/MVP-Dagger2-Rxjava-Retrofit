package com.example.arron.demo.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.arron.demo.R;
import com.example.arron.demo.config.Constants;
import com.example.arron.demo.domain.User;
import com.example.arron.demo.presenter.UserDetailPresenter;
import com.example.arron.demo.view.UserDetailsView;
import com.example.arron.demo.view.base.BaseFragment;
import com.example.arron.demo.view.component.AutoLoadImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Arron on 16/7/26.
 */
public class UserDetailFragment extends BaseFragment<UserDetailPresenter> implements UserDetailsView {

    @Bind(R.id.iv_cover)
    AutoLoadImageView iv_cover;
    @Bind(R.id.tv_fullname)
    TextView tv_fullname;
    @Bind(R.id.tv_email)
    TextView tv_email;
    @Bind(R.id.tv_followers)
    TextView tv_followers;
    @Bind(R.id.tv_description)
    TextView tv_description;

    private String userId;

    public UserDetailFragment() {
    }

    public static UserDetailFragment getInstance(String param) {
        UserDetailFragment fragment = new UserDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.USER_ID, param);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
    }

    @Override
    protected void initData() {
        userId = getArguments().getString(Constants.USER_ID);
        mPresenter.requestData(userId);
    }

    @Override
    public void loadData() {

    }

    @Override
    protected String getRequestParams() {
        return userId;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user_details;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }

    @Override
    protected UserDetailPresenter getChildPresenter() {
        return new UserDetailPresenter(this);
    }

    @Override
    protected View getLoaingTargetView() {
        return iv_cover;
    }

    @Override
    public void renderUser(User user) {
        if (user != null) {
            this.iv_cover.setImageUrl(user.getCoverUrl());
            this.tv_fullname.setText(user.getFullName());
            this.tv_email.setText(user.getEmail());
            this.tv_followers.setText(String.valueOf(user.getFollowers()));
            this.tv_description.setText(user.getDescription());
        }
    }
}
