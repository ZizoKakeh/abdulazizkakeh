package com.example.abdulazizkakeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class antrih extends AppCompatActivity {
    TextView Kales,zeu,bay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrih);
        Kales = (TextView) findViewById(R.id.Kales);
        zeu = (TextView) findViewById(R.id.zeu);
        bay = (TextView) findViewById(R.id.bay);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Tarih:");
        Kales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kal = new Intent(antrih.this,kalis1.class);
                startActivity(kal);
            }
        });
        zeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zu = new Intent(antrih.this,zeu1.class);
                startActivity(zu);
            }
        });
        bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bay1 = new Intent(antrih.this,bay.class);
                startActivity(bay1);
            }
        });


    }
}