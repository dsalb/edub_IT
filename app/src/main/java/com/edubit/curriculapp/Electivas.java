package com.edubit.curriculapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Electivas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electivas);
    }

    public void saveTostElectivas(View view) {
        Toast.makeText(getApplicationContext(), R.string.save, Toast.LENGTH_LONG).show();
    }
}