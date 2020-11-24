package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jorge.pm_ej1.R;

import logic.LogicOperations;

public class PentagonoActivity extends AppCompatActivity {

    double lado;
    double apotema;

    EditText txtLado;
    EditText txtApotema;
    TextView txtViewResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagono);

        txtLado = findViewById(R.id.txtLados);
        txtApotema = findViewById(R.id.txtLados);
        txtViewResultado = findViewById(R.id.txtViewResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lado = Double.parseDouble(txtLado.getText().toString());
                apotema = Double.parseDouble(txtApotema.getText().toString());

                txtViewResultado.setText("" + LogicOperations.calcularPentagono(lado, apotema));
            }
        });
    }
}