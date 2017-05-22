package com.test.ayurconnect.clothpicker.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.test.ayurconnect.clothpicker.R;

import butterknife.ButterKnife;

public class BookmarkActivity extends BaseActivity {

    @Override
    public int getLayoutResourceId() {
        return R.layout.activity_bookmark;
    }

    @Override
    public int getNavigationIconId() {
        return 0;
    }

    @Override
    public void onNavigationIconClick(View v) {

    }

    @Override
    public String getActivityTitle() {
        return null;
    }

    @Override
    public boolean focusAtLaunch() {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v) {

    }
}
