package ru.startandroid.develop.melkovhw3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Name */
        EditText edtName = findViewById(R.id.edtName);

        /* Age */
        EditText edtAge = findViewById(R.id.edtStepCount);

        /* Save */
        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ;
            }
        });

        /* Pressure */
        Button btnPressure = findViewById(R.id.btnPressure);
        btnPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });

        /* LifeValues */
        Button btnLifeValues = findViewById(R.id.btnLifeValues);
        btnLifeValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LifeValuesActivity.class);
                startActivity(intent);
            }
        });
    }
}