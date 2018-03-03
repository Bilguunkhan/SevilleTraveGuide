package edu.aubg.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void placesF(View view)
    {
        Intent intent = new Intent(MenuActivity.this, PlacesActivity.class);
        startActivity(intent);
    }

    public void videosF(View view)
    {
        Intent intent = new Intent(MenuActivity.this, VideosActivity.class);
        startActivity(intent);
    }

    public void googleF(View view)
    {
        Intent intent = new Intent(MenuActivity.this, MapsActivity.class);
        startActivity(intent);
    }
}
