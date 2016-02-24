package ua.regin.additive.ui.fragment.aditive.mvp;

import ua.regin.additive.api.interceptor.IAdditiveInterceptor;
import ua.regin.additive.ui.mvp.IView;
import ua.regin.additive.ui.mvp.impl.BasePresenter;

public class AdditiveListPresenter extends BasePresenter<IAdditiveListView> implements IAdditiveListPresenter {

    protected IAdditiveInterceptor additiveInterceptor;

    public AdditiveListPresenter(IAdditiveListView view, IAdditiveInterceptor additiveInterceptor) {
        super(view);
        this.additiveInterceptor = additiveInterceptor;
    }

    @Override
    public void getAdditiveList() {
        additiveInterceptor.getAdditiveList().subscribe(data -> getView().setData(data));
    }
}
