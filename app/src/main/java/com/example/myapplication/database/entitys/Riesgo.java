package com.example.myapplication.database.entitys;

import android.content.ContentValues;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

public class Riesgo {


    String ID;
    String FK_ID_MUNICIPIOS;
    String NOMBRE;
    public static String table="RIESGO";
    public static String form_inundacion="inundación";
    public static String form_deslave="deslave";
    public static String form_zona_sismica="zona sísmica";
    public static String form_incendio_forestal="incendio forestal";
    public static String form_zona_volcanica="zona volcánica";
    public static String form_derrumbes="derrumbes";




public Riesgo(String ID, String FK_ID_MUNICIPIOS, String NOMBRE) {
        this.ID = ID;
        this.FK_ID_MUNICIPIOS = FK_ID_MUNICIPIOS;
        this.NOMBRE = NOMBRE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFK_ID_MUNICIPIOS() {
        return FK_ID_MUNICIPIOS;
    }

    public void setFK_ID_MUNICIPIOS(String FK_ID_MUNICIPIOS) {
        this.FK_ID_MUNICIPIOS = FK_ID_MUNICIPIOS;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }


    public static Riesgo converteRiesgo(Cursor cursor) {
        Riesgo riesgo = null;
        if (cursor != null) {

            String ID = cursor.getInt(0) + "";
            String FK_ID_MUNICIPIOS = cursor.getString(1) + "";
            String NOMBRE = cursor.getString(2) + "";

            riesgo = new Riesgo(ID, FK_ID_MUNICIPIOS, NOMBRE);
        }
        return riesgo;
    }

    public static List<Riesgo> riesgos(Cursor cursor) {
        List<Riesgo> riesgos = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                riesgos.add(converteRiesgo(cursor));
            } while (cursor.moveToNext());
        }
        return riesgos;
    }

    public ContentValues upDate() {
        ContentValues cv = new ContentValues();
        cv.put("ID", this.ID);
        cv.put("IGECEM", this.FK_ID_MUNICIPIOS);
        cv.put("NOMBRE", this.NOMBRE);
        return cv;
    }



    public ContentValues contentValues() {
        ContentValues cv = new ContentValues();
        cv.put("NOMBRE", this.NOMBRE);
        cv.put("FK_ID_MUNICIPIOS", this.FK_ID_MUNICIPIOS);
        return cv;
    }


}
