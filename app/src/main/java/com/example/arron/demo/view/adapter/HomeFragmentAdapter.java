package com.example.arron.demo.view.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.arron.demo.view.base.BaseFragment;
import com.example.arron.demo.view.factory.FragmentFactory;


/**
 * Created by Arron on 16/6/29.
 */
public class HomeFragmentAdapter extends FragmentPagerAdapter {
    private int count;

    public HomeFragmentAdapter(FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }

    @Override
    public BaseFragment getItem(int position) {
        return FragmentFactory.getFragment(position);
    }

    @Override
    public int getCount() {
        return count;
    }
}
