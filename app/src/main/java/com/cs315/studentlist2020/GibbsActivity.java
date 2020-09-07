package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GibbsActivity extends AppCompatActivity {

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "Restaurant Picker",
            "Cipher Encoder and Decoder",
            "Matrix Operation Calculator",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gibbs);

        languageList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}