package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class lahem extends AppCompatActivity {
    TextView text7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lahem);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Lahmacun:");
        text7 = (TextView) findViewById(R.id.text7);
        text7.setText("Hemen hemen herkesin çok sevdiği lahmacun, Gaziantep'te de yöreye özgü bir şekilde sizler ile buluşmaktadır. Gerçekten ülke sınırları içerisinde en çok sevilen yemekler arasında yer alan lahmacun, Gaziantep'te de büyük bir ilgi görmektedir. İçeriği de oldukça yoğundur ve gayet doyurucu bir yiyecektir. Gaziantep'e gittiğinizde mutlaka lahmacunun tadına da bakmalısınız.Gaziantep lahmacunu diğer şehirlerde yapılan lahmacunlardan fiziken farklı olmasa da tat olarak oldukça farklıdır. Gaziantep'te yapılan ve mutlaka denemeniz gereken lahmacunun içerisinde; kıyma, domates, biber, maydanoz, soğan, sarımsak, salça, sıvı yağ, karabiber, pul biber ve tuz vardır. Hem sebze hem de baharatlar açısından oldukça zengin bir yiyecektir ve gayet faydalıdır. Gaziantep lahmacununda ise kıyma ve sebze oranı boldur. Bu da lahmacunun aromasını arttırır ve tadındaki lezzeti de fazlalaştırır. Bu sebeple Gaziantep lahmacunu çok ilgi görmekte ve sevilmektedir. Ayrıca içerisindeki baharat yoğunluğu ile antioksidan bir özelliğe de sahiptir. Lahmacun yediden yetmişe herkesin sevdiği bir lezzettir.");


    }
}