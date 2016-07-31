package com.example.arron.demo.view.fragment;

import android.os.Bundle;
import android.view.View;

import com.example.arron.demo.R;
import com.example.arron.demo.presenter.Presenter;
import com.example.arron.demo.view.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Arron on 16/6/29.
 */
public class WantingFragment extends BaseFragment {
    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wanting;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }

    @Override
    protected Presenter getChildPresenter() {
        return null;
    }

    @Override
    protected View getLoaingTargetView() {
        return null;
    }

    @OnClick(R.id.go)
    public void go() {
        mActivity.navigator.toUserList(mActivity);
    }
}
