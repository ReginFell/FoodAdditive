package ua.regin.additive.ui.fragment.aditive.mvp;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import ua.regin.additive.ui.mvp.impl.BasePresenter;

public class AdditiveListPresenter extends BasePresenter<IAdditiveListView> implements IAdditiveListPresenter {

    private IAdditiveListView view;

    public AdditiveListPresenter(IAdditiveListView view) {
        super(view);
        this.view = view;
    }

    @Override
    public void test() {

    }
}
