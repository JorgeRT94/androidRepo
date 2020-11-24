package com.jorge.PM_EJ3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import model.Producto;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton ftButtonAniadir;

    public static ArrayList<Producto> listProductos;
    public Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        context = getApplicationContext();
        setContentView(R.layout.activity_main);

        Data.addProductosToList();
        listProductos = Data.getListProductos();

        RecyclerView rcViewProductos = findViewById(R.id.rcViewProductos);

        LinearLayoutManager layoutManager = new GridLayoutManager(this, 1);
        rcViewProductos.setLayoutManager(layoutManager);

        AdaptadorProducto adaptadorProducto = new AdaptadorProducto(listProductos, this);
        rcViewProductos.setAdapter(adaptadorProducto);

        ftButtonAniadir = findViewById(R.id.ftButtonAniadir);
        ftButtonAniadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AniadirProducto.class);
                context.startActivity(intent);
            }
        });


        adaptadorProducto.refrescar();
    }

    @Override
    protected void onResume() {
        super.onResume();

        RecyclerView rcViewProductos = findViewById(R.id.rcViewProductos);

        AdaptadorProducto adaptadorProducto = new AdaptadorProducto(Data.getListProductos(), this);
        rcViewProductos.setAdapter(adaptadorProducto);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rcViewProductos.setLayoutManager(layoutManager);

        adaptadorProducto.refrescar();

    }
}