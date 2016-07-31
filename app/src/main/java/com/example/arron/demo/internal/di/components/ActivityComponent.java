package com.example.arron.demo.internal.di.components;

import android.app.Activity;

import com.example.arron.demo.internal.di.PerActivity;
import com.example.arron.demo.internal.di.modules.ActivityModule;

import dagger.Component;

/**
 * Created by Arron on 16/7/25.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
