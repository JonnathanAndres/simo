package com.jari.example.navigationdrawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.jari.example.navigationdrawer.fragments.Fragment1;
import com.jari.example.navigationdrawer.fragments.FragmentBusqueda;
import com.jari.example.navigationdrawer.fragments.FragmentInicial;
import com.jari.example.navigationdrawer.models.Departamento;
import com.jari.example.navigationdrawer.models.ResultadoOfertaPublica;
import com.jari.example.navigationdrawer.services.ApiClient;
import com.jari.example.navigationdrawer.services.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public static final String TAG = "SIMO";
    List<Departamento> _listaDepartamentos = new ArrayList<>();
    List<ResultadoOfertaPublica> _listaResultadoOfertaPublica;
    public static final int NUMERO_REGISTROS = 30;

    private FragmentInicial _fragmentInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        cargarDatosGenerales();
//        cargarEmpleosPublicos("sistemas");
        cargarEmpleosPublicos("sistemas", NUMERO_REGISTROS);
        cargarFragmentInicial();
    }

    private void cargarFragmentInicial() {
        _fragmentInicial = new FragmentInicial();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, _fragmentInicial)
                .commit();
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
        boolean fragmentTransaction = false;
        Fragment fragment = null;
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            if(_fragmentInicial == null)
                _fragmentInicial = new FragmentInicial();
            fragment = _fragmentInicial;
            fragmentTransaction = true;
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {
            fragment = new FragmentBusqueda();
            fragmentTransaction = true;
        } else if (id == R.id.nav_manage) {
            fragment = new Fragment1();
            fragmentTransaction = true;
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        if(fragmentTransaction) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, fragment)
                    .commit();

//            menuItem.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void cargarDatosGenerales() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<List<Departamento>> call = apiService.getDepartamentos();
        call.enqueue(new Callback<List<Departamento>>() {
            @Override
            public void onResponse(Call<List<Departamento>>call, Response<List<Departamento>> response) {
                List<Departamento> listaDepartamentos =  response.body(); // response.body().getResults();
                _listaDepartamentos = listaDepartamentos;
                Log.d(TAG, "Departamentos: " + listaDepartamentos.size());
            }

            @Override
            public void onFailure(Call<List<Departamento>>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });



    }


    private void cargarEmpleosPublicos(String palabraClave) {
        ApiInterface apiService = ApiClient.getClientOfertaPublica().create(ApiInterface.class);

        Call<List<Object>> call = apiService.getOfertaPublica(palabraClave);
        call.enqueue(new Callback<List<Object>>() {
            @Override
            public void onResponse(Call<List<Object>>call, Response<List<Object>> response) {
                int n = 8;


                List<Object> listaObjetos =  response.body(); // response.body().getResults();
                if(listaObjetos.size() > 0) {
                    Object objeto = listaObjetos.get(0);
                }
                Log.d(TAG, "Objetos: " + listaObjetos.size());
            }

            @Override
            public void onFailure(Call<List<Object>>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }

    private void cargarEmpleosPublicos(String palabraClave, int numeroRegistros) {
        ApiInterface apiService = ApiClient.getClientOfertaPublica().create(ApiInterface.class);

        Call<List<ResultadoOfertaPublica>> call = apiService.getOfertaPublica(palabraClave, numeroRegistros);
        call.enqueue(new Callback<List<ResultadoOfertaPublica>>() {
            @Override
            public void onResponse(Call<List<ResultadoOfertaPublica>>call, Response<List<ResultadoOfertaPublica>> response) {
                int n = 8;


                List<ResultadoOfertaPublica> listaObjetos =  response.body(); // response.body().getResults();
                _listaResultadoOfertaPublica = listaObjetos;
                if(listaObjetos.size() > 0) {
                    ResultadoOfertaPublica resultadoOfertaPublica = listaObjetos.get(0);
                    Log.d(TAG, "Empleo: " + resultadoOfertaPublica.getEmpleo().getId() + ": " + resultadoOfertaPublica.getEmpleo().getAsignacionSalarial() + " = " + resultadoOfertaPublica.getEmpleo().getDescripcion() );
                    resultadoOfertaPublica.getEmpleo().getAsignacionSalarial();
                }
                Log.d(TAG, "ResultadoOfertaPublica: " + listaObjetos.size());
            }

            @Override
            public void onFailure(Call<List<ResultadoOfertaPublica>>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }

}
