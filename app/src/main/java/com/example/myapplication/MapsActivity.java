package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.database.Sql;
import com.example.myapplication.database.SqlLite;
import com.example.myapplication.database.entitys.Municipio;
import com.example.myapplication.database.entitys.Riesgo;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements
    OnMapReadyCallback,
    GoogleMap.OnMapClickListener,
    GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    String id = "";
    String name = "";
    String significado = "";
    String cabecera = "";
    String superficie = "";
    String altitud = "";
    String clima = "";
    String latitud = "";
    String longitud = "";
    String igecem = "";
    String
        stringRiesgos = "";
    String stringDatos = "";

    boolean form_inundacion;
    boolean form_deslave;
    boolean form_zona_sísmica;
    boolean form_incendio_forestal;
    boolean form_zona_volcanica;
    boolean form_derrumbes;

    SqlLite sqlLite;


    Button btn_save, btn_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
            .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Bundle datos = this.getIntent().getExtras();
        id = datos.getString("id", id);
        name = datos.getString("name", name);
        significado = datos.getString("significado", significado);
        clima = datos.getString("clima", clima);
        cabecera = datos.getString("cabecera", cabecera);
        altitud = datos.getString("altitud", altitud);
        superficie = datos.getString("superficie", superficie);
        latitud = datos.getString("latitud", latitud);
        longitud = datos.getString("longitud", longitud);
        igecem = datos.getString("igecem", igecem);
        form_inundacion = datos.getBoolean("inundacion", false);
        form_deslave = datos.getBoolean("deslave", false);
        form_zona_sísmica = datos.getBoolean("zona_sísmica", false);
        form_incendio_forestal = datos.getBoolean("incendio_forestal", false);
        form_zona_volcanica = datos.getBoolean("zona_volcanica", false);
        form_derrumbes = datos.getBoolean("derrumbes", false);
        stringRiesgos = datos.getString("stringRiesgos", "");
        stringDatos = datos.getString("stringDatos", "");

        btn_atras = findViewById(R.id.btn_atras);
        btn_save = findViewById(R.id.btn_save);

        if (stringRiesgos.equals("") && stringDatos.equals("")) {
            btn_save.setOnClickListener(v -> saveMunicipality());
        } else {
            btn_save.setVisibility(View.INVISIBLE);
        }
        btn_atras.setOnClickListener(v -> finish());

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng stateMex = new LatLng(19.4620414, -100.0263273);
        mMap.setMyLocationEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stateMex, 5));

        if (stringRiesgos.equals("") || stringDatos.equals("")) {
            mMap.setOnMapClickListener(this);
            mMap.setOnMarkerClickListener(this);
        } else {

        }
        if (!latitud.equals("")) {
            LatLng latLng = new LatLng(Double.parseDouble(latitud.trim()), Double.parseDouble(longitud.trim()));
            mMap.addMarker(new MarkerOptions()
                .position(latLng)
                .title("Actual:" + name + "\n" )
                .snippet(stringRiesgos)
                ).showInfoWindow();
        }
    }

    @Override
    public void onMapClick(LatLng latLng) {
        mMap.clear();
        mMap.addMarker(new MarkerOptions()
            .position(latLng)
            .title(name)
            .draggable(true));

        latitud = latLng.latitude + "";
        longitud = latLng.longitude + "";
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    public void saveMunicipality() {
        if (latitud.trim().length() > 0) {

            Municipio municipio = new Municipio(
                id,
                id,
                name,
                cabecera,
                superficie,
                altitud,
                clima,
                latitud,
                longitud,
                significado);

            sqlLite = new SqlLite(this);
            sqlLite.opeen();

            if (igecem.equals("")) {

                long idKey = sqlLite.add(municipio.contentValues(), municipio.getTable());
                if (idKey != -1) {
                    createRiesgossql(idKey + "");
                    finish();
                    Toast.makeText(this, "Datos guardados", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Algo salio mal,intentelo más tarde", Toast.LENGTH_SHORT).show();
                }

            } else {
                municipio.setIGECEM(igecem);
                sqlLite.upDate(municipio.contentValues(), municipio.getTable(), municipio.getID());
                sqlLite.eliminarColumn(Riesgo.table, "FK_ID_MUNICIPIOS", id);
                createRiesgossql(id);
                Toast.makeText(this, "Datos guardados", Toast.LENGTH_SHORT).show();
                finish();

            }
        } else {
            Toast.makeText(this, "Seleccione un lugar", Toast.LENGTH_SHORT).show();
        }
    }

    public void createRiesgossql(String idKey) {
        if (form_inundacion) {
            Riesgo riesgo = new Riesgo("", idKey + "", Riesgo.form_inundacion);
            sqlLite.addRegister(riesgo.contentValues(), Riesgo.table);

        }
        if (form_deslave) {
            Riesgo riesgo = new Riesgo("1", idKey + "", Riesgo.form_deslave);
            sqlLite.addRegister(riesgo.contentValues(), Riesgo.table);
        }
        if (form_zona_sísmica) {
            Riesgo riesgo = new Riesgo("1", idKey + "", Riesgo.form_zona_sismica);
            sqlLite.addRegister(riesgo.contentValues(), Riesgo.table);
        }
        if (form_incendio_forestal) {

            Riesgo riesgo = new Riesgo("1", idKey + "", Riesgo.form_incendio_forestal);
            sqlLite.addRegister(riesgo.contentValues(), Riesgo.table);

        }
        if (form_zona_volcanica) {

            Riesgo riesgo = new Riesgo("1", idKey + "", Riesgo.form_zona_volcanica);
            sqlLite.addRegister(riesgo.contentValues(), Riesgo.table);

        }
        if (form_derrumbes) {

            Riesgo riesgo = new Riesgo("1", idKey + "", Riesgo.form_derrumbes);
            sqlLite.addRegister(riesgo.contentValues(), Riesgo.table);
        }

    }
}





