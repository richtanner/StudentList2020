package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // as soon as THIS Activity loads, we know the APP has loaded, so
        // call for our Main Activity (ItemListActivity, in this case) to load up
        Intent intent = new Intent(this, ItemListActivity.class);
        startActivity(intent);
        finish();
    }
}