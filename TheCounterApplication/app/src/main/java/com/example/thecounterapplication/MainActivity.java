package com.example.thecounterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, countertext;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcometext);

        countertext = findViewById(R.id.countertext);

        btn = findViewById(R.id.btn1);


        //adding functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countertext.setText(""+increaseCounter());
            }
        });
    }
    public int increaseCounter(){
       return counter ++;
    }
}