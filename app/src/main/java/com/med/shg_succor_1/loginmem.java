package com.med.shg_succor_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginmem extends AppCompatActivity {
    Button b1,b2;
    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmem);

        b2 = findViewById(R.id.but_loginmem);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(loginmem.this,Dashboard.class);
                startActivity(int1); }
        });

        textView = (TextView) findViewById(R.id.signupcondition);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( loginmem.this,Signupmem.class);
                startActivity(intent);
            }
        });
    }}