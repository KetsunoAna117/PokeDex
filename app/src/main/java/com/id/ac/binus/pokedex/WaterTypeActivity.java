package com.id.ac.binus.pokedex;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class WaterTypeActivity extends AppCompatActivity {
    ListView lvData;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.water_type);

        lvData = findViewById(R.id.lvData);


    }

}
