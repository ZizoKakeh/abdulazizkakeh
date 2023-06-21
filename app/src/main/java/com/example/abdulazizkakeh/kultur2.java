package com.example.abdulazizkakeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class kultur2 extends AppCompatActivity {
    TextView ali1,lahm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kultur2);
        ali1 = (TextView) findViewById(R.id.ali1);
        lahm = (TextView) findViewById(R.id.lahm);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Kültür :");

        ali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent al1 = new Intent(kultur2.this,ali.class);
                startActivity(al1);
            }
        });
        lahm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lm = new Intent(kultur2.this,lahem.class);
                startActivity(lm);
            }
        });
    }
}