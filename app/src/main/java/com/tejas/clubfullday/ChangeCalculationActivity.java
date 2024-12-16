package com.tejas.clubfullday;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChangeCalculationActivity extends AppCompatActivity {

    EditText edtChangeAmt;
    EditText edtChangeAmtPay;
    Button btnChangeSubmit;
    TextView tvChangeDiff;
    EditText edtChange500;
    EditText edtChange200;
    EditText edtChange100;
    EditText edtChange50;
    EditText edtChange20;
    EditText edtChange10;
    TextView tvChangeRec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_change_calculation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //link
        edtChangeAmt = findViewById(R.id.edtChangeAmt);
        edtChangeAmtPay  = findViewById(R.id.edtChangeAmtPay);
        btnChangeSubmit = findViewById(R.id.btnChangeSubmit);
        tvChangeDiff = findViewById(R.id.tvChangeDiff);

        edtChange500 = findViewById(R.id.edtChange500);
        edtChange200 = findViewById(R.id.edtChange200);
        edtChange100 = findViewById(R.id.edtChange100);
        edtChange50 = findViewById(R.id.edtChange50);
        edtChange20 = findViewById(R.id.edtChange20);
        edtChange10 = findViewById(R.id.edtChange10);

        tvChangeRec = findViewById(R.id.tvChangeRec);

        String zero = "0";
        edtChange500.setText(zero);
        edtChange200.setText(zero);
        edtChange100.setText(zero);
        edtChange50.setText(zero);
        edtChange20.setText(zero);
        edtChange10.setText(zero);






        //click
        btnChangeSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt =  Integer.parseInt(edtChangeAmt.getText().toString());//3762
                int paid = Integer.parseInt(edtChangeAmtPay.getText().toString());//4000
                int diff = paid - amt;
                tvChangeDiff.setText(diff+"");
            }
        });




        edtChange500.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    calculateAmount();
                }
            }
        });


        edtChange200.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    calculateAmount();
                }
            }
        });


        edtChange100.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    calculateAmount();
                }
            }
        });

        edtChange50.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    calculateAmount();
                }
            }
        });

        edtChange20.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    calculateAmount();
                }
            }
        });


        edtChange10.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    calculateAmount();
                }
            }
        });


    }

    void calculateAmount(){
       int amt500 = Integer.parseInt( edtChange500.getText().toString());
        int amt200 = Integer.parseInt( edtChange200.getText().toString());
        int amt100 = Integer.parseInt( edtChange100.getText().toString());
        int amt50 = Integer.parseInt( edtChange50.getText().toString());
        int amt20 = Integer.parseInt( edtChange20.getText().toString());
        int amt10 = Integer.parseInt( edtChange10.getText().toString());

        int totalRec = (amt500*500) + (amt200*200) + (amt100*100) + (amt50*50) + (amt20*20) + (amt10*10);

        Log.i("total",totalRec+"");

        tvChangeRec.setText(totalRec+"");
    }
}