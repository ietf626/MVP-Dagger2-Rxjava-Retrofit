    package com.example.arron.demo.view.base;

    import android.content.Intent;
    import android.os.Bundle;

    import com.example.arron.demo.AndroidApplication;

    /**
     * Created by Arron on 16/6/29.
     */

    public abstract class AppActivity extends BaseActivity {

        /**
         * 获取第一个fragment  如果没有返回null即可
         */
        protected abstract BaseFragment getFirstFragment();

        /**
         * 处理Intent
         *
         * @param intent
         */
        protected void handleIntent(Intent intent) {
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(getContentViewId());
            AndroidApplication.getComponent().inject(this);
            if (null != getIntent()) {
                handleIntent(getIntent());
            }
            initView();
            initData();
            //避免重复添加Fragment
            if (null == getSupportFragmentManager().getFragments()) {
                BaseFragment firstFragment = getFirstFragment();
                if (null != firstFragment) {
                    addFragment(firstFragment);
                }
            }
        }

        /**
         * 初始化data
         */
        protected abstract void initData();

        /**
         * 初始化view
         */
        protected abstract void initView();

    }