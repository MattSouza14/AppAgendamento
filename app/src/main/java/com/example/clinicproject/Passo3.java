package com.example.clinicproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Passo3 extends AppCompatActivity {

    // armazena todas as checkboxes
    private final List<CheckBox> checkBoxes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passo3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // inicializa as checkboxes e adicionando-as à lista
        for (int i = 1; i <= 9; i++) {
            @SuppressLint("DiscouragedApi") int resID = getResources().getIdentifier("cb" + i, "id", getPackageName());
            CheckBox checkBox = findViewById(resID);
            checkBoxes.add(checkBox);

            checkBox.setOnClickListener(v -> toggleCheckbox(checkBox));
        }
    }

    // desmarca todas as checkbox, exceto a que foi clicada
    private void toggleCheckbox(CheckBox selectedCheckbox) {
        if (selectedCheckbox.isChecked()) {
            for (CheckBox checkBox : checkBoxes) {
                if (checkBox != selectedCheckbox) {
                    checkBox.setChecked(false);
                }
            }
        }
    }

    public void proximaTela3(View view) {
        Intent terceira_tela = new Intent(this, Passo4.class);
        startActivity(terceira_tela);
    }

    public void telaAnterior3(View view) {
        Intent primeira_tela = new Intent(this, Passo2.class);
        primeira_tela.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(primeira_tela);
        finish();
    }
}
