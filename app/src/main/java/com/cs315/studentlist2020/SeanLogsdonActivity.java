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

public class SeanLogsdonActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView ProjListSL;

    // Array of strings...
    String projArray[] = {
            "Best Deal Calculator",
            "Water Reminder",
            "HealthE"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sean_logsdon);

        ProjListSL = (ListView)findViewById(R.id.ProjListSL);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, projArray);
        ProjListSL.setAdapter(arrayAdapter);
        ProjListSL.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String SALAppSelected = (String) ProjListSL.getAdapter().getItem(position);

        if (SALAppSelected == "HealthE") {
            // go to a new activity
            Context context = ProjListSL.getContext();
            Intent intent = new Intent(context, HealthE.class);
            context.startActivity(intent);
        }

       else if (position == 4) {// by specific index
            Toast.makeText(this, SALAppSelected + " wrote some jank code!!", Toast.LENGTH_LONG).show();
        }

       else {// every case that wasn't specifically called out
            Toast.makeText(this, SALAppSelected + " selected", Toast.LENGTH_LONG).show();
        }
    }
}