package com.example.bengalinovels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton novel1,novel2,novel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //find id
        novel1=(ImageButton) findViewById(R.id.novel1);
        novel2=(ImageButton) findViewById(R.id.novel2);
        novel3=(ImageButton) findViewById(R.id.novel3);

        //onclick listener

       novel1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent2=new Intent(MainActivity.this,pdf2.class);
               startActivity(intent2);
           }

       });


       novel2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent1=new Intent(MainActivity.this,pdf1.class);
                startActivity(intent1);
           }
       });


       novel3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent3=new Intent(MainActivity.this,pdf3.class);
               startActivity(intent3);
           }
       });


    }
}