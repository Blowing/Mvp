package com.wujie.mvp.about;

/**
 * Created by wujie on 2017/3/7.
 */
public class AboutPresenter implements AboutContract.Presenter {

    private final AboutContract.View mView;

    public AboutPresenter(AboutContract.View mView) {
        this.mView = mView;
    }
}
