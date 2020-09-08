package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RvAtvActivity extends AppCompatActivity {
    ListView RvAtvList;

    // Array of strings...
    String RvAtvIdea[] = {
            "Get a sign in for user",
            "Add vehicles to profile",
            "Use google calendar to set up times to detail vehicles"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patch_note);
        RvAtvList = (ListView) findViewById(R.id.PatchNotesIdea);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, RvAtvIdea);
        RvAtvList.setAdapter(arrayAdapter);
    }
}