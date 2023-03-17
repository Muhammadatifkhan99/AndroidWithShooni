package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tx;
    EditText et;
    EditText etp;
    Button bt;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tx = findViewById(R.id.textView);

        et = findViewById(R.id.email);
        String input = et.getText().toString();

        etp = findViewById(R.id.editPassword);

        String inputpassword = etp.getText().toString();



        bt = findViewById(R.id.signinbtn);

        //handling the click events on the button

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //specify the action to perform when bttn clicked
                Toast.makeText(MainActivity.this,"Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        imgview = findViewById(R.id.imageView3);

    }
}