package com.jorge.PM_EJ3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import controller.CtrProducto;
import model.Producto;

public class AniadirProducto extends AppCompatActivity {

    public static EditText txtEditNombre;
    public static EditText txtEditPrecio;
    public static Spinner spProveedoresEdit;
    public static Switch swFragil;
    public static RadioGroup radioGroupEdit;
    public static ListView lsViewProvincias;
    public static RatingBar rtBarEdit;
    public static Button btnGuardar;
    public static Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        setContentView(R.layout.activity_aniadir_producto);

        String[] proveedores = Data.addProveedores();
        String[] provincias = Data.addProvincias();

        txtEditNombre = findViewById(R.id.txtEditNombre);
        txtEditPrecio = findViewById(R.id.txtEditPrecio);
        rtBarEdit = findViewById(R.id.rtBarEditRating);
        spProveedoresEdit = findViewById(R.id.spEditProveedores);
        lsViewProvincias = findViewById(R.id.listViewEditProvincias);
        swFragil = findViewById(R.id.swEditFragil);
        radioGroupEdit = findViewById(R.id.rdGroupEdit);
        ((RadioButton) radioGroupEdit.getChildAt(MainActivity.listProductos.get(Data.posicion).getCaja())).setChecked(true);

        btnGuardar = findViewById(R.id.btnGuardarEdit);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Producto producto = new Producto(txtEditNombre.getText().toString(), spProveedoresEdit.getSelectedItemPosition(), lsViewProvincias.getSelectedItemPosition(),
                        getRadioGroup(), Double.parseDouble(txtEditPrecio.getText().toString()), rtBarEdit.getRating(), swFragil.isChecked());
                MainActivity.listProductos.add(producto);



            }
        });
    }

    private int getRadioGroup() {

        return radioGroupEdit.indexOfChild(findViewById(radioGroupEdit.getCheckedRadioButtonId()));
    }
}