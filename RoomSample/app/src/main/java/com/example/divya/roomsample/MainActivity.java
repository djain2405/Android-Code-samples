package com.example.divya.roomsample;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText age;
    private Button save;
    private AppDatabase db;
    private Person p;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        save = (Button) findViewById(R.id.save);

        db = AppDatabase.getAppDatabase(getApplicationContext());
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.personDao().InsertPerson(new Person(name.getText().toString(), Integer.parseInt(age.getText().toString())));
            }
        });



    }
}
