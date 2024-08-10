package com.example.e_book;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ImageButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r;
    @SuppressLint("MissingInflatedId")
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
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("My EBook");

        //find id's
        a=(ImageButton) findViewById(R.id.a);
        b=(ImageButton) findViewById(R.id.b);
        c=(ImageButton) findViewById(R.id.c);
        d=(ImageButton) findViewById(R.id.d);
        e=(ImageButton) findViewById(R.id.e);
        f=(ImageButton) findViewById(R.id.f);
        g=(ImageButton) findViewById(R.id.g);
        h=(ImageButton) findViewById(R.id.h);
        i=(ImageButton) findViewById(R.id.i);
        j=(ImageButton) findViewById(R.id.j);
        k=(ImageButton) findViewById(R.id.k);
        l=(ImageButton) findViewById(R.id.l);
        m=(ImageButton) findViewById(R.id.m);
        n=(ImageButton) findViewById(R.id.n);
        o=(ImageButton) findViewById(R.id.o);
        p=(ImageButton) findViewById(R.id.p);
        q=(ImageButton) findViewById(R.id.q);
        r=(ImageButton) findViewById(R.id.r);


        //setOnClick listener
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, one.class);
                startActivity(intent1);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, two.class);
                startActivity(intent2);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, three.class);
                startActivity(intent3);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, four.class);
                startActivity(intent4);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this, five.class);
                startActivity(intent5);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this, six.class);
                startActivity(intent6);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MainActivity.this, seven.class);
                startActivity(intent7);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(MainActivity.this, eight.class);
                startActivity(intent8);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(MainActivity.this, nine.class);
                startActivity(intent9);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(MainActivity.this, ten.class);
                startActivity(intent10);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(MainActivity.this, eleven.class);
                startActivity(intent11);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(MainActivity.this, twelve.class);
                startActivity(intent12);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(MainActivity.this, thirteen.class);
                startActivity(intent13);
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14 = new Intent(MainActivity.this, fourteen.class);
                startActivity(intent14);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15 = new Intent(MainActivity.this, fifteen.class);
                startActivity(intent15);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(MainActivity.this, sixteen.class);
                startActivity(intent16);
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17 = new Intent(MainActivity.this, seventeen.class);
                startActivity(intent17);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18 = new Intent(MainActivity.this, eighteen.class);
                startActivity(intent18);
            }
        });







    }
}}