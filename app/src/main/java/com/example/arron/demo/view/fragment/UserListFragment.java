package com.example.arron.demo.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.arron.demo.R;
import com.example.arron.demo.domain.User;
import com.example.arron.demo.presenter.UserListPresenter;
import com.example.arron.demo.view.UserListView;
import com.example.arron.demo.view.adapter.UsersAdapter;
import com.example.arron.demo.view.base.BaseFragment;

import java.util.Collection;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Arron on 16/7/26.
 */
public class UserListFragment extends BaseFragment<UserListPresenter> implements UserListView {
    @Inject
    UsersAdapter usersAdapter;
    @Bind(R.id.rv_users)
    RecyclerView rv_users;
    private UsersAdapter.OnItemClickListener onItemClickListener =
            new UsersAdapter.OnItemClickListener() {
                @Override
                public void onUserItemClicked(User userModel) {
                    if (mPresenter != null && userModel != null) {
                        ((UserListPresenter) mPresenter).onUserClicked(userModel);
                    }
                }
            };

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        usersAdapter = new UsersAdapter(mActivity);
        setupRecyclerView();
    }

    @Override
    protected void initData() {
        mPresenter.requestData();
    }

    @Override
    public void loadData() {

    }

    private void setupRecyclerView() {
        this.usersAdapter.setOnItemClickListener(onItemClickListener);
        this.rv_users.setLayoutManager(new LinearLayoutManager(mActivity));
        this.rv_users.setAdapter(usersAdapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user_list;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }

    @Override
    protected UserListPresenter getChildPresenter() {
        return new UserListPresenter(this);
    }

    @Override
    protected View getLoaingTargetView() {
        return rv_users;
    }

    @Override
    public void renderUserList(Collection<User> userModelCollection) {
        if (userModelCollection != null) {
            this.usersAdapter.setUsersCollection(userModelCollection);
        }
    }

    @Override
    public void viewUser(User user) {
        if (mActivity instanceof UserListListener)
            ((UserListListener) mActivity).onUserClicked(user);
    }

    public interface UserListListener {
        void onUserClicked(final User userModel);
    }
}
