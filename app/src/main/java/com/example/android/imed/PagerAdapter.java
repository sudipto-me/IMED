package com.example.android.imed;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Android on 10/3/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;
    public PagerAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            TabFragment1 tabFragment1 = new TabFragment1();
            return tabFragment1;

            case 1:
                TabFragment2 tabFragment2 = new TabFragment2();
                return tabFragment2;

            default:
                return null;

        }

    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return numOfTabs;
    }
}
