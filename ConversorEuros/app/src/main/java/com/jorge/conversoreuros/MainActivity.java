package com.jorge.conversoreuros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.jorge.conversoreuros.R.*;

public class MainActivity extends AppCompatActivity {

    EditText txtEuros;
    TextView conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        txtEuros = findViewById(id.txtEuros);
        conversion = findViewById(id.txtDolares);

    }

    private double getEuros() {
        String contenido = txtEuros.getText().toString();
        return (contenido.length() == 0) ? 0.0 : Double.parseDouble(contenido);
    }

    public void btnConvertirUsa (View v) {
        ImageButton b1 = findViewById(R.id.btnUsa);
        double resultado = getEuros() * 1.17;
        conversion.setText(resultado + " Dolares");

    }

    public void btnConvertirTurq (View v) {
        ImageButton b2 = findViewById(id.btnTurq);
        double resultado = getEuros() * 9.31;
        conversion.setText(resultado + " Liras Turcas");

    }

    public void btnConvertirArg (View v) {
        ImageButton b3 = findViewById(id.btnArg);
        double resultado = getEuros() * 91.92;
        conversion.setText(resultado + "Pesos argentinos.");

    }

    public void btnConvertirIng (View v) {
        ImageButton b4 = findViewById(id.btnIng);
        double resultado = getEuros() * 0.91;
        conversion.setText(resultado + "Libras esterlinas.");

    }

    public void btnConvertirJap (View v) {
        ImageButton b5 = findViewById(id.btnJap);
        double resultado = getEuros() * 124.90;
        conversion.setText(resultado + "Yenes.");

    }

    public void btnConvertirRus (View v) {
        ImageButton b6 = findViewById(id.btnRus);
        double resultado = getEuros() * 91.55;
        conversion.setText(resultado + "Rublos.");

    }


}