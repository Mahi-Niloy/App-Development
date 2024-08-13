package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;

ArrayList<ContactModel> arrContacts=new ArrayList<>();
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

        recyclerView=findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.a,"A","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.b,"B","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.c,"C","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.d,"D","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.e,"E","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.a,"F","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.b,"G","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.c,"H","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.d,"I","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.e,"J","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.a,"K","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.b,"L","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.a,"A","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.b,"B","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.c,"C","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.d,"D","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.e,"E","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.a,"F","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.b,"G","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.c,"H","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.d,"I","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.e,"J","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.a,"K","01751275757"));
        arrContacts.add(new ContactModel(R.drawable.b,"L","01751275757"));

        RecyclerContactAdapert adapert=new RecyclerContactAdapert(this,arrContacts);
        recyclerView.setAdapter(adapert);
    }
}