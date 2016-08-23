package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jari.example.navigationdrawer.MainActivity;
import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.adapters.EmpleoAdapter;
import com.jari.example.navigationdrawer.adapters.opecvisible.generales.convocatoria.EmpleoPorConvocatoriaAdapter;
import com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria.EmpleoPorConvocatoria;
import com.jari.example.navigationdrawer.services.ApiClientEmpleos;
import com.jari.example.navigationdrawer.services.ApiInterfaceEmpleos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Jonnathan on 15/08/2016.
 */
public class FragmentEmpleoPorConvocatoria extends Fragment {
    public static final String TAG = "SIMO";
    private static Retrofit retrofit = null;
    RecyclerView _recyclerView;
    List<EmpleoPorConvocatoria> _listaEmpleoPorConvocatoria;

    public FragmentEmpleoPorConvocatoria() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_empleos_x_convocatoria, container, false);
        _recyclerView = (RecyclerView) view.findViewById(R.id.empleosRecyclerView);
        _recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        cargarEmpleos("datos", MainActivity.NUMERO_REGISTROS);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    private void cargarEmpleos(String palabraClave, int numeroRegistros) {
        ApiInterfaceEmpleos apiService = ApiClientEmpleos.getClient().create(ApiInterfaceEmpleos.class);
        Call<List<EmpleoPorConvocatoria>> call = apiService.getEmpleosPorConvocatorias();
        call.enqueue(new Callback<List<EmpleoPorConvocatoria>>() {
            @Override
            public void onResponse(Call<List<EmpleoPorConvocatoria>> call, Response<List<EmpleoPorConvocatoria>> response) {

                List<EmpleoPorConvocatoria> listaObjetos =  response.body(); // response.body().getResults();
                _listaEmpleoPorConvocatoria = listaObjetos;

                _recyclerView.setAdapter(new EmpleoPorConvocatoriaAdapter(_listaEmpleoPorConvocatoria, R.layout.list_item_empleo, getActivity().getApplicationContext()));
                Log.d(TAG, "ResultadoOfertaPublica: " + listaObjetos.size());
            }

            @Override
            public void onFailure(Call<List<EmpleoPorConvocatoria>> call, Throwable t) {

            }
        });


//        ApiInterface apiService = ApiClient.getClientOfertaPublica().create(ApiInterface.class);
//
//        Call<List<ResultadoOfertaPublica>> call = apiService.getOfertaPublica(palabraClave, numeroRegistros);
//        call.enqueue(new Callback<List<ResultadoOfertaPublica>>() {
//            @Override
//            public void onResponse(Call<List<ResultadoOfertaPublica>>call, Response<List<ResultadoOfertaPublica>> response) {
//                int n = 8;
//
//
//                List<ResultadoOfertaPublica> listaObjetos =  response.body(); // response.body().getResults();
//                _listaEmpleoPorConvocatoria = listaObjetos;
//
//                _recyclerView.setAdapter(new EmpleoAdapter(_listaEmpleoPorConvocatoria, R.layout.list_item_empleo, getActivity().getApplicationContext()));
//                Log.d(TAG, "ResultadoOfertaPublica: " + listaObjetos.size());
//            }
//
//            @Override
//            public void onFailure(Call<List<ResultadoOfertaPublica>>call, Throwable t) {
//                // Log error here since request failed
//                Log.e(TAG, t.toString());
//            }
//        });


    }

}
