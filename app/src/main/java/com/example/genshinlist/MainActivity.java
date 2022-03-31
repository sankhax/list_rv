package com.example.genshinlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list_item;
    private LinearLayoutManager layout;
    private List<Genshin> itemObjects;
    private adapterGenshin adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_item = findViewById(R.id.Rview);

        layout = new LinearLayoutManager(this);
        list_item.setLayoutManager(layout);


        itemObjects = new ArrayList<>();
        itemObjects.add(new Genshin("Kamisato Ayaka",R.drawable.ayaka));
        itemObjects.add(new Genshin ("Amber",R.drawable.amber));

        adapter = new adapterGenshin(getApplicationContext(),itemObjects);

        list_item.setAdapter(adapter);

    }
}