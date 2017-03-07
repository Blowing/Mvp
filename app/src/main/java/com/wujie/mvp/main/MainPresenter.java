package com.wujie.mvp.main;

import android.os.Handler;
import android.os.Message;
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
        mView.setPresenter(this);
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0x123:
                    mView.showNumber(msg.arg1);
                    break;
            }

        }
    };
    @Override
    public void computeNumber() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
              if(mView.isViewActive()) {
                    Log.e("MainPresenter", "active");
                    Message message  = Message.obtain();
                    message.what = 0x123;
                    message.arg1 = 100;
                    mHandler.sendMessage(message);
                } else {
                    Log.e("MainPresenter", "noActive");
                }

            }
        }, 5000);


        //mView.showNumber(100);

    }


}
