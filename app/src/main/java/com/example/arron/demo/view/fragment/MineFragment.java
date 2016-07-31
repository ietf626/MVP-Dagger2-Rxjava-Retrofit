    package com.example.arron.demo.view.fragment;

    import android.os.Bundle;
    import android.view.View;

    import com.example.arron.demo.R;
    import com.example.arron.demo.presenter.Presenter;
    import com.example.arron.demo.view.base.BaseFragment;

    /**
     * Created by Arron on 16/6/29.
     */
    public class MineFragment extends BaseFragment {

        @Override
        protected void initView(View view, Bundle savedInstanceState) {

        }

        @Override
        protected void initData() {

        }

        @Override
        public void loadData() {

        }

        @Override
        protected int getLayoutId() {
            return R.layout.fragment_mine;
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
