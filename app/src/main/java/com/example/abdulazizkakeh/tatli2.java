package com.example.abdulazizkakeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tatli2 extends AppCompatActivity {
    TextView bakl,batm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli2);
        bakl = (TextView) findViewById(R.id.bakl);
        batm = (TextView) findViewById(R.id.batm);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Tatlıları:");
        bakl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(tatli2.this,balk1.class);
                startActivity(ba);
            }
        });
        batm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bm = new Intent(tatli2.this,batma2.class);
                startActivity(bm);
            }
        });
    }
}