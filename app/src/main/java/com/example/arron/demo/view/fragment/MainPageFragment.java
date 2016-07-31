package com.example.arron.demo.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.arron.demo.R;
import com.example.arron.demo.domain.HomeEntity;
import com.example.arron.demo.presenter.Presenter;
import com.example.arron.demo.view.adapter.HomeRecyclerViewAdapter;
import com.example.arron.demo.view.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by Arron on 16/6/29.
 */
public class MainPageFragment extends BaseFragment {
    @Bind(R.id.container)
    RecyclerView container;
    private List<HomeEntity> mData = new ArrayList<HomeEntity>();
    private HomeRecyclerViewAdapter adapter;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        initAdapter();
        setListener();
    }

    private void initAdapter() {
        adapter = new HomeRecyclerViewAdapter(mData);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_BOTTOM);
        container.setLayoutManager(new LinearLayoutManager(getContext()));
        container.setAdapter(adapter);
    }

    private void setListener() {

    }

    @Override
    protected void initData() {
        HomeEntity homeEntity;
        homeEntity = new HomeEntity();
        homeEntity.setItemType(HomeEntity.TYPE_1);
        mData.add(homeEntity);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void loadData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main_page;
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
}
