package ua.regin.additive.ui.fragment.aditive.mvp;

import android.os.Bundle;
import android.widget.Toast;

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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(view.getContext(), "Test", Toast.LENGTH_LONG).show();
    }
}
