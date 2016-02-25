package ua.regin.additive.ui.mvp.impl;

import android.os.Bundle;

import ua.regin.additive.ui.mvp.IPresenter;
import ua.regin.additive.ui.mvp.IView;

public abstract class BasePresenter<V extends IView> implements IPresenter {

    public BasePresenter(V v) {

    }
}
