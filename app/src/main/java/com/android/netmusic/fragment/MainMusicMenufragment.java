package com.android.netmusic.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.netmusic.R;
import com.android.netmusic.adapter.MusicMenuFragmentAdapter;


/**
 * 发现
 * Created by Android on 2017/3/18.
 */

public class MainMusicMenufragment extends Fragment {
    private ViewPager mViewPager;
    private MusicMenuFragmentAdapter mMusicMenuFragmentAdapter;
    private TabLayout mTabLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_musicmenu,null);
        //初始化布局
        initTabLayout(view);
        return view;
    }

    /**
     * 初始化布局
     */
    private void initTabLayout(View view){
        mMusicMenuFragmentAdapter = new MusicMenuFragmentAdapter(getFragmentManager());
        mViewPager = (ViewPager)view.findViewById(R.id.musicmenu_viewpager);
        mViewPager.setAdapter(mMusicMenuFragmentAdapter);
        mTabLayout = (TabLayout)view.findViewById(R.id.musicmenu_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText(R.string.commend);
        mTabLayout.getTabAt(1).setText(R.string.menu);
        mTabLayout.getTabAt(2).setText(R.string.radio);
        mTabLayout.getTabAt(3).setText(R.string.rank);
    }
}
