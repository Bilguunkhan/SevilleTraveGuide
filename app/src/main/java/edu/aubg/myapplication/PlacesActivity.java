package edu.aubg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
    }

    public void alcazarF(View view)
    {
        Intent intent = new Intent(PlacesActivity.this, AlcazarActivity.class);
        startActivity(intent);
    }

    public void cathedralF(View view)
    {
        Intent intent = new Intent(PlacesActivity.this, CathedralActivity.class);
        startActivity(intent);
    }

    public void plazaF(View view)
    {
        Intent intent = new Intent(PlacesActivity.this, PlazaActivity.class);
        startActivity(intent);
    }
}
