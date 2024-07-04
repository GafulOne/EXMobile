package com.example.exmobile_zem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView bulbasaur_panel=(CardView) findViewById(R.id.bulbasaur_panel);
        CardView charmander_panel=(CardView) findViewById(R.id.charmander_panel);
        CardView squirtle_panel=(CardView) findViewById(R.id.squirtle_panel);
        CardView butterfree_panel=(CardView) findViewById(R.id.butterfree_panel);
        CardView pikachu_panel=(CardView) findViewById(R.id.pikachu_panel);
        CardView gastly_panel=(CardView) findViewById(R.id.gastly_panel);
        CardView ditto_panel=(CardView) findViewById(R.id.ditto_panel);
        CardView mew_panel=(CardView) findViewById(R.id.mew_panel);
        CardView aron_panel=(CardView) findViewById(R.id.aron_panel);

        aron_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Aron.class);
                startActivity(intent);
            }
        });

        mew_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Mew.class);
                startActivity(intent);
            }
        });

        ditto_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Ditto.class);
                startActivity(intent);
            }
        });

        gastly_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Gastly.class);
                startActivity(intent);
            }
        });

        pikachu_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Pikachu.class);
                startActivity(intent);
            }
        });


        butterfree_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Butterfree.class);
                startActivity(intent);
            }
        });

        squirtle_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_Squirtle.class);
                startActivity(intent);
            }
        });

        charmander_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Maket_2.class);
                startActivity(intent);
            }
        });

        bulbasaur_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Pokemon_Maket.class);
                startActivity(intent);
            }
        });

        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}