package com.wujie.mvp.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wujie.mvp.R;


public class FirstFragment extends Fragment implements MainContract.View{

    private TextView firstTx;
    private MainContract.Presenter presenter;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onResume() {
        super.onResume();
        if(presenter != null) {
            presenter.computeNumber();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View convertView = inflater.inflate(R.layout.fragment_first, container, false);
        firstTx = (TextView) convertView.findViewById(R.id.first_tx);
        return convertView;
    }


    @Override
    public void showNumber(int number) {
        firstTx.setText(String.valueOf(number));
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public boolean isViewActive() {
        return isAdded();
    }
}
