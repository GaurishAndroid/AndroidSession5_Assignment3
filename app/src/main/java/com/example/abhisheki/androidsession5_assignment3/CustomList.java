package com.example.abhisheki.androidsession5_assignment3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by ABHISHEKI on 27-12-2016.
 */

public class CustomList extends ArrayAdapter<String> {

    private String[] names;
    private String[] phone;

    private Activity context;

    public CustomList(Activity context, String[] names, String[] phones) {
        super(context, R.layout.activity_listview, names);
        this.context = context;
        this.names = names;
        this.phone = phones;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_listview, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.textViewPhone);
        textViewName.setText(names[position]);
        textViewDesc.setText(phone[position]);
        return  listViewItem;
    }

}
