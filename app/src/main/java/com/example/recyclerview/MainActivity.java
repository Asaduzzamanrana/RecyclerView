package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> cityName;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityName = new ArrayList<>();
        cityName.add("Dhaka");
        cityName.add("Mymensingh");
        cityName.add("Chittagong");
        cityName.add("Barishal");
        cityName.add("Rajshahi");
        cityName.add("Bogura");
        cityName.add("Rangpur");
        cityName.add("Jamalpur");
        cityName.add("Shirajgonj");


       recyclerView = findViewById(R.id.recyclerViewId);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(getApplicationContext(),cityName);
        recyclerView.setAdapter(adapter);
    }
}
