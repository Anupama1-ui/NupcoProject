package com.skyview.nupcoemployeeapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater inflater;
    private String[] grid_Txt;
    private  int[] gridImg;

    public MainAdapter(Context c, String[] gridTxt, int[] gridImg) {
        context=c;
        this.grid_Txt=gridTxt;
        this.gridImg=gridImg;
    }

    @Override
    public int getCount() {
        return grid_Txt.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.gridlistview, null);
        }
        TextView textView = convertView.findViewById(R.id.grid_text);
        ImageView imageView = convertView.findViewById(R.id.grid_image);

        imageView.setImageResource(gridImg[position]);
        textView.setText(grid_Txt[position]);

        return convertView;
    }
}