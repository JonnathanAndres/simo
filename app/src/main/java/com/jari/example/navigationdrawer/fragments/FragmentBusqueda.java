package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jari.example.navigationdrawer.MainActivity;
import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.adapters.EmpleoAdapter;
import com.jari.example.navigationdrawer.models.ResultadoOfertaPublica;
import com.jari.example.navigationdrawer.services.ApiClient;
import com.jari.example.navigationdrawer.services.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FragmentBusqueda extends Fragment {
    public static final String TAG = "SIMO";
    public static final String BASE_URL = "http://simo.cnsc.gov.co/empleos/opecvisible/generales/departamento";
    private static Retrofit retrofit = null;
    private RecyclerView recyclerView;
    List<ResultadoOfertaPublica> _listaResultadoOfertaPublica;
    MenuItem _searchMenuItem;
    SearchView _searchView;
    Button _buttonFiltros;

    //region parametrosBusqueda
    private String _palabraClave;
    private String _nivel;
    private String _convocatoria;
    private String _departamento;
    private String _ciudad;
    private String _salario;
    private String _entidad;
    private String _numeroEmpleoOPEC;
    //endregion

    public FragmentBusqueda() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_busqueda, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.empleosRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        _buttonFiltros = (Button)view.findViewById(R.id.buttonFiltros);
        _buttonFiltros.setOnClickListener(onClickListenerButtonFiltros);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_busqueda, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        _searchMenuItem = menu.findItem(R.id.search);
        _searchView = (SearchView) _searchMenuItem.getActionView();
        _searchView.setOnQueryTextListener(queryTextListener);
    }

    SearchView.OnQueryTextListener queryTextListener = new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            _palabraClave = query;
            cargarEmpleos(query, MainActivity.NUMERO_REGISTROS);
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            return false;
        }
    };

    View.OnClickListener onClickListenerButtonFiltros = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DialogFragmentFiltrosBusqueda dialogFragmentFiltrosBusqueda = new DialogFragmentFiltrosBusqueda();
            FragmentManager manager = getFragmentManager();
            dialogFragmentFiltrosBusqueda.show(manager, getString(R.string.dialog_fragment_filtros_busqueda_tag));
        }
    };

    private void cargarEmpleos(String palabraClave, int numeroRegistros) {
        ApiInterface apiService = ApiClient.getClientOfertaPublica().create(ApiInterface.class);

        Call<List<ResultadoOfertaPublica>> call = apiService.getOfertaPublica(palabraClave, numeroRegistros);
        call.enqueue(new Callback<List<ResultadoOfertaPublica>>() {
            @Override
            public void onResponse(Call<List<ResultadoOfertaPublica>>call, Response<List<ResultadoOfertaPublica>> response) {
                int n = 8;


                List<ResultadoOfertaPublica> listaObjetos =  response.body(); // response.body().getResults();
                _listaResultadoOfertaPublica = listaObjetos;

                recyclerView.setAdapter(new EmpleoAdapter(_listaResultadoOfertaPublica, R.layout.list_item_empleo, getActivity().getApplicationContext()));
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
