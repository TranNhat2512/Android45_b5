package com.android45.android45_b5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    ListView lvFoodOrder;
    List<Food> orderList;
    Food food1, food2, food3, food4;
    Button btnOrder;
    RelativeLayout btnCast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        orderList = new ArrayList<>();

        food1 = new Food("Pizza","100_000", "0");
        food2 = new Food("Bread", "10_000", "0");
        food3 = new Food("Coffee","20_000","0");
        food4 = new Food("Chicken", "50_000","0");

        orderList.add(food1);
        orderList.add(food2);
        orderList.add(food3);
        orderList.add(food4);

        AdapterFoodOrder adapterFoodOrder = new AdapterFoodOrder(orderList);
        lvFoodOrder = findViewById(R.id.lvFoodOrder);
        lvFoodOrder.setAdapter(adapterFoodOrder);

        int count = 0;
        lvFoodOrder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Food food = orderList.get(position);
                Intent intent = new Intent();
                intent.putExtra("Ten Sp", food.getTenSp());
                intent.putExtra("Gia Tien", food.getGiaTien());

            }
        });


        btnCast = findViewById(R.id.btnCast);
        btnCast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        btnOrder = findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderActivity.this, "Đơn hàng đã được gửi đến cửa hàng", Toast.LENGTH_SHORT).show();
            }
        });
    }
}