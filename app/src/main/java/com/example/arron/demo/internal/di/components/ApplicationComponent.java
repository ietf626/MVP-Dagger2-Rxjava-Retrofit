package com.example.arron.demo.internal.di.components;

import android.content.Context;

import com.example.arron.demo.data.ApiService;
import com.example.arron.demo.internal.di.modules.ApiServiceModule;
import com.example.arron.demo.internal.di.modules.ApplicationModule;
import com.example.arron.demo.presenter.BasePresenter;
import com.example.arron.demo.view.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Arron on 16/7/25.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiServiceModule.class})
public interface ApplicationComponent {
    void inject(BasePresenter presenter);

    void inject(BaseActivity activity);

    Context context();

    ApiService apiService();
}
