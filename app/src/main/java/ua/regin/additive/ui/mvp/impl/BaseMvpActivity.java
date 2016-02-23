package ua.regin.additive.ui.mvp.impl;

import android.content.Context;
import android.os.Bundle;

import ua.regin.additive.ui.BaseActivity;
import ua.regin.additive.ui.mvp.IPresenter;
import ua.regin.additive.ui.mvp.IPresenterRegister;

public class BaseMvpActivity extends BaseActivity implements IPresenterRegister<IPresenter> {
    private IPresenter presenter;

    @Override
    public IPresenter registerPresenter(IPresenter presenter) {
        this.presenter = presenter;
        return presenter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter != null) {
            presenter.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.onDestroy();
        }
    }
}
