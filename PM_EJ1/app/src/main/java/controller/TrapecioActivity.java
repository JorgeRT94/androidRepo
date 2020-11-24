package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jorge.pm_ej1.R;

import logic.LogicOperations;

public class TrapecioActivity extends AppCompatActivity {

    double base;
    double altura;

    EditText txtBase;
    EditText txtAltura;
    TextView txtViewResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        txtBase = findViewById(R.id.txtBase);
        txtAltura = findViewById(R.id.txtAltura);
        txtViewResultado = findViewById(R.id.txtViewResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                base = Double.parseDouble(txtBase.getText().toString());
                altura = Double.parseDouble(txtAltura.getText().toString());

                txtViewResultado.setText("" + LogicOperations.calcularTrapecio(base, altura));
            }
        });
    }
}