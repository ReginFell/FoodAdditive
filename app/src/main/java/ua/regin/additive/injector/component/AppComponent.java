package ua.regin.additive.injector.component;

import javax.inject.Singleton;

import dagger.Component;
import ua.regin.additive.api.IApi;
import ua.regin.additive.api.interceptor.impl.AdditiveInterceptor;
import ua.regin.additive.injector.module.ApiModule;
import ua.regin.additive.injector.module.AppModule;
import ua.regin.additive.ui.fragment.aditive.mvp.AdditiveListPresenter;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {

    void inject(AdditiveListPresenter additiveListPresenter);

    void inject(AdditiveInterceptor additiveInterceptor);

    IApi provideApi();

}