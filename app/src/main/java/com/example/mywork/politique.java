package com.example.mywork;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.Myadapter;
import model.ListItem;

public class politique extends AppCompatActivity {


    RecyclerView recyclerView ;
    List<ListItem> listeitems;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politique);
        recyclerView= findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listeitems =new ArrayList<ListItem>();
        for (int x=1 ;x <3 ; x++){

        ListItem listeitem=new ListItem(
                "descreption " +(x+1)
        );
        listeitems.add(listeitem);
        }
        adapter=new Myadapter(this,listeitems);
        recyclerView.setAdapter(adapter);

    }

}