package com.android.netmusic.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.netmusic.fragment.musicmenu.CommendFragment;
import com.android.netmusic.fragment.musicmenu.MenuFragment;
import com.android.netmusic.fragment.musicmenu.RadioFragment;
import com.android.netmusic.fragment.musicmenu.RankFragment;


/**
 * Created by Android on 2017/3/18.
 */

public class MusicMenuFragmentAdapter extends FragmentPagerAdapter {
    private final int ITEM_SUM = 4;
    private FragmentManager fm;

    public MusicMenuFragmentAdapter(FragmentManager fm){
        super(fm);
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                CommendFragment cf = new CommendFragment();
                return cf;
            case 1:
                MenuFragment mf = new MenuFragment();
                return mf;
            case 2:
                RadioFragment radiof = new RadioFragment();
                return radiof;
            case 3:
                RankFragment rankf = new RankFragment();
                return rankf;
        }

        return null;
    }

    @Override
    public int getCount() {
        return ITEM_SUM;
    }
}
