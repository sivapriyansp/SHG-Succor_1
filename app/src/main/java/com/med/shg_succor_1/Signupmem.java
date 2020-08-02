package com.med.shg_succor_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signupmem extends AppCompatActivity {

    //con't enter b2 or OTP-btn
    Button b1,b2;
    TextView textView;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupmem);
        b1 = findViewById(R.id.butt_sigup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Signupmem.this,Dashboard.class);
                startActivity(intent1);
            }
        });

        textView = findViewById(R.id.logincondition);
        textView.setOnClickListener(new View.OnClickListener() {
            private Object Loginmem;

            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(Signupmem.this, loginmem.class);
                startActivity(intent2);

            }
        });

    }}