package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class shant extends AppCompatActivity {
  TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shant);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Gaziantep Tarihi:");
        text1 = (TextView) findViewById(R.id.text1);
        text1.setText("Gaziantep ya da eski ve halk arasındaki kısa adıyla Antep (Osmanlıca: Ayntab) Türkiye'nin bir ili ve en kalabalık dokuzuncu, şehir merkez nüfusuyla en kalabalık 6. şehri. 2022 itibarıyla 2.154.051 nüfusa sahiptir. Akdeniz ile Güneydoğu Anadolu Bölgesi'nin kesişme noktasında bulunan Türkiye'nin önemli şehirlerinden Gaziantep; sanayi ve gelişmişlik bakımından ilk sıralarda yer alır. Eğitim, ticaret ve sanayi şehridir. Hâlâ yaşanılan en eski kentlerinden biridir. Bunların yanında Gaziantep, Türkiye sanayisi ve ticaretinde de çok önemli bir yer tutar. Bunun sebepleri arasında Gaziantep'in Anadolu ile Orta Doğu arasında bir konumda bulunması ve liman kentlerine yakınlığı sayılabilir.Gaziantep'in simgeleri arasında Gaziantep Kalesi sayılabilir.");
    }
}