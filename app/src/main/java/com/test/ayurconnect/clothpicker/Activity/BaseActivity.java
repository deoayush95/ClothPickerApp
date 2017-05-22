package com.test.ayurconnect.clothpicker.Activity;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by Ayush Deothia on 23/05/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    public abstract int getLayoutResourceId();

    public abstract int getNavigationIconId();

    public abstract void onNavigationIconClick(View v);

    public abstract String getActivityTitle();

    public abstract boolean focusAtLaunch();

    public Toolbar getToolbar() {
        return toolbar;
    }

    Toolbar toolbar;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            com.pstc.sdk.utils.InputUtils.setStatusBarColor(this);
        }*/
        if (!focusAtLaunch()) {
            this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void setTitle(CharSequence title) {
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


}
