package com.example.android.workweek;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by bruno on 15/06/2017.
 */

public class FragmentPager extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Work", "Eat", "Sleep", "Play" };

    public FragmentPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new WorkFragment();
        } else if (position == 1){
            return new EatFragment();
        } else if (position == 2){
            return new SleepFragment();
        } else {
            return new PlayFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
