package com.wujie.mvp.about;

import android.os.Bundle;

import com.wujie.mvp.R;
import com.wujie.mvp.base.BaseActivity;
import com.wujie.mvp.main.MainContract;

public class AboutActivity extends BaseActivity<AboutContract.Presenter> implements AboutContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Tag = "AboutActivity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
