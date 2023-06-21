package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class balk1 extends AppCompatActivity {
    TextView text8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balk1);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Baklava :");
        text8 = (TextView) findViewById(R.id.text8);
        text8.setText("Baklava Türkiye'de de Güneydoğu Anadolu Bölgesi'nde de en çok Gaziantep'te yapılmakta ve Gaziantep'e özgü bir şekilde sofralarda yerini almaktadır. Türk mutfağının önemli tatlarından olan baklava içerisinde Gaziantep'e özgü Antep fıstığı da kullanılabilmektedir. Baklava birçok çeşitte ve birçok türde olmak üzere Gaziantep'te mutlaka denemeniz gereken bir lezzettir.Baklava fiyatları çeşitlerine göre değişiklik göstermektedir. Gaziantep'in her yerinde baklavayı deneyebileceğiniz gibi merkezi bölgelerde bulunan tüm tatlıcılarda da baklavayı yiyebilirsiniz.");
    }
}