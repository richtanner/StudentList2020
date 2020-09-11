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

public class WillStanley extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "App Idea",
            "Maya Autodesk",
            "Blender 3D",
            "Adobe Photoshop",
            "Adobe Premiere Pro",
            "Substance Alchemist",
            "Substance Painter",
            "Substance Designer",
            "Unity 3D",
            "Unreal Engine"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_will_stanley);
        languageList = (ListView) findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
        languageList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String itemSelected = (String) languageList.getAdapter().getItem(position);

        switch (position) {
            case 0:
                Toast.makeText(this, itemSelected + " was thought of by Will!", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, itemSelected + " is a program Will uses!", Toast.LENGTH_LONG).show();

        }
        if (itemSelected == "App Idea") {
            // Go to the new tab under App Ideas
            Context context = languageList.getContext();
            Intent intent = new Intent(context, AppIdea.class);
            context.startActivity(intent);
        }
    }
}