package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class batma2 extends AppCompatActivity {
     TextView text9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batma2);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Batma Kaymak :");
        text9= (TextView) findViewById(R.id.text9);
        text9.setText("Gaziantep'in yöresel yemekleri arasında bulunan batma kaymak, aslında bir kahvaltılık türüdür. Tatlılar konusunda zengin ve geniş bir menüye sahip olan Gaziantep'te yapılan bu tatlı kahvaltı sofralarının vazgeçilmezi olduğu kadar bayram sofralarında da yerini almaktadır. Batma kaymak oldukça farklı ve özel bir lezzettir. Bu yüzden Gaziantep'e gittiğinizde mutlaka denemelisiniz. Adı pek bilinmeyen ve diğer şehirlerde sıkça rastlanmayan bir yiyecektir. Batma kaymağın içerisinde; süt kaymağı, bal ve Antep fıstığı bulunmaktadır. Bu açıdan kalsiyum oranı yüksek bir tatlıdır ve güne enerjik bir şekilde başlamanızı sağlamaktadır. Batma kaymakta kullanılan kaymak tamamen doğaldır ve köylerden temin edilmektedir. Organik ve doğal bir tatlı olarak sizler için yerini alan batma kaymağı sizler de Gaziantep'te kesinlikle tüketmelisiniz.");
    }
}