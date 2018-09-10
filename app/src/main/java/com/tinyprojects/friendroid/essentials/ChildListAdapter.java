package com.tinyprojects.friendroid.essentials;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by ABBAS on 2/10/2018.
 */

public class ChildListAdapter extends ArrayAdapter {

    private Activity context;
    private String[] itemTitle;

    public ChildListAdapter(Activity context, String[] itemTitle) {

        super(context, R.layout.child_list_item, itemTitle);
        this.context = context;
        this.itemTitle = itemTitle;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View titleView = inflater.inflate(R.layout.child_list_item, null, true);

        TextView textViewTitle = titleView.findViewById(R.id.itemTitle);
        textViewTitle.setText(itemTitle[position]);

        return titleView;


    }
}
