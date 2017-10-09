package com.example.jonathan.collapsibletabexample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jonathan.collapsibletabexample.fragments.PostsFragment;

/**
 * Created by jonat on 08/10/2017.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    // guarda os títulos das tabs que irão ser passadas quando o viewPagerAdapter for criado
    CharSequence titles[];
    // guarda o número de tabs
    int numberOfTabs;

    public MainPagerAdapter(FragmentManager fm, CharSequence[] titles, int numberOfTabs) {
        super(fm);
        this.titles = titles;
        this.numberOfTabs = numberOfTabs;
    }

    // retorna o fragment solicidado por cada posição da view pager
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PostsFragment();
            default:
                return new PostsFragment();
        }
    }

    // retorna o título da tab
    @Override
    public CharSequence getPageTitle(int position) {
        return this.titles[position];
    }

    // retorna quantidade de tabs total
    @Override
    public int getCount() {
        return this.numberOfTabs;
    }
}
