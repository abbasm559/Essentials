package com.tinyprojects.friendroid.essentials;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ABBAS on 2/10/2018.
 */

public class MyListAdapter extends ArrayAdapter<String> {

    private Activity context;
    String[] title;
    private String[] subTitle;
    private int[] icons;


    MyListAdapter(Activity context, String[] title, String[] subTitle, int[] icons) {

        super(context, R.layout.list_iem, title);
        this.context = context;
        this.title = title;
        this.subTitle = subTitle;
        this.icons = icons;

    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView = inflater.inflate(R.layout.list_iem, null, true);


        TextView titleText =  rowView.findViewById(R.id.tvTitle);
        ImageView imageView =  rowView.findViewById(R.id.icon);
        TextView subtitleText =  rowView.findViewById(R.id.tvSubTitle);

        titleText.setText(title[position]);
        subtitleText.setText(subTitle[position]);
        imageView.setImageResource(icons[position]);


        return rowView;

    }
}

