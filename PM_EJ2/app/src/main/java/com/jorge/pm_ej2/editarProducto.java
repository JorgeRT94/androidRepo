package com.jorge.pm_ej2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;

import model.Producto;

public class editarProducto extends AppCompatActivity {

    EditText txtEditNombre;
    EditText txtEditPrecio;
    Spinner spProveedoresEdit;
    Switch swFragil;
    RadioGroup radioGroupEdit;
    ListView lsViewProvincias;
    RatingBar rtBarEdit;
    Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_producto);

        String[] proveedores = Data.addProveedores();
        String[] provincias = Data.addProvincias();

        txtEditNombre = findViewById(R.id.txtEditNombre);
        txtEditNombre.setText("" + Data.listProductos.get(Data.posicion).getNombre());
        txtEditPrecio = findViewById(R.id.txtEditPrecio);
        txtEditPrecio.setText("" + Data.listProductos.get(Data.posicion).getPrecio());


        rtBarEdit = findViewById(R.id.rtBarEditRating);

        spProveedoresEdit = findViewById(R.id.spEditProveedores);
        spProveedoresEdit.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, proveedores));

        lsViewProvincias = findViewById(R.id.listViewEditProvincias);
        lsViewProvincias.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, provincias));

        txtEditNombre = findViewById(R.id.txtEditNombre);
        txtEditPrecio = findViewById(R.id.txtEditPrecio);

        swFragil = findViewById(R.id.swEditFragil);
        swFragil.setChecked(Data.listProductos.get(Data.posicion).isFragil());

        radioGroupEdit = findViewById(R.id.rdGroupEdit);
        ((RadioButton) radioGroupEdit.getChildAt(MainActivity.listProductos.get(Data.posicion).getCaja())).setChecked(true);
        spProveedoresEdit.setSelection(MainActivity.listProductos.get(Data.posicion).getProveedor());
        lsViewProvincias.setSelection(MainActivity.listProductos.get(Data.posicion).getProvincia());

        btnGuardar = findViewById(R.id.btnGuardarEdit);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Producto producto = new Producto(txtEditNombre.getText().toString(), spProveedoresEdit.getSelectedItemPosition(), lsViewProvincias.getSelectedItemPosition(),
                        getRadioGroup(), Double.parseDouble(txtEditPrecio.getText().toString()), rtBarEdit.getRating(), swFragil.isChecked());
                Data.listProductos.set(Data.posicion, producto);

            }
        });


    }

    private int getRadioGroup() {

        return radioGroupEdit.indexOfChild(findViewById(radioGroupEdit.getCheckedRadioButtonId()));
    }
}