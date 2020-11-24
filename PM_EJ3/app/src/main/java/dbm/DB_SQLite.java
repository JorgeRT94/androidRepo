package dbm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_SQLite extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "productos.sqlite";
    private static final Integer DATABASE_VERSION = 1;
    private static final String SQL_CREATE_ENTRIES = "" +
            "CREATE TABLE PRODUCTO " +
            "( nombre           TEXT" +
            ", proveedor        INTEGER" +
            ", provincia        INTEGER" +
            ", caja             INTEGER" +
            ", precio           DOUBLE" +
            ", puntuacion       FLOAT" +
            ", fragil           BOOLEAN" +
            ")" ;

    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS PRODUCTO ";

    public DB_SQLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
