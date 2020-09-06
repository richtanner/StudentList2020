package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReloadingActivity extends AppCompatActivity {
    ListView ReloadingList;

    // Array of strings...
    String ReloadingIdea[] = {
            "Go through the different sizes of 12 gauge",
            "Different sizes of grain",
            "Different sizes of shot",
            "Different powder",
            "How they work together to get the best shot speed"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patch_note);
        ReloadingList = (ListView) findViewById(R.id.PatchNotesIdea);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, ReloadingIdea);
        ReloadingList.setAdapter(arrayAdapter);
    }
}