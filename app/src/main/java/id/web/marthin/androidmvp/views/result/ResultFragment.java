package id.web.marthin.androidmvp.views.result;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import id.web.marthin.androidmvp.R;


public class ResultFragment extends Fragment implements ResultView{

    ResultPresenter presenter;

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initPresenter();
        onAttachView();
    }

    public static ResultFragment newInstance(){
        return new ResultFragment();
    }

    private void initPresenter() {
        presenter = new ResultPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
        setResult();
    }

    @Override
    public void onDetachView() {
        presenter.onDetach();
    }

    @Override
    public void onShowResult(String text) {
        final TextView textView = (TextView) getActivity().findViewById(R.id.tv_result);
        textView.setText(text);
    }

    private void setResult(){
        final Bundle bundle = getArguments();
        final String text = bundle.getString("data");

        presenter.onShowResult(text);
    }
}
