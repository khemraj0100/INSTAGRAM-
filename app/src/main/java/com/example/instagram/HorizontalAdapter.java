package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

    private ArrayList<Item> items=new ArrayList();


    public HorizontalAdapter(ArrayList items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout,parent,false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {

        holder.txt.setText(items.get(position).FruitsListName);
        holder.imageView.setImageResource(items.get(position).FruitsListImage);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder{

        TextView txt;
        ImageView imageView;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);

            txt =(TextView) itemView.findViewById(R.id.nameTV);

            imageView=(ImageView) itemView.findViewById((R.id.IV));
        }
    }
}
