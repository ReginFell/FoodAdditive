package ua.regin.additive.injector.component.subcomponent;

import dagger.Subcomponent;
import ua.regin.additive.injector.module.PresenterModule;
import ua.regin.additive.injector.scope.FragmentScope;
import ua.regin.additive.ui.fragment.aditive.AdditiveListFragment;

@FragmentScope
@Subcomponent(modules = PresenterModule.class)
public interface AdditiveSubcomponent {

    void inject(AdditiveListFragment additiveListFragment);

}