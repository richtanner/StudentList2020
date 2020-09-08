package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PatchNoteActivity extends AppCompatActivity {
    ListView patchList;

    // Array of strings...
    String patchIdea[] = {
            "Have the dates of when they release",
            "Send to another activity",
            "In the other activity state new patch notes",
            "Seperate between changes to gun and game modes"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patch_note);
        patchList = (ListView) findViewById(R.id.PatchNotesIdea);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, patchIdea);
        patchList.setAdapter(arrayAdapter);
    }
}