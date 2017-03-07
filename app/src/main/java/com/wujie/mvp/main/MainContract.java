package com.wujie.mvp.main;

import com.wujie.mvp.base.BasePresenter;
import com.wujie.mvp.base.BaseView;

/**
 * Created by wujie on 2017/3/7.
 */
public interface MainContract {
    interface Presenter extends BasePresenter {
        void computeNumber();
    }

    interface View extends BaseView<Presenter> {
        void showNumber(int number);
    }
}
