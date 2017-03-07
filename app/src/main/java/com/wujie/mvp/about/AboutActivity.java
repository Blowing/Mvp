package com.wujie.mvp.about;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wujie.mvp.R;
import com.wujie.mvp.base.BaseActivity;
import com.wujie.mvp.main.MainActivity;
import com.wujie.mvp.main.MainContract;

public class AboutActivity extends BaseActivity<AboutContract.Presenter> implements AboutContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Tag = "AboutActivity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        findViewById(R.id.about_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

    @Override
    public boolean isViewActive() {
        return true;
    }
}
