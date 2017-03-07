package com.wujie.mvp.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wujie.mvp.R;
import com.wujie.mvp.about.AboutActivity;
import com.wujie.mvp.base.BaseActivity;

public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {

    private TextView numberTx ;
    private Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Tag = "MainActivity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPrensenter();
        initView();
        presenter.computeNumber();
    }

    private void initView() {
        numberTx = (TextView) findViewById(R.id.number);
        findViewById(R.id.btn_next)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, AboutActivity.class));
                        //presenter = null;
                    }
                });
    }
    private void initPrensenter() {
        presenter = new MainPresenter(this);
    }
    @Override
    public void showNumber(int number) {
        numberTx.setText(number+"");
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
