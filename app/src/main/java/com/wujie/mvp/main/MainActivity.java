package com.wujie.mvp.main;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.wujie.mvp.R;
import com.wujie.mvp.base.BaseActivity;

public class MainActivity extends BaseActivity{

    private TextView numberTx ;
    private Button nextBtn;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Tag = "MainActivity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    private void initView() {
        numberTx = (TextView) findViewById(R.id.number);
        frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        final FirstFragment firstFragment = new FirstFragment();
        new MainPresenter(firstFragment);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_layout, firstFragment).commitAllowingStateLoss();
        final SecondFragment secondFragment = new SecondFragment();

        findViewById(R.id.btn_next)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        startActivity(new Intent(MainActivity.this, AboutActivity.class));
//                        finish();
                        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout, secondFragment).commitAllowingStateLoss();
                    }
                });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
