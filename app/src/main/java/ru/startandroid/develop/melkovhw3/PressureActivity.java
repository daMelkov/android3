package ru.startandroid.develop.melkovhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class PressureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        /* Systolic pressure */
        EditText edtSystolic = findViewById(R.id.edtSystolic);

        /* Diastolic pressure */
        EditText edtDiastolic = findViewById(R.id.edtDiastolic);

        /* Pulse */
        EditText edtPulse = findViewById(R.id.edtPulse);

        /* Tachycardia */
        Switch swTachycardia = findViewById(R.id.swTachycardia);

        /* Date */
        EditText edtDate = findViewById(R.id.edtDatePressure);

        /* Save */
        Button btnSave = findViewById(R.id.btnSavePressure);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
            }
        });
    }
}