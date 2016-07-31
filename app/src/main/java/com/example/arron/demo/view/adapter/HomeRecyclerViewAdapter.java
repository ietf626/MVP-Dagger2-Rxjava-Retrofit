package com.example.arron.demo.view.adapter;

import android.view.View;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.arron.demo.R;
import com.example.arron.demo.domain.HomeEntity;
import com.example.arron.demo.view.component.MainPageItemView;

import java.util.List;

import butterknife.Bind;


/**
 * Created by Arron on 16/6/30.
 */
public class HomeRecyclerViewAdapter extends BaseMultiItemQuickAdapter<HomeEntity> {
    @Bind(R.id.home_item_1)
    MainPageItemView item1;
    @Bind(R.id.home_item_2)
    MainPageItemView item2;
    @Bind(R.id.home_item_3)
    MainPageItemView item3;
    @Bind(R.id.home_item_4)
    MainPageItemView item4;

    public HomeRecyclerViewAdapter(List<HomeEntity> data) {
        super(data);
        addItemType(HomeEntity.TYPE_1, R.layout.item_home_top_items);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeEntity item) {
        switch (helper.getItemViewType()) {
            case HomeEntity.TYPE_1:
                setData(helper, item);
                break;
            case HomeEntity.TYPE_2:
                break;
            case HomeEntity.TYPE_3:
                break;
        }
    }

    private void setData(BaseViewHolder helper, HomeEntity item) {
        MainPageItemView item1 = helper.getView(R.id.home_item_1);
        MainPageItemView item2 = helper.getView(R.id.home_item_2);
        MainPageItemView item3 = helper.getView(R.id.home_item_3);
        MainPageItemView item4 = helper.getView(R.id.home_item_4);
        item1.setOnLeftClickListener(new MainPageItemView.onLeftClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item1.setOnMiddleTopClickListener(new MainPageItemView.onMiddleTopClickListener() {

            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item1.setOnMiddleBottomClickListener(new MainPageItemView.onMiddleBottomClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item1.setOnRightBottomClickListener(new MainPageItemView.onRightBottomClickListener() {

            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item1.setOnRightTopClickListener(new MainPageItemView.onRightTopClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });

        item2.setOnLeftClickListener(new MainPageItemView.onLeftClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item2.setOnMiddleTopClickListener(new MainPageItemView.onMiddleTopClickListener() {

            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item2.setOnMiddleBottomClickListener(new MainPageItemView.onMiddleBottomClickListener() {

            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item2.setOnRightBottomClickListener(new MainPageItemView.onRightBottomClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item2.setOnRightTopClickListener(new MainPageItemView.onRightTopClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });

        item3.setOnLeftClickListener(new MainPageItemView.onLeftClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item3.setOnMiddleTopClickListener(new MainPageItemView.onMiddleTopClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item3.setOnMiddleBottomClickListener(new MainPageItemView.onMiddleBottomClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item3.setOnRightBottomClickListener(new MainPageItemView.onRightBottomClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item3.setOnRightTopClickListener(new MainPageItemView.onRightTopClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });

        item4.setOnLeftClickListener(new MainPageItemView.onLeftClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item4.setOnMiddleTopClickListener(new MainPageItemView.onMiddleTopClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item4.setOnMiddleBottomClickListener(new MainPageItemView.onMiddleBottomClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item4.setOnRightBottomClickListener(new MainPageItemView.onRightBottomClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
        item4.setOnRightTopClickListener(new MainPageItemView.onRightTopClickListener() {
            @Override
            public void onActionUp(View v, int pos) {

            }
        });
    }
}
