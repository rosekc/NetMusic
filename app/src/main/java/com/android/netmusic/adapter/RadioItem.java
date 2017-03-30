package com.android.netmusic.adapter;

/**
 * Created by rosekc on 2017/3/30.
 */

public class RadioItem {
    private String title;
    private String anchor;
    private int imageId;
    public RadioItem(String title, String anchor, int imageId) {
        this.title = title;
        this.anchor = anchor;
        this.imageId = imageId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
