package com.example.arron.demo;

import android.app.Application;
import android.content.Context;

import com.example.arron.demo.internal.di.components.ApplicationComponent;
import com.example.arron.demo.internal.di.components.DaggerApplicationComponent;
import com.example.arron.demo.internal.di.modules.ApplicationModule;

/**
 * Created by Arron on 16/7/25.
 */
public class AndroidApplication extends Application {
    public static Context mContext;
    private ApplicationComponent mComponent;

    public static ApplicationComponent getComponent() {
        return ((AndroidApplication) mContext.getApplicationContext()).mComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        mComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

}
