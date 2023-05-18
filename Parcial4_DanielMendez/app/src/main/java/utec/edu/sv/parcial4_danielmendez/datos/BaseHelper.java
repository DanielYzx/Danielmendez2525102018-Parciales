package utec.edu.sv.parcial4_danielmendez.datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS=1;
    private static final String NOMBRE_BASE="BDVEHICULO.db";
    public static final String NOMBRE_TABLACL="md_clientes";
    public static final String NOMBRE_TABLAVH="md_vehiculos";
    public static final String NOMBRE_TABLACV="md_clientevehiculo";

    public BaseHelper(@Nullable Context context) {
        super(context, NOMBRE_BASE, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+NOMBRE_TABLACL+" ("+
                "ID_Cliente INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "NombreCliente TEXT NOT NULL ,"+
                "ApellidoCliente TEXT NOT NULL ,"+
                "CiudadCliente TEXT NOT NULL"
                +")");

        db.execSQL("CREATE TABLE "+NOMBRE_TABLAVH+" ("+
                "ID_Vehiculo INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "Marca TEXT NOT NULL ,"+
                "Modelo TEXT NOT NULL"
                +")");

        db.execSQL("CREATE TABLE "+NOMBRE_TABLACV+" ("+
                "ID_Cliente INTEGER NOT NULL ,"+
                "ID_Vehiculo INTEGER NOT NULL ,"+
                "Matricula TEXT NOT NULL ,"+
                "Kilometro TEXT NOT NULL ,"+
                "foreign key(ID_Cliente) references NOMBRE_TABLACL(ID_Cliente) ,"+
                "foreign key(ID_Vehiculo) references NOMBRE_TABLAVH(ID_Vehiculo)"
                +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+NOMBRE_TABLACL);
        db.execSQL("DROP TABLE "+NOMBRE_TABLAVH);
        db.execSQL("DROP TABLE "+NOMBRE_TABLACV);
        onCreate(db);

    }
}
