package com.calvinlsliang.cuteanimals.mainfeed;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.calvinlsliang.cuteanimals.R;

public class MainFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_feed);

        addFragment(savedInstanceState);
    }

    private void addFragment(Bundle savedInstanceState) {
        if (findViewById(R.id.fragment_container) == null) {
            return;
        }

        if (savedInstanceState != null) {
            return;
        }

        Fragment fragment = new MainFeedFragment();
        fragment.setArguments(getIntent().getExtras());

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
}
