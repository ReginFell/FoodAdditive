package ua.regin.additive.ui.mvp.impl;

import android.os.Bundle;

import ua.regin.additive.ui.mvp.IPresenter;
import ua.regin.additive.ui.mvp.IView;

public class BasePresenter<V extends IView> implements IPresenter {

    private V view;

    public BasePresenter(V view) {
        this.view = view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

    }

    @Override
    public void onDestroy() {

    }

    public V getView() {
        return view;
    }
}
