package com.example.abdulazizkakeh;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lsetantap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Gaziantep ili");
        lsetantap = findViewById(R.id.lesttext);

        final List<String> buttonLabels = Arrays.asList("ŞEHİR:", " TARIH:", "Kültür:","Tatlıları:");

        ButtonListAdapter adapter = new ButtonListAdapter(this, buttonLabels, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                String label = buttonLabels.get(position);

                Toast.makeText(MainActivity.this, "Clicked " + label, Toast.LENGTH_SHORT).show();

                // Perform different tasks based on the clicked button
                switch (position) {
                    case 0:
                             Intent sh = new Intent(MainActivity.this,shant.class);
                             startActivity(sh);
                        break;
                    case 1:
                        Intent tarh = new Intent(MainActivity.this,antrih.class);
                        startActivity(tarh);
                        break;
                    case 2:
                        Intent kul = new Intent(MainActivity.this,kultur2.class);
                        startActivity(kul);
                        break;
                    case 3:
                        Intent tat = new Intent(MainActivity.this,tatli2.class);
                        startActivity(tat);
                        break;
                }
            }
        });

        lsetantap.setAdapter(adapter);
    }

    private class ButtonListAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<String> buttonLabels;
        private final View.OnClickListener buttonClickListener;

        public ButtonListAdapter(Context context, List<String> buttonLabels, View.OnClickListener buttonClickListener) {
            super(context, -1, buttonLabels);
            this.context = context;
            this.buttonLabels = buttonLabels;
            this.buttonClickListener = buttonClickListener;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Button button;

            if (convertView == null) {
                button = new Button(context);
                button.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
            } else {
                button = (Button) convertView;
            }

            String label = getItem(position);
            button.setText(label);
            button.setTag(position);

            button.setOnClickListener(buttonClickListener);

            return button;
        }


    }
}