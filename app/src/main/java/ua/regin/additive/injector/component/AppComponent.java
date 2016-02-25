package ua.regin.additive.injector.component;

import javax.inject.Singleton;

import dagger.Component;
import ua.regin.additive.api.IApi;
import ua.regin.additive.injector.module.ApiModule;
import ua.regin.additive.injector.module.AppModule;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {

    IApi provideApi();

}