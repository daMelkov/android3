package ru.startandroid.develop.melkovhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class PressureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        EditText edtSystolic = findViewById(R.id.edtSystolic);
        EditText edtDiastolic = findViewById(R.id.edtDiastolic);
        EditText edtPulse = findViewById(R.id.edtPulse);
        Switch swTachycardia = findViewById(R.id.swTachycardia);

    }
}