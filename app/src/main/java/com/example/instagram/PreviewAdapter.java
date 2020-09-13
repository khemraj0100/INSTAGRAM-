package com.example.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PreviewAdapter extends RecyclerView.Adapter<PreviewAdapter.HorizontalViewHolder> {

    private ArrayList<PreviewItem> PreviewItem=new ArrayList();
    private Context context;


    public PreviewAdapter(ArrayList items,MainActivity mainActivity) {
        this.PreviewItem = items;
        this.context=mainActivity;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.preview_layout,parent,false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {


        holder.name.setText(PreviewItem.get(position).name);
        Glide.with(context)
                .load(PreviewItem.get(position).previewImage)
                .centerCrop()
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_broken_image)
                .into(holder.imageView1);


//        holder.imageView1.setImageResource(PreviewItem.get(position).previewImage);
        holder.imageView2.setImageResource(PreviewItem.get(position).profileImage);
    }

    @Override
    public int getItemCount() {

        return PreviewItem.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView imageView1,imageView2;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);

            name =(TextView) itemView.findViewById(R.id.textview1);
            imageView1=(ImageView) itemView.findViewById((R.id.imageView1));
            imageView2=(ImageView) itemView.findViewById((R.id.imagev1));
        }
    }
}
