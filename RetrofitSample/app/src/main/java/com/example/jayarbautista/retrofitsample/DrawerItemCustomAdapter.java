package com.example.jayarbautista.retrofitsample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jay R Bautista on 8/2/2016.
 */
public class DrawerItemCustomAdapter extends ArrayAdapter<ObjectDrawerItem> {

    Context mContext;
    int mResourceId;
    ObjectDrawerItem data[] = null;

    public DrawerItemCustomAdapter(Context context, int resource, ObjectDrawerItem[] objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResourceId = resource;
        this.data = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)mContext).getLayoutInflater();
        convertView = inflater.inflate(mResourceId, parent, false);

        ImageView imageViewIcon = (ImageView) convertView.findViewById(R.id.imageViewIcon);
        TextView textViewName = (TextView) convertView.findViewById(R.id.textViewName);

        ObjectDrawerItem folder = data[position];

        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return convertView;
    }
}
