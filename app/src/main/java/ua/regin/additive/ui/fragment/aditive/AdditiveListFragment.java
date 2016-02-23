package ua.regin.additive.ui.fragment.aditive;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import javax.inject.Inject;

import ua.regin.additive.R;
import ua.regin.additive.entity.Additive;
import ua.regin.additive.injector.module.PresenterModule;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListPresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListView;
import ua.regin.additive.ui.mvp.impl.BaseMvpFragment;

@EFragment(R.layout.fragment_additive_list)
public class AdditiveListFragment extends BaseMvpFragment<IAdditiveListPresenter> implements IAdditiveListView<List<Additive>> {

    @Inject
    protected IAdditiveListPresenter presenter;

    @ViewById
    protected RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectComponent(this).plus(new PresenterModule()).inject(this);
        presenter.getAdditiveList();
    }

    @Override
    public void setData(List<Additive> additiveList) {
        Toast.makeText(getContext(), "ok", Toast.LENGTH_LONG).show();
    }
}
