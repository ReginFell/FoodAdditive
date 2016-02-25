package ua.regin.additive.injector.module;

import java.util.List;

import dagger.Module;
import dagger.Provides;
import ua.regin.additive.api.IApi;
import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.api.interceptor.impl.AdditiveInterceptor;
import ua.regin.additive.entity.Additive;
import ua.regin.additive.injector.scope.FragmentScope;
import ua.regin.additive.ui.fragment.aditive.mvp.AdditivePresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditivePresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveView;

@Module
public class AdditiveModule {

    private IAdditiveView<List<Additive>> view;

    public AdditiveModule(IAdditiveView<List<Additive>> view) {
        this.view = view;
    }

    @Provides
    protected IAdditiveInterceptor provideAdditiveInterceptor(IApi api) {
        return new AdditiveInterceptor(api);
    }

    @Provides
    protected IAdditivePresenter provideAdditivePresenter(IAdditiveInterceptor additiveInterceptor) {
        return new AdditivePresenter(view, additiveInterceptor);
    }
}
