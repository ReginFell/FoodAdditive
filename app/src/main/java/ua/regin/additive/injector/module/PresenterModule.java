package ua.regin.additive.injector.module;

import dagger.Module;
import dagger.Provides;
import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.ui.fragment.aditive.mvp.AdditiveListPresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListPresenter;
import ua.regin.additive.ui.mvp.IView;

@Module
public class PresenterModule<T extends IView> {

    @Provides
    protected IAdditiveListPresenter provideAdditiveListPresenter(IAdditiveInterceptor additiveInterceptor, T view) {
        return new AdditiveListPresenter(view, additiveInterceptor);
    }

}
