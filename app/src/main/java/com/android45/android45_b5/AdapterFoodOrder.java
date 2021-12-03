package com.android45.android45_b5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterFoodOrder extends BaseAdapter {
    List<Food> orderList;

    public AdapterFoodOrder(List<Food> orderList) {
        this.orderList = orderList;
    }

    @Override
    public int getCount() {
        return orderList.size();
    }

    @Override
    public Object getItem(int position) {
        return orderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_food, parent, false);

        TextView tvTenSp = view.findViewById(R.id.tvTenSp);
        TextView tvGiaTien = view.findViewById(R.id.tvGiaTien);

        Food food = orderList.get(position);

        tvTenSp.setText(food.getTenSp());
        tvGiaTien.setText(String.valueOf(food.getGiaTien()) + "d");

        return view;
    }
}
