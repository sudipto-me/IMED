package com.example.android.imed.AboutImed;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Android on 10/8/2017.
 */

public class AboutImedAdapter extends FragmentPagerAdapter {
    int numOfTabs;
    public AboutImedAdapter(FragmentManager fm, int numOfTabs) {
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
                BongoBondhurBani bongoBondhurBani = new BongoBondhurBani();
                return bongoBondhurBani;
            case 1:
                NibondhokandPorichalokerbani nibondhokandPorichalokerbani = new NibondhokandPorichalokerbani();
                return nibondhokandPorichalokerbani;
            case 2:
                SonkiptoItihas sonkiptoItihas = new SonkiptoItihas();
                return sonkiptoItihas;
            case 3:
                MisionandVision misionandVision = new MisionandVision();
                return misionandVision;
            case 4:
                Gallery gallery= new Gallery();
                return gallery;
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
