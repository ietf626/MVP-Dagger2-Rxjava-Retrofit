package com.example.arron.demo.view.navigation;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.example.arron.demo.config.Constants;
import com.example.arron.demo.view.activity.UserDetailsActivity;
import com.example.arron.demo.view.activity.UserListActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Arron on 16/7/26.
 */
@Singleton
public class Navigator {
    @Inject
    public Navigator() {
    }

    public void toUserDetail(Context context, String userId) {
        if (null == context || TextUtils.isEmpty(userId))
            return;
        Intent intent = new Intent(context, UserDetailsActivity.class);
        intent.putExtra(Constants.USER_ID, userId);
        context.startActivity(intent);
    }

    public void toUserList(Context context) {
        Intent intent = new Intent(context, UserListActivity.class);
        context.startActivity(intent);
    }
}
