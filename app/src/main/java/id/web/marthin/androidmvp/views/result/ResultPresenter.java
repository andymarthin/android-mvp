package id.web.marthin.androidmvp.views.result;

import id.web.marthin.androidmvp.views.base.Presenter;

/**
 * Created by mcspicy on 19/9/17.
 */

public class ResultPresenter implements Presenter<ResultView>{
    ResultView mView;

    @Override
    public void onAttach(ResultView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void onShowResult(final String text){
        mView.onShowResult(text);
    }
}
