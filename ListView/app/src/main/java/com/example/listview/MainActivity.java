package com.example.listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    Spinner spinner;
    ArrayList<String> arrayID= new ArrayList<>();
    AutoCompleteTextView acTV;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Removed EdgeToEdge.enable(this); since it's incorrect
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        acTV=findViewById(R.id.acTV);
        listView = findViewById(R.id.lView);
        spinner=findViewById(R.id.spinner);

        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");
        arrayList.add("Niloy");

        //Array ID from here
        arrayID.add("National ID card");
        arrayID.add("Driving ID card");
        arrayID.add("PAN ID card");
        arrayID.add("Voter ID card");
        arrayID.add("Smart ID card");

        // Add as many items as you want...

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);


        //Array adapter for spinner
        ArrayAdapter<String> IDadapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayID);
        spinner.setAdapter(IDadapter);
        acTV.setAdapter(IDadapter);
        acTV.setThreshold(1);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Toast will show for any item long-clicked
                Toast.makeText(getApplicationContext(), "Hello Niloy", Toast.LENGTH_SHORT).show();

                return true; // Ensure the event is marked as handled
            }
        });




    }
}
