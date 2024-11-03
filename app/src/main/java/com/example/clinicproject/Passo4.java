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
    private EditText numeroFixo;
    private EditText email;
    private EditText endereco;
    private EditText numeroCasa;
    private EditText complemento;
    private EditText bairro;
    private EditText cidade;
   // private EditText estado;
    private EditText cep;
    private EditText responsavelFinanceiro;
    private EditText cpfResponsavelFinanceiro;
    private EditText observacao;

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
        numeroFixo = findViewById(R.id.textView20);
        email = findViewById(R.id.textView21);
        endereco = findViewById(R.id.textView22);
        numeroCasa = findViewById(R.id.textView23);
        complemento = findViewById(R.id.textView24);
        bairro= findViewById(R.id.textView25);
        cidade= findViewById(R.id.textView26);
        cep= findViewById(R.id.textView28);
        responsavelFinanceiro= findViewById(R.id.textView29);
        cpfResponsavelFinanceiro= findViewById(R.id.textView30);
        observacao= findViewById(R.id.textView31);
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
        ArrayAdapter<String> generoAdapter = new ArrayAdapter<>(this, R.layout.spinner, R.id.spinnerText, generos);
        generoAdapter.setDropDownViewResource(R.layout.spinner);
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
        ArrayAdapter<String> estadoAdapter = new ArrayAdapter<>(this, R.layout.spinner, R.id.spinnerText, estados);
        estadoAdapter.setDropDownViewResource(R.layout.spinner);
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
        String fixo = numeroFixo.getText().toString().trim();
        String emailString = email.getText().toString().trim();
        String enderecoString = endereco.getText().toString().trim();
        String numeroCasaString = numeroCasa.getText().toString().trim();
        String complementoString = complemento.getText().toString().trim();
        String bairroString = bairro.getText().toString().trim();
        String cidadeString = cidade.getText().toString().trim();
       // String estadoString = estado.getText().toString().trim();
        String cepString = cep.getText().toString().trim();
        String responsavel = responsavelFinanceiro.getText().toString().trim();
        String cpfResponsavel = cpfResponsavelFinanceiro.getText().toString().trim();
        String obs = observacao.getText().toString().trim();

        if (nome.isEmpty()) {
            nomeCompleto.setError("O nome completo é obrigatório");
            return;
        }
        if (cpfString.isEmpty()) {
            cpf.setError("CPF é obrigatório");
            return;
        }
        if (celular.isEmpty()) {
            numeroCelular.setError("Número de celular é obrigatório");
            return;
        }

        if (emailString.isEmpty()) {
            email.setError("O email é obrigatório");
            return;
        }
        if (enderecoString.isEmpty()) {
            endereco.setError("O endereço é obrigatório");
            return;
        }
        if (numeroCasaString.isEmpty()) {
            numeroCasa.setError("O número da casa é obrigatório");
            return;
        }
        if (bairroString.isEmpty()) {
            bairro.setError("O bairro é obrigatório");
            return;
        }
        if (cidadeString.isEmpty()) {
            cidade.setError("A cidade é obrigatória");
            return;
        }

        if (cepString.isEmpty()) {
            cep.setError("O CEP é obrigatório");
            return;
        }



            PatientInfo paciente = new PatientInfo(nome, cpfString,celular,fixo, emailString, enderecoString, numeroCasaString,
                    complementoString, bairroString, cidadeString, "Ceara", cepString, responsavel, cpfResponsavel,
                    obs);
            Intent tela5 = new Intent(this, Passo5.class);
            tela5.putExtra("paciente", paciente);
            tela5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(tela5);
            finish();

        }
    }

