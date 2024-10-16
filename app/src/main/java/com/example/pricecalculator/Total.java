package com.example.pricecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class Total extends AppCompatActivity {
    Button btnBack;
    ImageButton btnInfo;
    TextView txtProduct, txtQty, txtPrice, txtCesc, txtIva, txtSub, txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);
        btnBack = findViewById(R.id.btnBack);
        btnInfo = findViewById(R.id.btnInfo);
        txtProduct = findViewById(R.id.txtProduct);
        txtQty = findViewById(R.id.txtQty);
        txtPrice = findViewById(R.id.txtPrice);
        txtCesc = findViewById(R.id.txtCesc);
        txtIva = findViewById(R.id.txtIva);
        txtSub = findViewById(R.id.txtSub);
        txtTotal = findViewById(R.id.txtTotal);
    Intent intent = getIntent();
    String getProduct = intent.getStringExtra("product");
    String getQuantity = intent.getStringExtra("quantity");
    String getPrice = intent.getStringExtra("price");

    txtProduct.setText(getProduct);
    txtQty.setText(getQuantity);
    txtPrice.setText("$" + getPrice);

    Double qtyVal = Double.valueOf(getQuantity);
    Double priceVal = Double.valueOf(getPrice);

    Double cescCalc = (qtyVal*priceVal)*0.05;
    String cescVal = String.format("%.2f", cescCalc);

    Double ivaCalc = (qtyVal*priceVal)*0.13;
    String ivaVal = String.format("%.2f", ivaCalc);

    Double subCalc = (qtyVal * priceVal);
    String subVal = String.valueOf(subCalc);

    Double totalCalc = (subCalc + cescCalc + ivaCalc);
    String totalVal = String.format("%.2f", totalCalc);

    txtCesc.setText("$"+cescVal);
    txtIva.setText("$"+ivaVal);
    txtSub.setText("$"+ subVal);
    txtTotal.setText("$"+totalVal);



    btnInfo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            infoActivity();
        }
    });



    btnBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });


    }
    private void infoActivity(){
        Intent infoActivity = new Intent(Total.this, About.class);
        startActivity(infoActivity);
    }



}
