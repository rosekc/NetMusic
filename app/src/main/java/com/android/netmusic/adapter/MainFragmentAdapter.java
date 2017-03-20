package com.android.netmusic.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.netmusic.fragment.MainCommunityfragment;
import com.android.netmusic.fragment.MainMusicMenufragment;
import com.android.netmusic.fragment.MainMusicfragment;


/**
 * Created by Android on 2017/3/18.
 */

public class MainFragmentAdapter extends FragmentPagerAdapter {
    private final int ITEM_SUM = 3;
    private FragmentManager fm;

    public MainFragmentAdapter(FragmentManager fm){
        super(fm);
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MainMusicfragment mmf = new MainMusicfragment();
                return mmf;
            case 1:
                MainMusicMenufragment mmmf = new MainMusicMenufragment();
                return mmmf;
            case 2:
                MainCommunityfragment mcf = new MainCommunityfragment();
                return mcf;
        }

        return null;
    }

    @Override
    public int getCount() {
        return ITEM_SUM;
    }
}
