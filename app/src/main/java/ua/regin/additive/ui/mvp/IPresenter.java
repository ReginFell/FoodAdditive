package ua.regin.additive.ui.mvp;

import android.os.Bundle;

public interface IPresenter {

    void onCreate(Bundle savedInstanceState);

    void onResume();

    void onPause();

    void onDestroy();

}
