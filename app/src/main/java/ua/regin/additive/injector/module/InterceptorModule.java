package ua.regin.additive.injector.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ua.regin.additive.api.IApi;
import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.api.interceptor.impl.AdditiveInterceptor;
import ua.regin.additive.injector.scope.FragmentScope;

@Module
public class InterceptorModule {

    @Provides
    protected IAdditiveInterceptor provideAdditiveInterceptor(IApi api) {
        return new AdditiveInterceptor(api);
    }
}