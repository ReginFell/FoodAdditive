package ua.regin.additive.injector.module;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule<V> {

    private V view;

    public FragmentModule(V view) {
        this.view = view;
    }

    @Provides
    protected V provideView() {
        return view;
    }
}
