package com.example.expandablelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] fruitList;
    int[] fruitImages;
    LayoutInflater layoutInflater;
    public CustomAdapter(Context context, String[] fruitList, int[] fruitImages) {
        this.context = context;
        this.fruitList = fruitList;
        this.fruitImages = fruitImages;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return fruitList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = (TextView) convertView.findViewById(R.id.Text);
        ImageView fruitImage = (ImageView) convertView.findViewById(R.id.ImageIcon);
        textView.setText(fruitList[position]);
        fruitImage.setImageResource(fruitImages[position]);
        return convertView;
    }
}
