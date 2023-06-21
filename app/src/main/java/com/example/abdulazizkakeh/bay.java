package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bay extends AppCompatActivity {
    TextView text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bay);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Bayazhan Gaziantep Kent Müzesi :");
        text5= (TextView) findViewById(R.id.text5);
        text5.setText("Bayaz Ahmet Efendi tarafından 1909 yılında yaptırılmış olan Bayazhan'ın mülkiyeti 2005 yılında Gaziantep Büyükşehir Belediyesine geçmiş olup röleve, restitüsyon ve restorasyon projeleri hazırlanmış, Adana Kültür ve Tabiat Varlıklarını Koruma Kurulu tarafından da onaylanmıştır. Belediyenin yapmış olduğu görüşmeler neticesinde TOKİ tarafından restorasyonu tamamlanmıştır. Büyükşehir Belediyemiz tarafından şehrimize kazandırılan Bayazhan Gaziantep Kent Müzesi sesli rehber sistemi ile anlatılmaktadır. Odalardaki plazmalarda oynayan filmlerin sesleri ve maketlerin bilgileri otomatik olarak kulaklıktan dinlenmekte olup, kiosklardan Kent Rehberine ulaşılabilinmektedir. Gaziantep'i her yönü ile anlatan ve çeşitli güzelliklerini tek mekânda seyrettirmeyi amaçlayan müze ziyaretçilerine Gaziantep hakkında çok geniş bilgi sunmaktadır");

    }
}