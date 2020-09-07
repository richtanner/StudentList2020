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

public class BenLamontActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView ideaList;

    // Array of strings...
    String ideaArray[] = {
            "Connecting to a database",
            "Personal Favor",
            "Text Based Adventure Game"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ben_lamont);

        ideaList = (ListView)findViewById(R.id.idea_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, ideaArray);
        ideaList.setAdapter(arrayAdapter);
        ideaList.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String ideaSelected = (String) ideaList.getAdapter().getItem(position);

        /** do something cool based on the VALUE (string) of the selected item **/
        if (ideaSelected == "Personal Favor") {
            // go to a new activity
            Context context = ideaList.getContext();
            Intent intent = new Intent(context, BenLamontIdea.class);
            context.startActivity(intent);
        }

    }
}