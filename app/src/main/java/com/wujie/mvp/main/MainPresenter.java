package com.wujie.mvp.main;

import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by wujie on 2017/3/7.
 *
 */
public class MainPresenter implements MainContract.Presenter{

    private final MainContract.View mView;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void computeNumber() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                mView.showNumber(100);
                Log.e("MainPresenter", "stat");
            }
        }, 5000);

    }
}
