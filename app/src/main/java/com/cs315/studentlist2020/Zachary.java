package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Zachary extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView ZteList;

    // Array of strings...
    String ideaArray[] = {
            "Social Media Follower",
            "Birthday Card Reminder",
            "Don't Click This One",
            "..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zachary);
        ZteList = (ListView) findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, ideaArray);
        ZteList.setAdapter(arrayAdapter);
        ZteList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String personSelected = (String) ZteList.getAdapter().getItem(position);
        if(personSelected == "Social Media Follower") {
            Context context = ZteList.getContext();
            Intent intent = new Intent(context, Zachary.class);
            context.startActivity(intent);
        }

    }
}