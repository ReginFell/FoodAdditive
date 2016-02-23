package ua.regin.additive.injector.module;

import dagger.Module;
import dagger.Provides;
import ua.regin.additive.injector.scope.FragmentScope;
import ua.regin.additive.ui.mvp.IView;

@Module
public class FragmentModule {

    private IView view;

    public FragmentModule(IView view) {
        this.view = view;
    }

    @Provides
    protected IView provideView() {
        return view;
    }
}
