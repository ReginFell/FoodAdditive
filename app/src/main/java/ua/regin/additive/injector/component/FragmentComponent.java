package ua.regin.additive.injector.component;

import dagger.Component;
import ua.regin.additive.injector.component.subcomponent.PresenterSubcomponent;
import ua.regin.additive.injector.module.AdditiveModule;
import ua.regin.additive.injector.scope.FragmentScope;

@FragmentScope
@Component(dependencies = {AppComponent.class})
public interface FragmentComponent extends AppComponent {

    PresenterSubcomponent plus(AdditiveModule additiveModule);

}
