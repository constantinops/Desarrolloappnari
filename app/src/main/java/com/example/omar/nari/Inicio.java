package com.example.omar.nari;



import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.omar.nari.ABCdarios.abcActivity;
import com.example.omar.nari.Animalitos.AnimalActivity;
import com.example.omar.nari.Frutas.FrutasActivity;
import com.example.omar.nari.Numero.NumeroActivity;
import com.example.omar.nari.colo.ColoresActivity;

public class Inicio extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

      public static int opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatementse puso una img en la pantalla principal
        //
        //Constantinops committed
        //c4cab06
        if (id == R.id.action_settings) {

            Intent x= new Intent(getApplicationContext(),login.class);
            startActivity(x);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
      //Fragment mi=null;
      //boolean fragmentSeleccionado=false;


        if (id == R.id.nav_camera) {
            //mi=new animalito_Fragment();
            //fragmenselecionado=true;
            Intent x=new Intent(getApplicationContext(),abcActivity.class);
            startActivity(x);
        } else if (id == R.id.nav_gallery) {
           // mi=new animalito_Fragment();
            //fragmentSeleccionado=true;
            Intent x=new Intent(getApplicationContext(),AnimalActivity.class);
            startActivity(x);
        } else if (id == R.id.nav_slideshow) {
            Intent x=new Intent(getApplicationContext(), ColoresActivity.class);
            startActivity(x);
        } else if (id == R.id.nav_manage) {
            Intent x=new Intent(getApplicationContext(),NumeroActivity.class);
            startActivity(x);

        }else if(id==R.id.nav_frutas){
            Intent x=new Intent(getApplicationContext(),FrutasActivity.class);
            startActivity(x);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
/*
        if (fragmentSeleccionado==true) {
            getSupportFragmentManager().beginTransaction().replace(R.id.ecena, mi).commit();


        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
