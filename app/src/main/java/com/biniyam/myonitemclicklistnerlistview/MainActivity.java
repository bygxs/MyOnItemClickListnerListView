package com.biniyam.myonitemclicklistnerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView = findViewById(R.id.listView);

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        list.add("Ginger");
            // i didn't have to use ApplicationContext context
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        // listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        listView.setOnItemClickListener((parent, view, position, id) -> {
            if(position ==0){
                //click apple

                startActivity(new Intent(MainActivity.this, AppleActivity.class));
            }else if(position==1){

                startActivity(new Intent(MainActivity.this,OrangeActivity.class));
                // clicked orange
            }
        });

    }
}