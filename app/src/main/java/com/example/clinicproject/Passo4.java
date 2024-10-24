package com.example.clinicproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Passo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passo4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Spinner spinnerGenero = findViewById(R.id.spinnerGenero);
        String[] generos = {
                "Escolha uma genero",
                "Masculino",
                "Feminino"
        };
        ArrayAdapter<String> genero = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, generos);
        genero.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGenero.setAdapter(genero);



        Spinner spinnerEstados = findViewById(R.id.spinnerEstados);
        String[] estados = {
                "Escolha uma estado!",
                "São Paulo",
                "Rio de Janeiro",
                "Minas Gerais",
                "Bahia",
                "Paraná",
                "Rio Grande do Sul",
                "Ceará"
        };
        ArrayAdapter<String> estado = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, estados);
        estado.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstados.setAdapter(estado);
    }


    public void telaAnterior4(View view){
        Intent primeira_tela = new Intent(this,Passo3.class);
        startActivity(primeira_tela);

    }
}