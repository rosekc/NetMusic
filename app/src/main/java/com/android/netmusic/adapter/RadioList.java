package com.android.netmusic.adapter;

import java.util.List;

/**
 * Created by rosekc on 2017/3/30.
 */

public class RadioList {
    private String radioListTitle;
    private List<RadioItem> radioItemList;

    public RadioList(String radioListTitle, List<RadioItem> radioItemList) {
        this.radioListTitle = radioListTitle;
        this.radioItemList = radioItemList;
    }

    public String getRadioListTitle() {
        return radioListTitle;
    }

    public void setRadioListTitle(String radioListTitle) {
        this.radioListTitle = radioListTitle;
    }

    public List<RadioItem> getRadioItemList() {
        return radioItemList;
    }

    public void setRadioItemList(List<RadioItem> radioItemList) {
        this.radioItemList = radioItemList;
    }
}
