package ua.regin.additive.ui.mvp.impl;

import android.os.Bundle;

import ua.regin.additive.app.Application;
import ua.regin.additive.injector.component.DaggerFragmentComponent;
import ua.regin.additive.injector.component.FragmentComponent;
import ua.regin.additive.ui.BaseFragment;
import ua.regin.additive.ui.mvp.IPresenter;
import ua.regin.additive.ui.mvp.IPresenterRegister;
import ua.regin.additive.ui.mvp.IView;

public class BaseMvpFragment<P extends IPresenter> extends BaseFragment implements IPresenterRegister<P> {

    private P presenter;

    private FragmentComponent fragmentComponent;

    protected FragmentComponent injectComponent() {
        fragmentComponent = DaggerFragmentComponent.builder()
                .appComponent(Application.getApplication().getAppComponent())
                .build();
        return fragmentComponent;
    }

    @Override
    public P registerPresenter(P presenter) {
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

    public void handleError(Exception e) {

    }
}
