package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_menu;
    private Button btn_order;
    private Button btn_lokasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // button sayur_bayam
        btn_menu=(Button)findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menumakananIntent = new Intent(MainActivity.this, menu.class);
                startActivity(menumakananIntent);
            }
        });

        // button timun
        btn_order=(Button)findViewById(R.id.btn_order);
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ordermakananIntent = new Intent(MainActivity.this, order.class);
                startActivity(ordermakananIntent);
            }
        });

        // button wortel
        btn_lokasi=(Button)findViewById(R.id.btn_lokasi);
        btn_lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lokasiIntent = new Intent(MainActivity.this, menu.class);
                startActivity(lokasiIntent);
            }
        });

    }

}

