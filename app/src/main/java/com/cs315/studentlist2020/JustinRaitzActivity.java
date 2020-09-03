package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JustinRaitzActivity extends AppCompatActivity {

    ListView ideaList;

    // Array of strings...
    String ideaArray[] = {
            "Route Creation Running App",
            "Calorie Tracker App",
            "Sports Team Camera App"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justin_raitz);

        ideaList = (ListView)findViewById(R.id.idea_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, ideaArray);
        ideaList.setAdapter(arrayAdapter);
    }
}