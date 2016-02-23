package ua.regin.additive.ui.mvp.impl;

import android.os.Bundle;

import ua.regin.additive.ui.BaseFragment;
import ua.regin.additive.ui.mvp.IPresenter;
import ua.regin.additive.ui.mvp.IView;

public class BaseMvpFragment extends BaseFragment implements IView<IPresenter> {

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
