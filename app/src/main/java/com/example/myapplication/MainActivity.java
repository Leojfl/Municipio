package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;

import com.example.myapplication.iu.AnimalsFragment;
import com.example.myapplication.iu.CreateFragment;
import com.example.myapplication.iu.DeleteFragment;
import com.example.myapplication.iu.UpdateFragment;

import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {
    FragmentTransaction transaction;
    public Fragment fragmentView;
    AlertDialog.Builder builder;
    int type;

    DrawerLayout drawer;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Bundle datos = this.getIntent().getExtras();
        type = datos.getInt("type");

        if (type == 2) {
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



            drawer = findViewById(R.id.drawer_layout2);
            navigationView = findViewById(R.id.nav_view2);
            toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);


        } else {
            setContentView(R.layout.activity_main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            drawer = findViewById(R.id.drawer_layout);
            navigationView = findViewById(R.id.nav_view);
            toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        }


        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        builder = new AlertDialog.Builder(this);
        builder.setTitle("Creditos");
        builder.setMessage("Maestra: M. en C. PULIDO ALBA ROCIO ELIZABETH " + "\n" +
            "Alumno: Leonardo Jesus Flores Lopez " + "\n")
            .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                }
            });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_create:
                setTitle("Crear");
                fragmentView = new CreateFragment();
                break;
            case R.id.menu_delete:
                setTitle("Delete");
                fragmentView = new DeleteFragment();

                break;
            case R.id.menu_update:
                setTitle("Actualizar");
                fragmentView = new UpdateFragment();
                break;
            case R.id.menu_list:
                setTitle("Listar");
                fragmentView = new AnimalsFragment(1);
                break;
            case R.id.menu_list_id:
                setTitle("Listar");
                fragmentView = new AnimalsFragment(2);
                break;
            case R.id.menu_list_zona_riesgo:
                setTitle("Listar");
                fragmentView = new AnimalsFragment(3);
                break;


            case R.id.menu_credits:

                // Create the AlertDialog object and return it
                builder.create().show();
                break;
            case R.id.nav_send:
                finish();
                break;

        }


        if (fragmentView != null) {
            transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contentMain, fragmentView, "Fragmen");
            transaction.commit();
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
