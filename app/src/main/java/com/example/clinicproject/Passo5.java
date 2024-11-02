package com.example.clinicproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Passo5 extends AppCompatActivity {
    PatientInfo paciente;

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

        TextView nomeCompletoText = findViewById(R.id.nomeUser);
        nomeCompletoText.setText(paciente.getCompletName());

        TextView cpfText = findViewById(R.id.cpfUser);
        cpfText.setText(paciente.getCpf());

        TextView celularText = findViewById(R.id.celularUser);
        celularText.setText(paciente.getCellPhoneNumber());
    }

    public void telaAnterior5(View view) {
        Intent tela4 = new Intent(this, Passo4.class);
        startActivity(tela4);
    }

    public void confirmarConsulta(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.alert_dialog, null);
        TextView title = dialogView.findViewById(R.id.dialog_title);
        title.setText("Consulta Agendada");
        TextView message = dialogView.findViewById(R.id.dialog_message);
        message.setText("Sua consulta foi agendada com sucesso!");


        new AlertDialog.Builder(this)
                .setView(dialogView)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Passo5.this, CoverPage.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                })
                .show();
    }
}
