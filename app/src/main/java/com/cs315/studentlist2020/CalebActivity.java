package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.cs315.studentlist2020.R;

public class CalebActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView appList;

    // Array of strings...
    String langArray[] = {
            "Beach Ball at a concert app",
            "DVD screen saver but it hits the corner every time app",
            "DND social media app",
            "AI Haiku app",
            "AI meme Generator app",
            "Did Jesus actually say that app",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caleb);

        appList = (ListView) findViewById(R.id.calebapp_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        appList.setAdapter(arrayAdapter);
        appList.setAdapter(arrayAdapter);
        appList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String personSelected = (String) appList.getAdapter().getItem(position);

        if (personSelected == "DND social media app") {
            Context context = appList.getContext();
            Intent intent = new Intent(context, CalebApp.class);
            context.startActivity(intent);

        }
    }
}