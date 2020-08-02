package com.med.shg_succor_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        // private Spinner CustomSpinner; implements AdapterView.OnItemSelectedListener
        private Button b1,b2,b3;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            b2 = findViewById(R.id.btn_president);


            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent int2 = new Intent(MainActivity.this,Signuppre.class);
                    startActivity(int2);
                }
            });

            b3 = findViewById(R.id.btn_group);
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent int3 = new Intent(MainActivity.this,Signupmem.class);
                    startActivity(int3);
                }
            });
        }}


