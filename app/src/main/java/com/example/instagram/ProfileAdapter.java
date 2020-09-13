package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

    private ArrayList<ProfileItem> items=new ArrayList();


    public ProfileAdapter(ArrayList items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HorizontalAdapter.HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter.HorizontalViewHolder holder, int position) {

        holder.txt.setText(items.get(position).FruitsListName5);
        holder.imageView.setImageResource(items.get(position).FruitsListImage5);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder{

        TextView txt5;
        ImageView imageView5;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);

            txt5 =(TextView) itemView.findViewById(R.id.nameTV);

            imageView5=(ImageView) itemView.findViewById((R.id.IV));
        }
    }
}
