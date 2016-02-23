package ua.regin.additive.ui.adapter;

import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ua.regin.additive.R;
import ua.regin.additive.ui.fragment.aditive.AdditiveListFragment_;
import ua.regin.additive.util.TabLayoutHelper;

public class DrawablePageAdapter extends FragmentPagerAdapter implements TabLayoutHelper.IconPagerAdapter {

    public DrawablePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getPageTitleIconRes(int position) {
        @DrawableRes int drawableRes;
        switch (position) {
            case 0:
                drawableRes = R.drawable.ic_search;
                break;
            case 1:
                drawableRes = R.drawable.ic_format_list;
                break;
            case 2:
                drawableRes = R.drawable.ic_check_circle;
                break;
            case 3:
                drawableRes = R.drawable.ic_error_outline;
                break;
            default:
                throw new RuntimeException("Icon not implemented for this position");

        }
        return drawableRes;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = AdditiveListFragment_.builder().build();
                break;
            case 1:
                fragment = AdditiveListFragment_.builder().build();
                break;
            case 2:
                fragment = AdditiveListFragment_.builder().build();
                break;
            case 3:
                fragment = AdditiveListFragment_.builder().build();
                break;
            default:
                throw new RuntimeException("Not implemented fragment position");
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}