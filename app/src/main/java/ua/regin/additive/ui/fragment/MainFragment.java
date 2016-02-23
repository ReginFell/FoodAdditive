package ua.regin.additive.ui.fragment;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import ua.regin.additive.R;
import ua.regin.additive.ui.BaseFragment;
import ua.regin.additive.ui.adapter.DrawablePageAdapter;
import ua.regin.additive.util.TabLayoutHelper;

@EFragment(R.layout.fragment_main)
public class MainFragment extends BaseFragment {

    @ViewById
    protected TabLayout tabLayout;

    @ViewById
    protected ViewPager viewPager;

    @AfterViews
    protected void afterViews() {
        viewPager.setAdapter(new DrawablePageAdapter(getChildFragmentManager()));
        tabLayout.setTabTextColors(Color.WHITE, ContextCompat.getColor(getContext(), R.color.colorAccent));
        TabLayoutHelper.setupWithViewPager(tabLayout, viewPager);
        viewPager.setCurrentItem(1);
    }
}
