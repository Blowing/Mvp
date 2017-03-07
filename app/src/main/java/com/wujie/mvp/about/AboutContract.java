package com.wujie.mvp.about;

import com.wujie.mvp.base.BasePresenter;
import com.wujie.mvp.base.BaseView;
import com.wujie.mvp.main.MainContract;

/**
 * Created by wujie on 2017/3/7.
 */
public interface AboutContract {

    interface Presenter extends BasePresenter {

    }

    interface View extends BaseView<MainContract.Presenter> {

    }
}
