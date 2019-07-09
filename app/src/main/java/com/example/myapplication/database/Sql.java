package com.example.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.myapplication.database.entitys.Municipio;

public class Sql extends SQLiteOpenHelper {
    private SQLiteDatabase db;
    int newVersion = 1;
    int oldVersion = 0;
    private static final String database = "examen";
    private static final int VERSION = 1;
    private final String t1 =
        "CREATE TABLE MUNICIPIO (" +
            "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            "IGECEM TEXT NOT NULL," +
            "NOMBRE TEXT NOT NULL, " +
            "CABECERA TEXT NOT NULL," +
            "SUPERFICIE TEXT NOT NULL, " +
            "ALTITUD TEXT NOT NULL," +
            "CLIMA TEXT NOT NULL," +
            "LATITUD TEXT NOT NULL," +
            "LONGITUD TEXT NOT NULL," +
            "SIGNIFICADO TEXT NOT NULL" +
            ");";
    private final String t2 =
        "CREATE TABLE RIESGO (" +
            "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            "FK_ID_MUNICIPIOS TEXT NOT NULL," +
            "NOMBRE TEXT NOT NULL " +
            ");";

    private final String t3 =
        "CREATE TABLE USER (" +
            "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            "USERNAME TEXT NOT NULL," +
            "PASSWORD TEXT NOT NULL " +
            ");";

    public Sql(Context context) {
        super(context, database, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("sql", "Sí entra");
        db.execSQL(t1);
        db.execSQL(t2);
        db.execSQL(t3);

        for (int x = 0; x < Municipio.insertLoco.length; x++) {
            db.execSQL(Municipio.insertLoco[x]);

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int newVersion, int oldVersion) {

        if (newVersion > oldVersion) {
            db.execSQL("DROP TABLE IF EXISTS RIESGO");
            db.execSQL("DROP TABLE IF EXISTS MUNICIPIO");
            db.execSQL("DROP TABLE IF EXISTS USER");
        }

    }
}
