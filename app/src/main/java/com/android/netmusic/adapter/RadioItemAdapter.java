package com.android.netmusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.netmusic.R;

import java.util.List;

/**
 * Created by rosekc on 2017/3/30.
 */

public class RadioItemAdapter extends BaseAdapter {
    Context context;
    List<RadioItem> radioItemList;
    public RadioItemAdapter(Context context, List<RadioItem> radioItemList) {
        super();
        this.context = context;
        this.radioItemList = radioItemList;
    }

    @Override
    public int getCount() {
        return radioItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return radioItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RadioItem radioItem = (RadioItem) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view =  LayoutInflater.from(context).inflate(R.layout.radio_item, null);
            viewHolder = new ViewHolder();
            viewHolder.radioImage = (ImageView) view.findViewById(R.id.radio_image_rosekc);
            viewHolder.radioTitle = (TextView) view.findViewById(R.id.radio_title_rosekc);
            viewHolder.radioAnchor = (TextView) view.findViewById(R.id.radio_anchor_rosekc);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.radioImage.setImageResource(radioItem.getImageId());
        viewHolder.radioTitle.setText(radioItem.getTitle());
        viewHolder.radioAnchor.setText(radioItem.getAnchor());
        return view;
    }
    class ViewHolder {
        ImageView radioImage;
        TextView radioTitle;
        TextView radioAnchor;
    }
}
