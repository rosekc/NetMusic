package com.android.netmusic.adapter;

import java.util.List;

/**
 * Created by rosekc on 2017/3/30.
 */

public class RadioList {
    private String radioListTitle;
    private RadioItemAdapter radioItemAdapter;

    public RadioList(String radioListTitle, RadioItemAdapter radioItemAdapter) {
        this.radioListTitle = radioListTitle;
        this.radioItemAdapter = radioItemAdapter;
    }

    public String getRadioListTitle() {
        return radioListTitle;
    }

    public void setRadioListTitle(String radioListTitle) {
        this.radioListTitle = radioListTitle;
    }

    public RadioItemAdapter getRadioItemAdapter() {
        return radioItemAdapter;
    }

    public void setRadioItemAdapter(RadioItemAdapter radioItemAdapter) {
        this.radioItemAdapter = radioItemAdapter;
    }
}
