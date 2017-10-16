package com.example.android.imed.SebaProdan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Android on 10/10/2017.
 */

public class SebaProdanAdapter extends FragmentPagerAdapter {
    int numOfTabs;
    public SebaProdanAdapter(FragmentManager fm,int numOfTabs) {
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
                ExternalSeba externalSeba = new ExternalSeba();
                return externalSeba;
            case 1:
                InternalSeba internalSeba = new InternalSeba();
                return internalSeba;
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
