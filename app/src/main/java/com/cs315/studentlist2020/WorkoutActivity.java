package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutActivity extends AppCompatActivity {

    ListView workoutList;

    // Array of strings...
    String workoutIdea[] = {
            "Different workouts labeled:",
            "Arms, Legs, Shoulders",
            "Send to another activity with various workouts for different parts of the body chosen by the user"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patch_note);
        workoutList = (ListView) findViewById(R.id.PatchNotesIdea);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, workoutIdea);
        workoutList.setAdapter(arrayAdapter);
    }
}