package com.example.pricecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Total extends AppCompatActivity {
    Button btnBack;
    TextView txtProduct, txtQty, txtPrice, txtCesc, txtIva, txtTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);

    }
}
