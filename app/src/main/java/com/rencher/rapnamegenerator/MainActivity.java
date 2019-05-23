package com.rencher.rapnamegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView namesView;
    Button btn1;
    String newNames = "";
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        namesView = findViewById(R.id.namesView);
        scrollView = findViewById(R.id.scrollView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNames = (namegenerator.generateName(18));
                namesView.setText(newNames);
                scrollView.scrollTo(0,0);
            }
        });
    }
}
