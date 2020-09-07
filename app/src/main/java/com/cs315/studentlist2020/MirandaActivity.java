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

public class MirandaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView appList;

    // Array of strings...
    String appArray[] = {
            "Motivational",
            "Organize homework",
            "Grocery shopping",
            "Gift ideas",
            "Water reminder",
            "Healthy meals"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miranda);

        appList = (ListView)findViewById(R.id.app_list_mrc);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, appArray);
        appList.setAdapter(arrayAdapter);

        appList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String appSelected = (String) appList.getAdapter().getItem(position);

        if (appSelected == "Motivational") {
            Toast.makeText(this, appSelected + " More about the app", Toast.LENGTH_LONG).show();
            // go to a new activity
            Context context = appList.getContext();
            Intent intent = new Intent(context, MotivationalAppActivity.class);
            context.startActivity(intent);
        }

    }

}