package com.example.android.sanmarcosfair2019;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StarsForumFragment();
        } else if (position == 1) {
            return new LakeForumFragment();
        } else if (position == 2) {
            return new CulturalFragment();
        } else if (position == 3){
            return new SportsFragment();
        } else {
            return new ExpoFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_starsForum);
        } else if (position == 1) {
            return mContext.getString(R.string.category_lakeForum);
        } else if (position == 2) {
            return mContext.getString(R.string.category_cultural);
        } else if (position == 3){
            return mContext.getString(R.string.category_sports);
        } else {
            return mContext.getString(R.string.category_expo);
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }
}
