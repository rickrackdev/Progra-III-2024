package com.example.pricecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnCalculate;
    EditText edTxtPdtName, edTxtQuantity, edTxtPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate = findViewById(R.id.btnCalculate);
        edTxtPdtName = findViewById(R.id.edTxtPdtName);
        edTxtQuantity = findViewById(R.id.edTxtQuantity);
        edTxtPrice = findViewById(R.id.edTxtPrice);

        btnCalculate.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }

    private void openActivity(){
        String getProduct = edTxtPdtName.getText().toString();
        String getQuantity = edTxtQuantity.getText().toString();
        String getPrice = edTxtPrice.getText().toString();
        Intent openActivity = new Intent(MainActivity.this, Total.class);
        openActivity.putExtra("product", getProduct);
        openActivity.putExtra("quantity", getQuantity);
        openActivity.putExtra("price", getPrice);
        startActivity(openActivity);
    }


}