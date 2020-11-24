package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.jorge.pm_ej1.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgButtonCirculo = findViewById(R.id.imgButtonCirculo);
        imgButtonCirculo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CirculoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgButtonRectangulo = findViewById(R.id.imgButtonRectangulo);
        imgButtonRectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), RectanguloActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgButtonHexagono = findViewById(R.id.imgButtonHexagono);
        imgButtonHexagono.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), HexagonoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgButtonPentagono = findViewById(R.id.imgButtonPentagono);
        imgButtonPentagono.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PentagonoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgButtonTriangulo = findViewById(R.id.imgButtonTriangulo);
        imgButtonTriangulo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TrianguloActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgButtonTrapecio = findViewById(R.id.imgButtonTrapecio);
        imgButtonTrapecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TrapecioActivity.class);
                startActivity(intent);
            }
        });

    }

}