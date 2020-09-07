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


public class BradyCActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView bccIdeaList;

    // Array of strings...
    String bradyArray[] = {
            "Budgeting App",
            "Count Down Timer",
            "Shopping App",
            "To-Do List",
            "Recipe Maker",
            "Study Guide App",
            "E-Book App"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brady_c);

        bccIdeaList = (ListView)findViewById(R.id.bcc_idea_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, bradyArray);
        bccIdeaList.setAdapter(arrayAdapter);
        bccIdeaList.setAdapter(arrayAdapter);
        bccIdeaList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) bccIdeaList.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {
            default:
                Toast.makeText(this, personSelected + " Actual Idea", Toast.LENGTH_LONG).show();
                break;
        }


        if (personSelected == "Budgeting App") {
            Context context = bccIdeaList.getContext();
            Intent intent = new Intent(context, BudgetIdeaActivity.class);
            context.startActivity(intent);
        }
    }
}