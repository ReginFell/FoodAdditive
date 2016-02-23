package ua.regin.additive.app;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
import ua.regin.additive.R;
import ua.regin.additive.injector.component.AppComponent;
import ua.regin.additive.injector.component.DaggerAppComponent;
import ua.regin.additive.injector.module.ApiModule;
import ua.regin.additive.injector.module.AppModule;

public class Application extends android.app.Application {

    private static final String BASE_URL = "http://skialz.ru//mobile/additive/api/";

    private static Application application;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        boolean useCrashlytics = getResources().getBoolean(R.bool.useCrashlytics);
        if (useCrashlytics) {
            Fabric.with(this, new Crashlytics());
        }
    }

    public static Application getApplication() {
        return application;
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .apiModule(new ApiModule(BASE_URL))
                    .build();
        }
        return appComponent;
    }
}
