package com.example.myapplication.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.Editable;
import android.util.Log;

public class SqlLite {

    private Sql sql;
    private SQLiteDatabase db;

    public SqlLite(Context context) {
        this.sql = new Sql(context);
        this.db = sql.getWritableDatabase();
    }

    public SqlLite() {

    }


    public void opeen() {
        Log.i("sqllite", "se abre " + sql.getDatabaseName());

    }

    public void cerrar() {
        Log.i("sqllite", "se cierra " + sql.getDatabaseName());
        sql.close();
    }

    public long add(ContentValues cv, String table) {
        return db.insert(table, null, cv);
    }

    public boolean addRegister(ContentValues cv, String table) {
        return (db.insert(table, null, cv) != -1) ? true : false;
    }

    public Cursor getRegistro(String table) {
        return db.rawQuery("SELECT * FROM " + table, null);
    }

    public Cursor getRegistros(String table,String condition) {
        return db.rawQuery("SELECT * FROM " + table +" "+condition, null);
    }
    public int upDate(ContentValues cv, String table, String id) {
        int cant = db.update(table, cv, "ID=" + id, null);
        return cant ;
    }

    public Cursor getCant(String id, String table) {
        return db.rawQuery("SELECT * FROM " + table + "  WHERE ID = " + id, null);

    }

    public int eliminar(Editable id, String table) {
        return db.delete(table, "ID=" + id, null);

    }

    public int eliminarColumn(String table, String column, String id) {
        return db.delete(table, column + "=" + id, null);

    }

}



