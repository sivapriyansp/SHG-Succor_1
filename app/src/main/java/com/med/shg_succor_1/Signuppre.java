package com.med.shg_succor_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signuppre extends AppCompatActivity {
    //n't enter the b2 OTPbtn
    Button b1,b2;
    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppre);

        textView= (TextView) findViewById(R.id.condition);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Signuppre.this,Loginpre.class);
                startActivity(intent);

            }
        });
        b1 = findViewById(R.id.butt_sigup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signuppre.this, Dashboard.class);
                startActivity(intent);
            }});


    }}