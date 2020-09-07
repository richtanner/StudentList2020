package com.cs315.studentlist2020;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ItemListActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView simpleList2;

    // Array of strings...
    String ideaList[] = {
            "Visual Planner",
            "Other Idea"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gp);
        simpleList2 = (ListView)findViewById(R.id.language_list2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textViewInLists, ideaList);
        simpleList2.setAdapter(arrayAdapter);
        simpleList2.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String itemSelected = (String) simpleList2.getAdapter().getItem(position);

        if (itemSelected == "Visual Planner") {
            // go to a new activity
            Context context = simpleList2.getContext();
            Intent intent = new Intent(context, thirdActivity.class);
            context.startActivity(intent);
        }
    }
}
