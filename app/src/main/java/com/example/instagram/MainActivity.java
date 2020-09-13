package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList arrayList=new ArrayList<>();
    ArrayList previewArrayList=new ArrayList<>();


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.tab1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.tab1:
                        return true;


                    case R.id.tab2:
                        startActivity(new Intent(getApplicationContext(),TabLayout.class));
                        overridePendingTransition(0,0);
                        return true;




                }
                return false;
            }

        });





            RecyclerView list = findViewById(R.id.List);
        RecyclerView previewRV = findViewById(R.id.previewRV);
        list.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        previewRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        arrayList.add(new Item("charry",R.drawable.a));
        arrayList.add(new Item("stobarry",R.drawable.b));
        arrayList.add(new Item("kiwi",R.drawable.c));
        arrayList.add(new Item("pineapple",R.drawable.d));
        arrayList.add(new Item("charry",R.drawable.e));
        arrayList.add(new Item("stobarry",R.drawable.f));
        arrayList.add(new Item("kiwi",R.drawable.b));
        arrayList.add(new Item("pineapple",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.c));
        arrayList.add(new Item("pineapple",R.drawable.d));
        arrayList.add(new Item("charry",R.drawable.e));
        arrayList.add(new Item("kiwi",R.drawable.f));
        arrayList.add(new Item("kiwi",R.drawable.b));
        arrayList.add(new Item("pineapple",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.b));
        arrayList.add(new Item("stobarry",R.drawable.c));
        arrayList.add(new Item("kiwi",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.d));
        arrayList.add(new Item("charry",R.drawable.e));
        arrayList.add(new Item("kiwi",R.drawable.f));
        arrayList.add(new Item("charry",R.drawable.b));
        arrayList.add(new Item("kiwi",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.a));
        arrayList.add(new Item("stobarry",R.drawable.b));
        arrayList.add(new Item("kiwi",R.drawable.c));
        arrayList.add(new Item("pineapple",R.drawable.d));
        arrayList.add(new Item("charry",R.drawable.e));
        arrayList.add(new Item("stobarry",R.drawable.f));
        arrayList.add(new Item("kiwi",R.drawable.b));
        arrayList.add(new Item("pineapple",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.c));
        arrayList.add(new Item("pineapple",R.drawable.d));
        arrayList.add(new Item("charry",R.drawable.e));
        arrayList.add(new Item("kiwi",R.drawable.f));
        arrayList.add(new Item("kiwi",R.drawable.b));
        arrayList.add(new Item("pineapple",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.b));
        arrayList.add(new Item("stobarry",R.drawable.c));
        arrayList.add(new Item("kiwi",R.drawable.c));
        arrayList.add(new Item("charry",R.drawable.d));


        previewArrayList.add(new PreviewItem(R.drawable.image6,"manukashyap","https://wonderfulengineering.com/wp-content/uploads/2016/01/Nature-Wallpaper-25.jpg"));
        previewArrayList.add(new PreviewItem(R.drawable.image2,"swati","https://images.pexels.com/photos/210186/pexels-photo-210186.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        previewArrayList.add(new PreviewItem(R.drawable.image1,"manukashyap","https://images.pexels.com/photos/36717/amazing-animal-beautiful-beautifull.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        previewArrayList.add(new PreviewItem(R.drawable.image5,"manu","https://lh4.googleusercontent.com/proxy/M2YSUFzbzk5gO2ieouWx9QdjKWpnjrlOcD2GwXPcBLsX39iCZl8Ei_vnSxTWKDwPHJAccstl5ChQ1a5u4OIfPEH1M4S_IEQYjJEEqRUpM-Z2bnPLYE9k3ZE8xQ=s0-d"));
        previewArrayList.add(new PreviewItem(R.drawable.image1,"ritika","https://hdfreewallpaper.net/wp-content/uploads/2018/09/hd-nature-wallpaper-download-for-android.jpg"));
        previewArrayList.add(new PreviewItem(R.drawable.image6,"sugandha","https://i.pinimg.com/originals/73/b1/14/73b114d47d261af05ed35c7ce64f1e19.jpg"));
        previewArrayList.add(new PreviewItem(R.drawable.image2,"neha sharma","https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"));
        previewArrayList.add(new PreviewItem(R.drawable.image1,"shilpa","https://img.wallpapersafari.com/desktop/1440/900/21/27/CvlnLY.jpg"));
        previewArrayList.add(new PreviewItem(R.drawable.image5,"kiran","https://images.wallpapersden.com/image/download/love-and-nature_66911_1920x1080.jpg"));







        HorizontalAdapter myAdapter=new HorizontalAdapter(arrayList);
        list.setAdapter(myAdapter);


        PreviewAdapter pre=new PreviewAdapter(previewArrayList,this);
        previewRV.setAdapter(pre);


    }
}