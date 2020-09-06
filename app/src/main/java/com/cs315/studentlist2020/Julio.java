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

public class Julio extends AppCompatActivity implements AdapterView.OnItemClickListener {

    // Declaring a ListView for the list we will make
    ListView idea_list;

    String app_idea[] = {
            "Password Manager",
            "Parking Space Finder App",
            "Language Learning App",
            "Quick Audition",
            "Running App Loop"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_julio);

        // Do stuff with the ListView
        idea_list = (ListView)findViewById(R.id.julio_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, app_idea);
        idea_list.setAdapter(arrayAdapter);
        idea_list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String itemSelected = (String) idea_list.getAdapter().getItem(position);

        switch(position) {
            case 3:
                Toast.makeText(this,itemSelected + " is ready to record your audition!", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, itemSelected + " was selected.", Toast.LENGTH_LONG).show();
        }

        if(itemSelected == "Quick Audition") {
            // Go to the new activity of Quick Audition
            Context context = idea_list.getContext();
            Intent intent = new Intent(context, QuickAudition.class);
            context.startActivity(intent);
        }
    }
}