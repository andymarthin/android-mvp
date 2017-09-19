package id.web.marthin.androidmvp.views.base;

/**
 * Created by mcspicy on 19/9/17.
 */

public interface Presenter<T extends View>{
    void onAttach(T view);

    void onDetach();
}
