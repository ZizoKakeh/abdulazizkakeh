package com.example.abdulazizkakeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class kalis1 extends AppCompatActivity {
    TextView text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalis1);
        text3 = (TextView) findViewById(R.id.text3);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Gaziantep Kales :");
        text3.setText("Gaziantep'in merkezindeki bir tepeye kurulmuş olan kale. Ne zaman inşa edildiği bilinmemekle birlikte, Hititler döneminde gözlem amaçlı kullanıldığı bilinmektedir. Kale, tarih boyunca birçok kez restore edilmiş ve son halini 2000'li yılların başında yapılan bir restorasyon ile almıştır.Daire biçimindeki kalenin çevresi 1200 metredir. Duvarları taş bloklardan yapılmış olup 12 kulesi ve burçları vardır. Kale, günümüzde \"Gaziantep Savunması ve Kahramanlık Panoraması Müzesi olarak kullanılmaktadır. Gaziantep'in gösterdiği savunma 45 dakikalık bir belgeselle kale içerisinde gösterilmektedir. Kale, 2023 Kahramanmaraş depremlerinde ağır hasar aldı.");
    }
}