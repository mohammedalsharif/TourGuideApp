package com.examples.tourguideapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.tourguideapp.R;
import com.examples.tourguideapp.model.itemCategory;

import java.util.ArrayList;

public class listAdapter extends BaseAdapter {


    ArrayList<itemCategory> list =new ArrayList<>();
    Context context;

    public listAdapter(ArrayList<itemCategory> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public itemCategory getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewItem = LayoutInflater.from(context).inflate(R.layout.item_list,null);
        ImageView image=viewItem.findViewById(R.id.iv_item);
        TextView textName=viewItem.findViewById(R.id.text_name);
        TextView textDesc=viewItem.findViewById(R.id.text_desc);
        itemCategory item= getItem(i);
        image.setImageResource(item.getImage());
        textName.setText(item.getName());
        textDesc.setText(item.getDiscretion());
        return viewItem;
    }
}
