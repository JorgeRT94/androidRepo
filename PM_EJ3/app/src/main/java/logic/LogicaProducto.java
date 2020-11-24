package logic;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import dbm.DB_SQLite;
import model.Producto;

public class LogicaProducto {

    public static void insertarProducto(Context context, Producto producto) {

        DB_SQLite db = new DB_SQLite(context);
        SQLiteDatabase conn = db.getWritableDatabase();

        String sSql = "INSERT INTO PRODUCTO (nombre, proveedor, provincia, caja, precio, puntuacion, fragil)" +
                " VALUES ('" + producto.getNombre()+ "', " + producto.getProveedor() + ", " + producto.getProvincia() + ", " + producto.getCaja() + ", " + producto.getPrecio() + ", " + producto.getPuntuacion() + ", " + producto.isFragil() + ")";

        conn.execSQL(sSql);
        conn.close();
    }

    public static List<Producto> listarProducto(Context context) {

        List<Producto> listProducto = new ArrayList<Producto>();

        DB_SQLite db = new DB_SQLite(context);
        SQLiteDatabase conn = db.getReadableDatabase();

        String sSql = "SELECT * FROM PRODUCTO ORDER BY nombre ASC";

        Cursor cursor = conn.rawQuery(sSql, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {

                String dataNombre = cursor.getString(cursor.getColumnIndex("nombre"));
                int dataProveedor = cursor.getInt(cursor.getColumnIndex("proveedor"));
                int dataProvincia = cursor.getInt(cursor.getColumnIndex("provincia"));
                int dataCaja = cursor.getInt(cursor.getColumnIndex("caja"));
                double dataPrecio = cursor.getDouble(cursor.getColumnIndex("precio"));
                float dataPuntuacion = cursor.getFloat(cursor.getColumnIndex("puntuacion"));
                boolean dataFragil = (cursor.getInt(cursor.getColumnIndex("fragil")) > 0);

                listProducto.add(new Producto(dataNombre, dataProveedor, dataProvincia, dataCaja, dataPrecio, dataPuntuacion, dataFragil));

            } while (cursor.moveToNext());
        }

        cursor.close();
        conn.close();

        return listProducto;
    }
}