package com.example.clinicproject;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Locale;

public class Passo4 extends AppCompatActivity {

    private EditText nomeCompleto;
    private EditText cpf;
    //private EditText genero;
    //private EditText dataNascimento;
    private EditText numeroCelular;
   // private EditText numeroFixo;
    //private EditText email;
    //private EditText endereco;
    //private EditText numeroCasa;
    //private EditText complemento;
    //private EditText bairro;
    //private EditText cidade;
    //private EditText estado;
    //private EditText cep;
    //private EditText responsavelFinanceiro;
    //private EditText cpfResponsavelFinanceiro;
    //private EditText observacao;

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

        Locale locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        getResources().getConfiguration().setLocale(locale);

        nomeCompleto = findViewById(R.id.nomePaciente);
        cpf = findViewById(R.id.cfpPaciente);
        numeroCelular = findViewById(R.id.celularPaciente);



        View DataNascimento = findViewById(R.id.dataNascimento);
        DataNascimento.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int ano = calendar.get(Calendar.YEAR);
            int mes = calendar.get(Calendar.MONTH);
            int dia = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(Passo4.this,
                    (view, year, month, dayOfMonth) -> {

                    }, ano, mes, dia);
            datePickerDialog.show();
        });

        Spinner spinnerGenero = findViewById(R.id.spinnerGenero);
        String[] generos = {
                "Escolha um gênero",
                "Masculino",
                "Feminino"
        };
        ArrayAdapter<String> generoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, generos);
        generoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGenero.setAdapter(generoAdapter);

        Spinner spinnerEstados = findViewById(R.id.spinnerEstados);
        String[] estados = {
                "Escolha um estado",
                "São Paulo",
                "Rio de Janeiro",
                "Minas Gerais",
                "Bahia",
                "Paraná",
                "Rio Grande do Sul",
                "Ceará"
        };
        ArrayAdapter<String> estadoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, estados);
        estadoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstados.setAdapter(estadoAdapter);
    }

    public void telaAnterior4(View view) {
        Intent tela3 = new Intent(this, Passo3.class);
        startActivity(tela3);
    }

    public void telaProxima4(View view) {
        String nome = nomeCompleto.getText().toString().trim(); // remove espaços em branco
        String cpfString = cpf.getText().toString().trim();
        String celular = numeroCelular.getText().toString().trim();
        if (nome.isEmpty()) {
           nomeCompleto.setError("O nome completo é obrigatório");
           return;
        }
        if(cpfString.isEmpty()){
            cpf.setError("CPF é obrigatorio");
            return;
        }
        if(celular.isEmpty()){

            numeroCelular.setError("Número de celular é obrigatório ");
        }

            PatientInfo paciente = new PatientInfo(nome, cpfString,celular);
            Intent tela5 = new Intent(this, Passo5.class);
           tela5.putExtra("paciente", paciente);
            startActivity(tela5);

        }
    }

