package com.test.ayurconnect.clothpicker.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.test.ayurconnect.clothpicker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddClothActivity extends BaseActivity {

    @BindView(R.id.layout_add_shirt)
    LinearLayout layoutAddShirt;

    @BindView(R.id.layout_add_pant)
    LinearLayout layoutAddPant;

    @Override
    public int getLayoutResourceId() {
        return R.layout.activity_add_cloth;
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
