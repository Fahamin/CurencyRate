package com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.R;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.fragment.Eur;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.fragment.Lattest;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.fragment.Usd;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3 };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

       /* if(position == 0)
        {
            return  new Lattest();
        }*/
        if(position == 0)
        {
            return  new Eur();
        }
        if(position == 1)
        {
            return  new Usd();
        }
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}