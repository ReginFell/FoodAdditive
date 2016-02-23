package ua.regin.additive.injector.module;

import java.util.List;

import dagger.Module;
import dagger.Provides;
import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.entity.Additive;
import ua.regin.additive.injector.scope.FragmentScope;
import ua.regin.additive.ui.fragment.aditive.mvp.AdditiveListPresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListPresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListView;
import ua.regin.additive.ui.mvp.IView;

@Module
public class PresenterModule {

    @Provides
    protected IAdditiveListPresenter provideAdditiveListPresenter(IAdditiveInterceptor additiveInterceptor,IView view) {
        return new AdditiveListPresenter((IAdditiveListView<List<Additive>>) view,additiveInterceptor);
    }
}
