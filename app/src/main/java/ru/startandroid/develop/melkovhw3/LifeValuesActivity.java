package ru.startandroid.develop.melkovhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.startandroid.develop.melkovhw3.data.LifeValues;

public class LifeValuesActivity extends AppCompatActivity {
    private final static String TAG = "LifeValuesActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_values);

        /* Weight */
        final EditText edtWeight = findViewById(R.id.edtWeight);

        /* Steps count */
        final EditText edtStepCount = findViewById(R.id.edtStepCount);

        /* Save */
        Button btnSave = findViewById(R.id.btnLifeValues);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* weight */
                double weight = Double.parseDouble(String.valueOf(edtWeight.getText()));
                if(weight < 0 || weight > 300) {
                    Toast.makeText(LifeValuesActivity.this, "Вес должен быть в пределах 0...300!", Toast.LENGTH_SHORT).show();
                    return;
                }

                /* step count */
                int stepCount = Integer.parseInt(String.valueOf(edtStepCount.getText()));
                if(stepCount < 0) {
                    Toast.makeText(LifeValuesActivity.this, "Количество шагов должно быть положительным!", Toast.LENGTH_SHORT).show();
                    return;
                }

                LifeValues values = new LifeValues(weight, stepCount);
                Log.i(TAG, values.toString());
            }
        });
    }
}