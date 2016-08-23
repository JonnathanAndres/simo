package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jari.example.navigationdrawer.adapters.EmpleoAdapter;
import com.jari.example.navigationdrawer.MainActivity;
import com.jari.example.navigationdrawer.models.ResultadoOfertaPublica;
import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.services.ApiClient;
import com.jari.example.navigationdrawer.services.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Fragment1 extends Fragment {
    public static final String TAG = "SIMO";
    public static final String BASE_URL = "http://simo.cnsc.gov.co/empleos/opecvisible/generales/departamento";
    private static Retrofit retrofit = null;
    RecyclerView recyclerView;
    List<ResultadoOfertaPublica> _listaResultadoOfertaPublica;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.empleosRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        cargarEmpleos("datos", MainActivity.NUMERO_REGISTROS);
    }

    public static Retrofit getDepartamentos() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

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
