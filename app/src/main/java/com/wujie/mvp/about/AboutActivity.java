package com.wujie.mvp.about;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wujie.mvp.R;
import com.wujie.mvp.base.BaseActivity;
import com.wujie.mvp.main.MainActivity;
import com.wujie.mvp.main.MainContract;

public class AboutActivity extends BaseActivity<AboutContract.Presenter> implements AboutContract.View,
    View.OnClickListener{


    private HorizontalScrollView mScrollView;
    private LinearLayout mScrollLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Tag = "AboutActivity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initView();

    }
    private void initView() {
        mScrollView = (HorizontalScrollView) findViewById(R.id.path_scrollview) ;
        mScrollLayout = (LinearLayout) findViewById(R.id.scroll_layout);
        findViewById(R.id.about_btn).setOnClickListener(this);
        findViewById(R.id.add_btn).setOnClickListener(this);
    }

    private void addBtnView() {


        TextView textView = new TextView(this);
        LinearLayout.LayoutParams  params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(params);
        textView.setText((int)(Math.random() * 100) +"---");
        mScrollLayout.addView(textView);
        mScrollView.post(new Runnable() {
            @Override
            public void run() {
                mScrollView.scrollTo(mScrollLayout.getWidth(), 0);
                Log.d(Tag, "width"+ mScrollLayout.getWidth());
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.about_btn:
                startActivity(new Intent(AboutActivity.this, MainActivity.class));
                break;
            case R.id.add_btn:
                addBtnView();
                break;
        }
    }
}
