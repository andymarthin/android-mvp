package id.web.marthin.androidmvp.views.main;

import id.web.marthin.androidmvp.model.Data;
import id.web.marthin.androidmvp.views.base.View;

/**
 * Created by mcspicy on 19/9/17.
 */

public interface MainView extends View {
    void onShowFragment(Data data);
}
