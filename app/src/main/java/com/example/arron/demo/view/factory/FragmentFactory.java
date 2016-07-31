package com.example.arron.demo.view.factory;


import android.util.SparseArray;

import com.example.arron.demo.view.base.BaseFragment;
import com.example.arron.demo.view.fragment.MainPageFragment;
import com.example.arron.demo.view.fragment.MessageFragment;
import com.example.arron.demo.view.fragment.MineFragment;
import com.example.arron.demo.view.fragment.WantingFragment;

import java.lang.ref.SoftReference;

/**
 * Created by Arron on 16/6/29.
 */
public class FragmentFactory {
    private static SparseArray<SoftReference<BaseFragment>> arr = new SparseArray<SoftReference<BaseFragment>>();

    public static BaseFragment getFragment(int pos) {
        BaseFragment fragment = null;
        if (null != arr.get(pos))
            fragment = arr.get(pos).get();
        if (null == fragment) {
            switch (pos) {
                case 0:
                    fragment = new MainPageFragment();
                    break;
                case 1:
                    fragment = new WantingFragment();
                    break;
                case 2:
                    fragment = new MessageFragment();
                    break;
                case 3:
                    fragment = new MineFragment();
                    break;
            }
            arr.put(0, new SoftReference<BaseFragment>(fragment));
        }
        return fragment;
    }
}
