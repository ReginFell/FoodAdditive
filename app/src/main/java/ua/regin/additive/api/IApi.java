package ua.regin.additive.api;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;
import ua.regin.additive.entity.Additive;

public interface IApi {

    @GET("getAdditive.php")
    Observable<List<Additive>> getAdditiveList();
}
