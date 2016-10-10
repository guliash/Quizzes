package com.guliash.countryquiz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class QuizAdapter extends FragmentStatePagerAdapter {

    public QuizAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return QuizFragment.newInstance(String.valueOf(position));
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
}
