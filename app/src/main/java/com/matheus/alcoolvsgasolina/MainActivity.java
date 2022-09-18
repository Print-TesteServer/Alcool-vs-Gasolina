package com.matheus.alcoolvsgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;
    private Button buttonBluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
        buttonBluetooth = findViewById(R.id.buttonBluetooth);

    }
    public void calcularPreco(View view){
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        /* Faz calculo (precoAlcool/ precoGasolina)
            Se resultado >= 0,85 melhor ultilizar gasolina
            Senão melhor ultilizar Alcool
         */
        Double resultado = precoAlcool/precoGasolina;

        if(resultado<=0.85){
            textResultado.setText("Melhor ultilizar ÁLCOOL!");
        }
        else{
            textResultado.setText("Melhor ultilizar GASOLINA!");
        }
    }
}