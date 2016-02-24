package ua.regin.additive.injector.component;

import dagger.Component;
import ua.regin.additive.injector.component.subcomponent.AdditiveSubcomponent;
import ua.regin.additive.injector.module.FragmentModule;
import ua.regin.additive.injector.module.InterceptorModule;
import ua.regin.additive.injector.module.PresenterModule;
import ua.regin.additive.injector.scope.FragmentScope;

@FragmentScope
@Component(dependencies = {AppComponent.class}, modules = {FragmentModule.class, InterceptorModule.class})
public interface FragmentComponent extends AppComponent {

    AdditiveSubcomponent plus(PresenterModule presenterModule);

}
