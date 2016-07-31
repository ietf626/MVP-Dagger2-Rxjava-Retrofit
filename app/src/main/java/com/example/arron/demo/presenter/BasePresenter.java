package com.example.arron.demo.presenter;

import com.example.arron.demo.AndroidApplication;
import com.example.arron.demo.data.ApiService;
import com.example.arron.demo.view.BaseView;

import javax.inject.Inject;

/**
 * Created by Arron on 16/7/26.
 */
public class BasePresenter implements Presenter {
    protected BaseView mView;
    @Inject
    ApiService apiService;

    public BasePresenter() {
        AndroidApplication.getComponent().inject(this);
    }

    protected ApiService getApiService() {
        return apiService;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void requestData(Object... o) {

    }
}
