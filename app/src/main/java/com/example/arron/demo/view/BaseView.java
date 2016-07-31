/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 *
 * @author Fernando Cejas (the android10 coder)
 */
package com.example.arron.demo.view;


import java.util.List;

public interface BaseView {
    void showLoading();

    void showEmptyView(String msg);

    void refreshView();

    void showNetError();


    void hasNoMoreData();

    void loadMoreFinish(List dates);

    void showRefreshFinish(List score);

    void showToastError();
}
