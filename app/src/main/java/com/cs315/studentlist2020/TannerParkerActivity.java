package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TannerParkerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView appList;

    // Array of strings...
    String appIdea[] = {
            "Patch Notes for CoD: WZ",
            "Workout Routines",
            "RV/ATV Detailing",
            "Reloading Info: Shotgun Edition"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanner_parker);

        appList = (ListView) findViewById(R.id.PatchNotesIdea);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, appIdea);
        appList.setAdapter(arrayAdapter);
        appList.setOnItemClickListener(this);  // set THIS class as the listener
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String appSelected = (String) appList.getAdapter().getItem(position);

        /** do something cool based on the VALUE (string) of the selected item **/
        if (appSelected == "Patch Notes for CoD: WZ") {
            // go to a new activity
            Context context = appList.getContext();
            Intent intent = new Intent(context, PatchNoteActivity.class);
            context.startActivity(intent);
        } else if (appSelected == "Workout Routines") {
            // go to a new activity
            Context context = appList.getContext();
            Intent intent = new Intent(context, WorkoutActivity.class);
            context.startActivity(intent);
        } else if (appSelected == "RV/ATV Detailing") {
            // go to a new activity
            Context context = appList.getContext();
            Intent intent = new Intent(context, RvAtvActivity.class);
            context.startActivity(intent);
        } else if (appSelected == "Reloading Info: Shotgun Edition") {
            // go to a new activity
            Context context = appList.getContext();
            Intent intent = new Intent(context, ReloadingActivity.class);
            context.startActivity(intent);
        }
    }
}