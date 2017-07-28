package com.ayay25001.openmap;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by toothwind on 2017/7/26.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class MyAdapter extends ArrayAdapter<String>{

    public MyAdapter(Context context, int resource) {
        super(context, resource);


    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        getContext();
//        View.inflate();
        return super.getView(position, convertView, parent);

    }
}
