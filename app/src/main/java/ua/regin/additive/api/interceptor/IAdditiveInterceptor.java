package ua.regin.additive.api.interceptor;

import java.util.List;

import rx.Observable;
import ua.regin.additive.entity.Additive;

public interface IAdditiveInterceptor {
    Observable<List<Additive>> getAdditiveList();
}
