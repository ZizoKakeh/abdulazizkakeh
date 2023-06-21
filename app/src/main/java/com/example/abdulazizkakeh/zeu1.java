package com.example.abdulazizkakeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class zeu1 extends AppCompatActivity {
    TextView text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeu1);
        text4 = (TextView) findViewById(R.id.text4);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Zeugma Mozaik Müzesi :");
        text4.setText("Gaziantep Zeugma Mozaik Müzesi gerek yapısal kompleksi gerekse içinde yer alan eserleri açısından dünyanın en önemli müzeleri arasında yer almaktadır. 30.000 m² lik Gaziantep Eski Tekel Fabrikası arazisi üzerine kurulan Müze Binası, 3 adet bina topluluğundan oluşan kompleks bir yapıya sahiptir. İdari birimler ve 3500 m² oturum alanı olan ve 3 kattan oluşan yaklaşık 7.075 m² lik sergi salonları bulunmaktadır.İki bin yıllık mozaiklerin yıllar içinde define avcılarının talanıyla eksilen parçaları, lazer sistemiyle görüntü olarak tamamlanmaktadır. Zeugma’daki mozaikler on üç renk armonisinden oluşmaktadır. Üç blok olarak inşa edilen Zeugma Mozaik Müzesi, mozaik ve arkeoloji müzeleriyle sergi ve konferans salonu olarak hizmet vermektedir. Müzede Zeugma'dan gelen mozaikler sergileniyor. Ayrıca Dünyaca ünlü \"Çingene Kızı\" mozaiği burada sergilenmektedir.");
    }
}