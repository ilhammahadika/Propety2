package com.example.zeilin.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ilham on 13/11/2016.
 */

public class Rumah extends AppCompatActivity {
    ViewPager viewPager;
    SwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rumah);
        viewPager= (ViewPager)findViewById(R.id.rumahPager);
        adapter=new SwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }

}
