package com.example.layettev2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> names;
    RecyclerView rcv;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcv);

        names = new ArrayList<>();
        names.add("szoba");
        names.add("utazás");
        names.add("alvás");

        adapter = new Adapter(this,names);

        GridLayoutManager grid = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL, false);

        rcv.setLayoutManager(grid);
        rcv.setAdapter(adapter);



    }
}