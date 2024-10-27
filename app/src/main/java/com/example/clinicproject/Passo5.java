package com.example.clinicproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Passo5 extends AppCompatActivity {
    private PatientInfo paciente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passo5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        Intent intent = getIntent();
        paciente = (PatientInfo) intent.getSerializableExtra("paciente");

            TextView nomeCompletoText = findViewById(R.id.nomeCompletoTextView);
            TextView cpfText = findViewById(R.id.cpfTextView);
            nomeCompletoText.setText("Nome: " + paciente.getCompletName());
            cpfText.setText("CPF: " + paciente.getCpf());


    }


    public void telaAnterior5(View view){
        Intent tela4 = new Intent(this,Passo4.class);
        startActivity(tela4);

    }
}