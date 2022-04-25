package com.example.t021_reyclerview_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> list;
    Adaptercls adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler1);
        list = new ArrayList<>();
        list.add(new Model("Title 1",R.drawable.ic_baseline_access_alarm_24));
        list.add(new Model("Title 2",R.drawable.ic_launcher_background));
        list.add(new Model("Title 3",R.mipmap.ic_launcher));
        list.add(new Model("Title 4",R.drawable.ic_cam1));
        list.add(new Model("Title 5",R.drawable.ic_launcher_foreground));
        list.add(new Model("Title 6",R.drawable.ic_launcher_background));

        adapter = new Adaptercls(MainActivity.this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }
}