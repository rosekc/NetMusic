package com.android.netmusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.netmusic.R;

import java.util.List;

/**
 * Created by rosekc on 2017/3/30.
 */

public class RadioListAdapter extends BaseAdapter {

    private  Context context;
    private  List<RadioList> radioLists;

    public RadioListAdapter(Context context, List<RadioList> radioLists) {
        super();
        this.context = context;
        this.radioLists = radioLists;
    }
    @Override
    public int getCount() {
        return radioLists.size();
    }

    @Override
    public Object getItem(int position) {
        return radioLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RadioList radioList = (RadioList) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view =  LayoutInflater.from(context).inflate(R.layout.radio_list, null);
            viewHolder = new ViewHolder();
            viewHolder.radioListTitle = (TextView) view.findViewById(R.id.radio_list_title_rosekc);
            viewHolder.radioItemListView = (ListView) view.findViewById(R.id.radio_item_list_view_rosekc);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.radioListTitle.setText(radioList.getRadioListTitle());
        viewHolder.radioItemListView.setAdapter(radioList.getRadioItemAdapter());
        return view;
    }

    class ViewHolder {
        TextView radioListTitle;
        ListView radioItemListView;
    }
}

