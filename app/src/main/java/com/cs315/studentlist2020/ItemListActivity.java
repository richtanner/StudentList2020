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

public class ItemListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView simpleList;
    //hola
    // Array of strings...
    String peopleList[] = {
            "Fisher Coburn",
            "Brady Cox",
            "Anthony Cuthbert",
            "Zach Elledge-McGhee",
            "Will Gibbs",
            "Caleb Jackson",
            "Carson Kelley",
            "Ben Lamont",
            "Sean Logsdon",
            "Julio Lopez",
            "Nathan McKenzie",
            "Tanner Parker",
            "Matthew Pietrucha",
            "Garrett Powell",
            "Justin Raitz",
            "Miranda Ramirez Cospin",
            "Will Stanley",
            "Prof Tanner"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textViewInLists, peopleList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) simpleList.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {
            case 4:
                // case for Will
                Toast.makeText(this, personSelected + " gives it one more go...", Toast.LENGTH_LONG).show();
                break;
            case 9: // case for Julio
                Toast.makeText(this,personSelected + " is the coolest person!!", Toast.LENGTH_LONG).show();
                break;
            case 12: //case for Matthew
                Toast.makeText(this, personSelected + " Im begging you to work correctly android studio!!", Toast.LENGTH_LONG).show();
                break;
            case 17:
                // by specific index
                Toast.makeText(this, personSelected + " wrote some jank code!!", Toast.LENGTH_LONG).show();
                break;
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, personSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (personSelected == "Prof Tanner") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, ProfTannerActivity.class);
            context.startActivity(intent);

        }
        else if(personSelected == "Matthew Pietrucha") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, mppFile.class);
            context.startActivity(intent);
        }

        else if(personSelected == "Julio Lopez") {
            // go to Julio's new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, Julio.class);
            context.startActivity(intent);
        }
        else if(personSelected == "Zach Elledge-McGhee") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, Zachary.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Will Gibbs") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, GibbsActivity.class);
            context.startActivity(intent);
        }
    }
}