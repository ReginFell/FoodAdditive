package ua.regin.additive.ui.mvp;

import android.content.Context;

public interface IView<D> {

    Context getContext();

    void handleError(Exception e);

    void setData(D d);

}
