package com.android.netmusic.fragment.musicmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.netmusic.R;


/**
 * 个性推荐
 * Created by Android on 2017/3/18.
 */

public class CommendFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musicmenu_commend,null);
        return view;
    }
}