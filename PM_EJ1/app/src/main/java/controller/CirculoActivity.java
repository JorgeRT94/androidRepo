package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jorge.pm_ej1.R;

import logic.LogicOperations;

public class CirculoActivity extends AppCompatActivity {

    double radio;

    EditText txtRadio;
    TextView txtViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        txtRadio = findViewById(R.id.txtRadio);
        txtViewResultado = findViewById(R.id.txtViewResultado);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                radio = Double.parseDouble(txtRadio.getText().toString());

                txtViewResultado.setText("" + LogicOperations.calculaCirculo(radio));
            }
        });
    }
}