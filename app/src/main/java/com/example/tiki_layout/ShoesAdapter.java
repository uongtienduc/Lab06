package com.example.tiki_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoesAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Shoes> arrayList;

    public ShoesAdapter(Context ctx, int layoutItem, ArrayList<Shoes> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvInfo = view.findViewById(R.id.tvInfo);
        TextView tvMoreDetail = view.findViewById(R.id.tvMoreDetail);
        ImageView img = view.findViewById(R.id.img);

        tvInfo.setText(arrayList.get(i).getInfo());
        tvMoreDetail.setText(arrayList.get(i).getMoredetail());
        img.setImageResource((arrayList.get(i).getImg()));

        return view;
    }
}
