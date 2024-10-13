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

public class Passo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passo2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Esse array é para as especialidades (não alterar o id, está dando erro ao trocar o id)
        Spinner spinnerPlano = findViewById(R.id.spinner2);
        String[] especialidades = {
                "Escolha uma Plano !!",
                "AMIL-ONE -S1500",
                "AMIL-REDE - 100 A 450 ",
                "AMIL-REDE - 500 A 900",
                "LIV SAUDE",
                "MEDSERVICE",
                "PARTICULAR",
                "PETROBRAS BR",
                "PETROBRAS DISTRIBUIDORA",
                "POPULAR",
                "POSTAL SAUDE",
                "PS",
                "RECEITA FEDERAL",
                "SAUDE BRADESCO",
                "SULAMERICA",
                "UNIMED - PESSOA FISICA",
                "VAI BEM",
                "UNIMED - PESSOA FISICA - MULTIPLAN/ESTILO/MULTIMAX/INTERCÂMBIOS/SAULUTE MAX",
                "VALE SAÚDE SEMPRE"
        };
        ArrayAdapter<String> especialidade = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, especialidades);
        especialidade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPlano.setAdapter(especialidade);

        Spinner spinnerMedicos = findViewById(R.id.spinnerMedico);
        String [] medicos = {
                "Nabel Saldanha"


        };
        ArrayAdapter<String> medico = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, medicos);
        medico.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMedicos.setAdapter(medico);
    }
    public void trocar(View view){
        Intent terceira_tela = new Intent(this,Passo3.class);
        startActivity(terceira_tela);

    }
    public void telaAnterior(View view){
        Intent primeira_tela = new Intent(this,MainActivity.class);
        startActivity(primeira_tela);

    }
}