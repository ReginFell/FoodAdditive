package ua.regin.additive.ui.mvp;

import android.os.Bundle;

public interface IPresenter<TPresenterView> {

    void onCreate(Bundle savedInstanceState);

    void onDestroy();

}
