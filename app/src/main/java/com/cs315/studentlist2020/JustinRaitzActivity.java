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

public class JustinRaitzActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView ideaList;

    // Array of strings...
    String[] ideaArray = {
            "Route Creator Running App",
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
        ideaList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String ideaSelected = (String) ideaList.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {
            case 0:
                // by specific index
                Toast.makeText(this, ideaSelected + " is one of Justin's app ideas!!", Toast.LENGTH_LONG).show();
                break;
            case 1:
                // by specific index
                Toast.makeText(this, ideaSelected + " is another app idea of Justin's!!", Toast.LENGTH_LONG).show();
                break;
            case 2:
                // by specific index
                Toast.makeText(this, ideaSelected + " is yet another app idea of Justin's!!", Toast.LENGTH_LONG).show();
                break;
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, ideaSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (ideaSelected.equals("Route Creator Running App")) {
            // go to a new activity
            Context context = ideaList.getContext();
            Intent intent = new Intent(context, RouteCreationRunning.class);
            context.startActivity(intent);
        }
    }
}