package com.android45.android45_b5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    ListView lvFoodCart;
    List<Food> cartList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        lvFoodCart = findViewById(R.id.lvFoodOrder);
        cartList = new ArrayList<>();

        String tenSp = getIntent().getStringExtra("Ten Sp");
        String giaTien = getIntent().getStringExtra("Gia Tien");


        AdapterFoodCart adapterFoodCart = new AdapterFoodCart(cartList);
        lvFoodCart.setAdapter(adapterFoodCart);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });

    }
}