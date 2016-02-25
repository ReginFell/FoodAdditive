package ua.regin.additive.ui.fragment.aditive.mvp;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.entity.Additive;
import ua.regin.additive.ui.mvp.impl.BasePresenter;

public class AdditivePresenter extends BasePresenter<IAdditiveView<List<Additive>>> implements IAdditivePresenter {

    private IAdditiveView<List<Additive>> view;

    protected IAdditiveInterceptor additiveInterceptor;

    public AdditivePresenter(IAdditiveView<List<Additive>> view, IAdditiveInterceptor additiveInterceptor) {
        super(view);
        this.view = view;
        this.additiveInterceptor = additiveInterceptor;
    }

    @Override
    public void onDestroy() {
        Log.d("onDestroy", "onDestroy");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("onCreate", "onCreate");
    }

    @Override
    public void onResume() {
        Log.d("onResume", "onResume");
    }

    @Override
    public void onPause() {
        Log.d("onPause", "onPause");
    }

    @Override
    public void getAdditiveList() {
        additiveInterceptor.getAdditiveList().subscribe(data -> view.setData(data));
    }
}
