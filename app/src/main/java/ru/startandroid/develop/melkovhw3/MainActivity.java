package ru.startandroid.develop.melkovhw3;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ru.startandroid.develop.melkovhw3.data.User;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TAG";
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Name */
        final EditText edtName = findViewById(R.id.edtWeight);

        /* Age */
        final EditText edtAge = findViewById(R.id.edtStepCount);

        /* Save */
        Button btnSave = findViewById(R.id.btnSaveLifeValues);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    /* user name */
                    String name = edtName.getText().toString();
                    if (name.isEmpty()) {
                        Toast.makeText(MainActivity.this, "Имя обязательно для заполнения!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    /* age */
                    int age = -1;
                    try {
                        age = Integer.parseInt(edtAge.getText().toString());
                        if (age < 1 || age > 150) {
                            Toast.makeText(MainActivity.this, "Возраст должен быть в диапазоне 0...150 лет!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    } catch (NumberFormatException e) {
                        Toast.makeText(MainActivity.this, "Возраст должен быть числом!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    /* user */
                    if (user == null) {
                        user = new User();
                    }
                    user.setName(name);
                    user.setAge(age);

                    Log.i(TAG, user.toString());
            }
        });

        /* Pressure */
        Button btnPressure = findViewById(R.id.btnPressure);
        btnPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Button \"Pressure\" pushed!");

                Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });

        /* LifeValues */
        Button btnLifeValues = findViewById(R.id.btnLifeValues);
        btnLifeValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Button \"LifeValues\" pushed!");

                Intent intent = new Intent(MainActivity.this, LifeValuesActivity.class);
                startActivity(intent);
            }
        });
    }
}