package id.web.marthin.androidmvp.views.main;

import id.web.marthin.androidmvp.model.Data;
import id.web.marthin.androidmvp.views.base.Presenter;
import id.web.marthin.androidmvp.views.base.View;

/**
 * Created by mcspicy on 19/9/17.
 */

public class MainPresenter implements Presenter<MainView>{
    private MainView mView;

    @Override
    public void onAttach(MainView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showFragment(){
        final Data data = new Data();
        data.setText("Hello From Data");

        //show fragment with Data
        mView.onShowFragment(data);
    }


}
