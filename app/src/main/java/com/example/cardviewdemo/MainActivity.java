package com.example.cardviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Games[] g;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        g=new Games[]{new Games("Dead Island",R.drawable.dead_island),
                        new Games("Diablo",R.drawable.diablo),
                        new Games("Final Fantasy",R.drawable.final_fantasy),
                        new Games("Resident Evil",R.drawable.resident_evil),
                        new Games("Star Wars:Jedi Survivor",R.drawable.star_wars_jedi_survivor),
                        new Games("Street Fighter",R.drawable.street_fighter),
                        new Games("Suicide Squad",R.drawable.suicide_squad)};
        myAdapter=new MyAdapter(g,getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
    }
}