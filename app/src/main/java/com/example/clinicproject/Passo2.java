package com.example.clinicproject;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.Calendar;
import java.util.Locale;

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
        Locale locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        getResources().getConfiguration().setLocale(locale);

        View etDataNascimento = findViewById(R.id.etDataNascimento);


        etDataNascimento.setOnClickListener(v -> {

            Calendar calendar = Calendar.getInstance();
            int ano = calendar.get(Calendar.YEAR);
            int mes = calendar.get(Calendar.MONTH);
            int dia = calendar.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(Passo2.this,
                    (view, year, month, dayOfMonth) -> {

                    }, ano, mes, dia);


            datePickerDialog.show();
        });

        //Esse array é para as especialidades (não alterar o id, está dando erro ao trocar o id)
        Spinner spinnerPlano = findViewById(R.id.spinner2);
        String[] plano = {
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
        ArrayAdapter<String> planos = new ArrayAdapter<>(this, R.layout.spinner, R.id.spinnerText, plano);
        planos.setDropDownViewResource(R.layout.spinner);
        spinnerPlano.setAdapter(planos);

        Spinner spinnerMedicos = findViewById(R.id.spinnerMedico);
        String[] medicos = {
                "Médicos disponiveis",
                "Nabel Saldanha",
                "Emmanuemle Lima de Macedo",
                "Lorena Viana Madeira",
                "Talita Vasconcelos Moura Araújo",
                "Mariana Castiglioni"




        };
        ArrayAdapter<String> medico = new ArrayAdapter<>(this, R.layout.spinner, R.id.spinnerText, medicos);
        medico.setDropDownViewResource(R.layout.spinner);
        spinnerMedicos.setAdapter(medico);

        Spinner spinnerDatas = findViewById(R.id.spinnerDatas);
        String[] datas = {
                "Escolha uma data!!!",
                "18/10/2024 - sexta",
                "19/10/2024 - sabado",
                "20/10/2024 - domingo",
                "21/10/2024 - segunda",
                "22/10/2024 - terça",
                "23/10/2024 - quarta",





        };
        ArrayAdapter<String> date = new ArrayAdapter<>(this, R.layout.spinner, R.id.spinnerText, datas);
        date.setDropDownViewResource(R.layout.spinner);
        spinnerDatas.setAdapter(date);
    }
    public void trocar(View view){
        Intent terceira_tela = new Intent(this,Passo3.class);
        startActivity(terceira_tela);

    }
    public void telaAnterior(View view){
        Intent primeira_tela = new Intent(this,MainActivity.class);
        primeira_tela.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(primeira_tela);
        finish();

    }
}