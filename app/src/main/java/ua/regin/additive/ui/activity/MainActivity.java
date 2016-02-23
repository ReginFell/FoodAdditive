package ua.regin.additive.ui.activity;

import android.os.Bundle;

import org.androidannotations.annotations.EActivity;

import ua.regin.additive.R;
import ua.regin.additive.ui.BaseActivity;
import ua.regin.additive.ui.fragment.MainFragment_;


@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment_.builder().build())
                    .commit();
        }
    }
}
