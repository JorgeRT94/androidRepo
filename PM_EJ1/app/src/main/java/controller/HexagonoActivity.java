package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jorge.pm_ej1.R;

import logic.LogicOperations;

public class HexagonoActivity extends AppCompatActivity {

    double lado;
    double apotema;

    EditText txtLados;
    EditText txtApotema;
    TextView txtViewResultado;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagono);

        txtLados = findViewById(R.id.txtLados);
        txtApotema = findViewById(R.id.txtApotema);
        txtViewResultado = findViewById(R.id.txtViewResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                lado = Double.parseDouble(txtLados.getText().toString());
                apotema = Double.parseDouble(txtApotema.getText().toString());

                txtViewResultado.setText("" + LogicOperations.calcularHexagono(lado, apotema));
            }
        });

    }
}