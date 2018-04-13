package com.example.jasonmitropoulos.londonveganguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TypeAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * Create a new TypeAdapter object
     */
    public TypeAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed for the given page number
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new BarsFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else {
            return new FestivalsFragment();
        }
    }

    /**
     * Return the total number of pages
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.Bars);
        } else if (position == 2) {
            return mContext.getString(R.string.Shops);
        } else {
            return mContext.getString(R.string.Festivals);
        }
    }
}

