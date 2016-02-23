package ua.regin.additive.ui.fragment.aditive;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import ua.regin.additive.R;
import ua.regin.additive.ui.fragment.aditive.mvp.AdditiveListPresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListPresenter;
import ua.regin.additive.ui.fragment.aditive.mvp.IAdditiveListView;
import ua.regin.additive.ui.mvp.impl.BaseMvpFragment;

@EFragment(R.layout.fragment_additive_list)
public class AdditiveListFragment extends BaseMvpFragment<IAdditiveListPresenter> implements IAdditiveListView<List<String>> {

    private IAdditiveListPresenter presenter;

    public AdditiveListFragment() {
        presenter = registerPresenter(new AdditiveListPresenter(this));
    }

    @ViewById
    protected RecyclerView recyclerView;

    @Override
    public void setData(List<String> o) {

    }
}
