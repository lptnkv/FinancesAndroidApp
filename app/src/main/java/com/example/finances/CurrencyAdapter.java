package com.example.finances;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private ArrayList<Currency> arr;

    public CurrencyAdapter(Context context, ArrayList<Currency> arr) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Currency currency = arr.get(position);
        holder.flagView.setImageResource(currency.getFlag());
        holder.nameView.setText(currency.getName());
        holder.priceView.setText(currency.getPrice());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        final ImageView flagView;
        final TextView nameView, priceView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            flagView = (ImageView) itemView.findViewById(R.id.flag);
            nameView = (TextView) itemView.findViewById(R.id.name);
            priceView = (TextView) itemView.findViewById(R.id.price);
        }
    }
}


