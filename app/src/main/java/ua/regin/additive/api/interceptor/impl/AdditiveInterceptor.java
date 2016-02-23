package ua.regin.additive.api.interceptor.impl;


import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import ua.regin.additive.api.IApi;
import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.entity.Additive;

public class AdditiveInterceptor implements IAdditiveInterceptor {

    private IApi api;

    public AdditiveInterceptor(IApi api) {
        this.api = api;
    }

    @Override
    public Observable<List<Additive>> getAdditiveList() {
        return api.getAdditiveList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
