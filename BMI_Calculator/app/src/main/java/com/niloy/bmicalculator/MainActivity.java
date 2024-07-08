package com.niloy.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaration of variable
        EditText edtWeight,edtHeightFt,edtHeightIn;
        TextView txt_text;
        Button btnbutton;
        LinearLayout main;

        //find from their id
        edtWeight=findViewById(R.id.edtWeight);
        edtHeightFt=findViewById(R.id.edtHeightFt);
        edtHeightIn=findViewById(R.id.edtHeightIn);
        txt_text=findViewById(R.id.txt_text);
        btnbutton=findViewById(R.id.btnbutton);
        main=findViewById(R.id.main);

        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt= Integer.parseInt( edtWeight.getText().toString());
              int HF= Integer.parseInt(edtHeightFt.getText().toString());
              int HI= Integer.parseInt(edtHeightIn.getText().toString());

              int totalIn=HF*12+HI;
              double totalCm=totalIn*2.53;
              double totalM=totalCm/100;
              double BMI= wt/(totalM*totalM);
              if (BMI>25) {
                  txt_text.setText("You're overweight!");
                  main.setBackgroundColor(getResources().getColor(R.color.Red));
              } else if (BMI<18) {
                  txt_text.setText("You are underweight!");
                  main.setBackgroundColor(getResources().getColor(R.color.Yellow));

              }
              else {
                  txt_text.setText("You're healthy!");
                  main.setBackgroundColor(getResources().getColor(R.color.Green));
              }


            }
        });






    }
}