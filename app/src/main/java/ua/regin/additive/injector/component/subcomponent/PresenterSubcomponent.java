package ua.regin.additive.injector.component.subcomponent;

import dagger.Subcomponent;
import ua.regin.additive.injector.module.AdditiveModule;
import ua.regin.additive.injector.scope.FragmentScope;
import ua.regin.additive.ui.fragment.aditive.AdditiveListFragment;

@FragmentScope
@Subcomponent(modules = AdditiveModule.class)
public interface PresenterSubcomponent {

    void inject(AdditiveListFragment additiveListFragment);

}