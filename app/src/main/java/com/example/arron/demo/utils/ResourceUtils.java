package com.example.arron.demo.utils;

import android.graphics.drawable.Drawable;

import com.example.arron.demo.AndroidApplication;

/**
 * Created by Arron on 16/7/25.
 */
public class ResourceUtils {
    public static String getString(int id) {
        return AndroidApplication.mContext.getResources().getString(id);
    }

    public static Drawable getDrawable(int id) {
        return AndroidApplication.mContext.getResources().getDrawable(id);
    }

}
