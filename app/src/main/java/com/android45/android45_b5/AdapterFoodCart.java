package com.android45.android45_b5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterFoodCart extends BaseAdapter {
    List<Food> cartList;

    public AdapterFoodCart(List<Food> cartList) {
        this.cartList = cartList;
    }

    @Override
    public int getCount() {
        return cartList.size();
    }

    @Override
    public Object getItem(int position) {
        return cartList.get(position);
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
        TextView tvSoLuong = view.findViewById(R.id.tvSoLuong);

        Food food = cartList.get(position);

        tvTenSp.setText(food.getTenSp());
        tvGiaTien.setText(String.valueOf(food.getGiaTien())+"d");
        tvSoLuong.setText(String.valueOf("("+food.getSoLuong())+")");

        return view;
    }
}
