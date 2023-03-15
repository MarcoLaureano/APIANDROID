package com.apiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    ImageView alumnos, grupos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        alumnos = findViewById(R.id.btnListaAlumnos);
        alumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inicio.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}