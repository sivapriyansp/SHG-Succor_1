package com.med.shg_succor_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    public Button b1, b2, b3, b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.btn1 :
                i = new Intent(this, Editprofile.class);
                startActivity(i);
                break;
            case R.id.btn2 :
                i = new Intent(this, Memberslist_p.class);
                startActivity(i);
                break;
            case R.id.btn3 :
                i = new Intent(this, Loan.class);
                startActivity(i);
                break;
            case R.id.btn4:
                i = new Intent(this, Transactionp.class);
                startActivity(i);
                break;
            case R.id.btn5 :
                i = new Intent(this, Report.class);
                startActivity(i);
                break;
            case R.id.btn6:
                i = new Intent(this, Settings.class);
                startActivity(i);
                break;
        }

    }
}
