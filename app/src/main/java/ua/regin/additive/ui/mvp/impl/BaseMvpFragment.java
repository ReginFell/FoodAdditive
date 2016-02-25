package ua.regin.additive.ui.mvp.impl;

import android.os.Bundle;

import ua.regin.additive.app.Application;
import ua.regin.additive.injector.component.DaggerFragmentComponent;
import ua.regin.additive.injector.component.FragmentComponent;
import ua.regin.additive.ui.BaseFragment;
import ua.regin.additive.ui.mvp.IPresenter;
import ua.regin.additive.ui.mvp.IPresenterRegister;

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
    public void bindToLifecycle(P presenter) {
        this.presenter = presenter;
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

    @Override
    public void onPause() {
        super.onPause();
        if (presenter != null) {
            presenter.onPause();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (presenter != null) {
            presenter.onResume();
        }
    }

    public void handleError(Exception e) {

    }
}
