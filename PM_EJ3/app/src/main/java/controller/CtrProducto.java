package controller;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.jorge.PM_EJ3.AniadirProducto;
import com.jorge.PM_EJ3.MainActivity;

import java.util.List;

import logic.LogicaProducto;
import model.Producto;


public class CtrProducto {

    public static void insertarProducto(Producto producto) {

        MainActivity.listProductos.add(producto);

        if (producto.getNombre().equals("")) {
            mostrarMensaje("Todos los campos son obligatorios.");
        } else {

            LogicaProducto.insertarProducto(AniadirProducto.context, producto);
            mostrarMensaje("El producto " + producto.getNombre() + " ha sido insertado.");
            limpiarCuadros();
        }

    }

    private static void mostrarMensaje(String sMensaje) {
        Toast.makeText(AniadirProducto.context, sMensaje, Toast.LENGTH_SHORT).show();
    }

    public static void EliminarProducto() {
    }

    public static void BuscarProducto() {
    }

    public static void EditarProducto() {
    }

    public static void MostrarProducto() {

    }

    private static void limpiarCuadros() {
        AniadirProducto.txtEditNombre.setText("");
        AniadirProducto.txtEditPrecio.setText("");
    }

}
