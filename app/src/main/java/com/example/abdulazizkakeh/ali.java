package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ali extends AppCompatActivity {
    TextView text6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Ali Nazik Kebabı :");
        text6 = (TextView) findViewById(R.id.text6);
        text6.setText("Ali Nazik kebabı, Gaziantep'in zengin kebap çeşitleri içerisinde en çok tüketilen kebaplardan birisidir. İçerisinde kalsiyum ve protein bakımından zengin gıdalar barındıran Ali Nazik kebabı sağlıklı ve doğal bir yiyecektir. Gaziantep'e gittiğinizde ünü birçok şehre ulaşan kökeni Gaziantep'e ait olan Ali Nazik kebabını mutlaka denemelisiniz. Ali Nazik kebabını denemek istiyorsanız Gaziantep'in merkez bölgesinde bulunan kebapçıları tercih edebilirsiniz. Ali Nazik kebabının içeriği ise oldukça yoğundur.Ali Nazik kebabının içerisinde; kıyma, soğan, biber, tereyağı, sıvı yağ, salça, tuz, karabiber, kekik,pul biber, yoğurt, sarımsak, patlıcan, limon suyu, kapya biber ve maydanoz bulunmaktadır.Zengin içeriği ve eşsiz lezzeti ile mutlaka denemeniz gereken bir yemek olan Ali Nazik kebabı,hemen hemen her şehrimizde yapılsa da Gaziantep'te tamamen yöreye özgü bir şekilde yapılmaktadır. Bu da bu eşsiz lezzeti Gaziantep farkı ile denemenize olanak tanımaktadır. Ali Nazik kebabı, küçük bir porsiyonu ile bile büyük ve kalabalık bir grubu doyurabilmektedir. Aynı zamanda bu kebap; yoğurtlu, beşamel soslu ya da kıymalı gibi farklı alternatiflere ayrılır.");

    }
}