package com.example.arron.demo.presenter;

/**
 * Created by Arron on 16/7/26.
 */
public interface Presenter {
    void resume();

    void pause();

    void destroy();

    void requestData(Object... o);

}
