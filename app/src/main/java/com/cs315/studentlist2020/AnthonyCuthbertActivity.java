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

public class AnthonyCuthbertActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

        ListView AntList;

        // Array of strings...
        String langArray[] = {
                "C#",
                "Robots",
                "Dominos",
                "Java",
                "Cookies",
                "Pizza",
                "C++",
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.anthonycuthbert_activity);
            AntList = (ListView)findViewById(R.id.AntList);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
            AntList.setAdapter(arrayAdapter);
            AntList.setOnItemClickListener(this);  // set THIS class as the listener
        }

        @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            // we got notified that something was selected!  AND we know WHICH ITEM was selected!

            // get the value of the string in the specific position of the array that was selected (tapped on)
            String selected = (String) AntList.getAdapter().getItem(position);

            /** do something cool based on the INDEX (int) of the selected item **/
            switch (position) {
                default:
                    // every case that wasn't specifically called out
                    Toast.makeText(this, selected + " selected", Toast.LENGTH_LONG).show();
                    break;
            }

            /** do something cool based on the VALUE (string) of the selected item **/
            if (selected == "Cookies") {
                // go to a new activity
                Context context = AntList.getContext();
                Intent intent = new Intent(context, cookies.class);
                context.startActivity(intent);
            }
        }
    }