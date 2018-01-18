package com.example.arnal.bishkekcity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by arnal on 1/21/17.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {
    /** Context of the app */
    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DoFragment();
        } else if (position == 1){
            return new EatFragment();
        }else if (position ==2){
            return new SeeFragment();
        }else
            return new SleepFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position ==0){
            return mContext.getString(R.string.category_do);
        }else if(position == 1){
            return mContext.getString(R.string.category_eat);
        }else if (position ==2){
            return mContext.getString(R.string.category_See);
        }else {
            return mContext.getString(R.string.category_sleep);
        }
    }
}


