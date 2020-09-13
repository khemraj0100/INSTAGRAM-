package com.example.instagram;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

import androidx.recyclerview.widget.GridLayoutManager;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    ImageView imageView;

    public int[] ImageArray ={
            R.drawable.bellaprofile,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.bellaprofile,R.drawable.image6,R.drawable.image1,R.drawable.image2,R.drawable.image1,
            R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5,R.drawable.image6,R.drawable.image1,R.drawable.image2,R.drawable.image1,
            R.drawable.image2,R.drawable.image1,R.drawable.image2,      R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5,R.drawable.image6,R.drawable.image1,R.drawable.image2,R.drawable.image1,

    };

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return ImageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return ImageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        imageView =new ImageView(context);
        imageView.setImageResource(ImageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        imageView.setLayoutParams(new GridLayoutManager.LayoutParams(450,300));

        return imageView;
    }
}
