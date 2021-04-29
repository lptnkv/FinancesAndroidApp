package com.example.finances;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.widget.SimpleAdapter;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Currency> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arr = new ArrayList<>();
        initializeList();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        CurrencyAdapter currencyAdapter = new CurrencyAdapter(this, arr);

        recyclerView.setAdapter(currencyAdapter);
    }

    private void initializeList(){
        String[] nameArr = getResources().getStringArray(R.array.currencies);
        String[] priceArr = getResources().getStringArray(R.array.prices);
        TypedArray flagResArr = getResources().obtainTypedArray(R.array.flags);
        for (int i = 0; i < nameArr.length; i++){
            arr.add(new Currency(nameArr[i], priceArr[i], flagResArr.getResourceId(i, 0)));
        }
        flagResArr.recycle();
    }
}