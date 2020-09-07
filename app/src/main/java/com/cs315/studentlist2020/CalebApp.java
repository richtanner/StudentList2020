package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class CalebApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caleb_app);
        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);

        int imageResource = getResources().getIdentifier("@drawable/dndlogo", null, this.getPackageName());

        firstImage.setImageResource(imageResource);


    }
}