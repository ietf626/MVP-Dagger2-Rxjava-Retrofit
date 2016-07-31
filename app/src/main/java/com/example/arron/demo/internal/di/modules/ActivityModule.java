package com.example.arron.demo.internal.di.modules;

import android.app.Activity;

import com.example.arron.demo.internal.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Arron on 16/7/25.
 */
@PerActivity
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    protected Activity provideActivity() {
        return this.activity;
    }
}
