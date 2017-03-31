package com.android.netmusic.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.netmusic.R;

import java.util.List;

/**
 * Created by rosekc on 2017/3/30.
 */

public class RadioListAdapter extends BaseExpandableListAdapter  {

    private  List<RadioList> radioLists;
    private  Context context;
    public RadioListAdapter(Context context, List<RadioList> radioLists) {
        this.context = context;
        this.radioLists = radioLists;
    }

    @Override
    public int getGroupCount() {
        return radioLists.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return radioLists.get(groupPosition).getRadioItemList().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return radioLists.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return radioLists.get(groupPosition).getRadioItemList().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        RadioList radioList = (RadioList) getGroup(groupPosition);
        View view;
        GroupViewHolder groupViewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.radio_list_header, null);
            groupViewHolder = new GroupViewHolder();
            groupViewHolder.radioListTitle = (TextView) view.findViewById(R.id.radio_list_title_rosekc);
            view.setTag(groupViewHolder);
        } else {
            view = convertView;
            groupViewHolder = (GroupViewHolder) view.getTag();
        }
        groupViewHolder.radioListTitle.setText(radioList.getRadioListTitle());
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        RadioItem radioItem = (RadioItem) getChild(groupPosition, childPosition);
        View view;
        ChildViewHolder childViewHolder;
        if (convertView == null) {
            view =  LayoutInflater.from(context).inflate(R.layout.radio_item, null);
            childViewHolder = new ChildViewHolder();
            childViewHolder.radioImage = (ImageView) view.findViewById(R.id.radio_image_rosekc);
            childViewHolder.radioTitle = (TextView) view.findViewById(R.id.radio_title_rosekc);
            childViewHolder.radioAnchor = (TextView) view.findViewById(R.id.radio_anchor_rosekc);
            view.setTag(childViewHolder);
        } else {
            view = convertView;
            childViewHolder = (ChildViewHolder) view.getTag();
        }
        childViewHolder.radioImage.setImageResource(radioItem.getImageId());
        childViewHolder.radioTitle.setText(radioItem.getTitle());
        childViewHolder.radioAnchor.setText(radioItem.getAnchor());
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    class GroupViewHolder {
        TextView radioListTitle;
    }
    class ChildViewHolder {
        ImageView radioImage;
        TextView radioTitle;
        TextView radioAnchor;
    }
}

