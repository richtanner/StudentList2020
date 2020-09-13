package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class mppFile extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView ideas;
    //hola
    // Array of strings...
    String ideaList[] = {
            "Brick Simulator",
            "Graph Maker",
            "DVD Player Screen",
            "Shape Builder",
            "Bouncer",
            "Tank Warfare",
            "Cracked Glass Simulator",
            "Wikipedia Article Finder",
            "Rock Paper Scissors Simulator",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpp_file);
        ideas = (ListView)findViewById(R.id.ideas);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textViewInLists, ideaList);
        ideas.setAdapter(arrayAdapter);
        ideas.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String chosen = (String) ideas.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {
            case 0:
                Toast.makeText(this, chosen + " Im begging you to work correctly android studio!!", Toast.LENGTH_LONG).show();
                break;
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, chosen + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (chosen == "Brick Simulator") {
            // go to a new activity
            Context context = ideas.getContext();
            Intent intent = new Intent(context, BrickSim.class);
            context.startActivity(intent);

        }
    }
}