package com.example.thegreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    //Step 2 Decalaring views
    TextView textView;
    Button btn;
    EditText edtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview1);

        btn = findViewById(R.id.btn1);

        edtext = findViewById(R.id.edittext1);

        //Adding Functionalities

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtext.getText().toString();


                //Displaying the entered name

                Toast.makeText(MainActivity.this,"Hello "+name,Toast.LENGTH_LONG).show();
            }
        });
    }
}