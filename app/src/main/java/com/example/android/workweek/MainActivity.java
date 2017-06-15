package com.example.android.workweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.design.widget.TabLayout;

import android.support.v4.view.ViewPager;

import static com.example.android.workweek.R.id.viewpager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentPager adapter = new FragmentPager(getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
