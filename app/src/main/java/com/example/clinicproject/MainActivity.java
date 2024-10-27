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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Spinner spinnerEspecialidades = findViewById(R.id.spinnerEspecialidades);
        String[] especialidades = {
                "Escolha uma Especialidade",
                "Alergologista",
                "Cardiopediatra",
                "Cirurgião Torácico",
                "Nutricionista",
                "Otorrinolaringologista",
                "Pediatria",
                "Pneumologista",
                "Pneumopediatra"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, especialidades);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEspecialidades.setAdapter(adapter);
    }
    public void trocar(View view){
        Intent segunda_tela = new Intent(this,Passo2.class);
        startActivity(segunda_tela);

    }
    public void voltar(View view){
        Intent tela_inicial = new Intent(this,CoverPage.class);
        startActivity(tela_inicial);

    }

}