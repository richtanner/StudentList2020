package com.cs315.studentlist2020;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CarsonKelleyActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView ideaList;

    // Array of strings...
    String langArray[] = {
            "A To Do List App where you can list things that you need to get done and update the status on your progress.",
            "Golf Score Tracker App that lets you keep track of your score and you can compare your score to your previous games",
            "Average Speed App that tracks your starting and ending location and how much time it took you to get there and calculates your average speed",
            "Strobe Light App that just flashes your screen a bunch on activation",
            "Ice Cream Builder that lets you build your ice cream cone with a number of different flavors (CLICK ME)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carson_kelley);
        ideaList = (ListView)findViewById(R.id.idea_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        ideaList.setAdapter(arrayAdapter);
        ideaList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String ideaSelected = (String) ideaList.getAdapter().getItem(position);

        switch (position) {
            case 4:
                // go to a new activity
                Context context = ideaList.getContext();
                Intent intent = new Intent(context, IdeaActivity.class);
                context.startActivity(intent);
            default:
        }
    }
}