package com.example.kotlin_lectures;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ImageAdapter imageAdapter;
ArrayList<ImageModel> arrimageadap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
arrimageadap.add(new ImageModel());
    /*    arrimageadap.add(new ImageModel("July\n10","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Aug\n13","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Jun\n10","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Jun\n10","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Jun\n10","10:42:23 AM","01:30:23 PM"));*/
        imageAdapter=new ImageAdapter(this,arrimageadap);
        recyclerView.setAdapter(imageAdapter);

    }
}
