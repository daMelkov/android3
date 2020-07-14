package ru.startandroid.develop.melkovhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import ru.startandroid.develop.melkovhw3.data.Pressure;

public class PressureActivity extends AppCompatActivity {
    private static final String TAG = "PressureActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        /* Systolic pressure */
        final EditText edtSystolic = findViewById(R.id.edtSystolic);

        /* Diastolic pressure */
        final EditText edtDiastolic = findViewById(R.id.edtDiastolic);

        /* Pulse */
        final EditText edtPulse = findViewById(R.id.edtPulse);

        /* Tachycardia */
        final Switch swTachycardia = findViewById(R.id.swTachycardia);

        /* Date */
        final EditText edtDate = findViewById(R.id.edtDatePressure);

        /* Save */
        Button btnSave = findViewById(R.id.btnSavePressure);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int systolic = Integer.parseInt(String.valueOf(edtSystolic.getText()));
                if(systolic < 50 || systolic > 200) {
                    Toast.makeText(PressureActivity.this, "Верхнее давление должно быть в диапазоне 50...200!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int diastolic = Integer.parseInt(String.valueOf(edtDiastolic.getText()));
                if(diastolic < 50 || diastolic > 200) {
                    Toast.makeText(PressureActivity.this, "Нижнее давление должно быть в диапазоне 50...200!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int pulse = Integer.parseInt(String.valueOf(edtPulse.getText()));
                if (pulse < 0 || pulse > 200) {
                    Toast.makeText(PressureActivity.this, "Пульс должен быть в диапазоне 0...200!", Toast.LENGTH_SHORT).show();
                    return;
                }

                boolean tachycardia = swTachycardia.isChecked();

                String date = String.valueOf(edtDate.getText());

                Pressure pressure = new Pressure(systolic, diastolic, pulse, tachycardia, date);
                Log.i(TAG, pressure.toString());
            }
        });
    }
}