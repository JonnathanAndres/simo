package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
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

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Jonnathan on 15/08/2016.
 */
public class FragmentEmpleoPorConvocatoria extends Fragment {
    private static final String KEY_BUNDLE_LISTAEMPLEOPORCONVOCATORIA = "FragmentEmpleoPorConvocatoria_key_lista";
    RecyclerView _recyclerView;
    ArrayList<EmpleoPorConvocatoria> _listaEmpleoPorConvocatoria;

    public FragmentEmpleoPorConvocatoria() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_empleos_x_convocatoria, container, false);
        _recyclerView = (RecyclerView) view.findViewById(R.id.empleosRecyclerView);
        _recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        if(savedInstanceState != null) {
            _listaEmpleoPorConvocatoria = savedInstanceState.getParcelableArrayList(KEY_BUNDLE_LISTAEMPLEOPORCONVOCATORIA);
        }
        cargarEmpleos();
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(KEY_BUNDLE_LISTAEMPLEOPORCONVOCATORIA, _listaEmpleoPorConvocatoria);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null) {
            _listaEmpleoPorConvocatoria = savedInstanceState.getParcelableArrayList(KEY_BUNDLE_LISTAEMPLEOPORCONVOCATORIA);
        }
    }

    private void cargarEmpleos() {
        if(_listaEmpleoPorConvocatoria != null && _listaEmpleoPorConvocatoria.size()>0) {
            _recyclerView.setAdapter(new EmpleoPorConvocatoriaAdapter(_listaEmpleoPorConvocatoria, getActivity().getApplicationContext()));
        } else {
            ApiInterfaceEmpleos apiService = ApiClientEmpleos.getClient().create(ApiInterfaceEmpleos.class);
            Call<List<EmpleoPorConvocatoria>> call = apiService.getEmpleosPorConvocatorias();
            call.enqueue(new Callback<List<EmpleoPorConvocatoria>>() {
                @Override
                public void onResponse(Call<List<EmpleoPorConvocatoria>> call, Response<List<EmpleoPorConvocatoria>> response) {

                    List<EmpleoPorConvocatoria> listaObjetos = response.body();
                    _listaEmpleoPorConvocatoria = new ArrayList(listaObjetos);

                    _recyclerView.setAdapter(new EmpleoPorConvocatoriaAdapter(_listaEmpleoPorConvocatoria, getActivity().getApplicationContext()));
                    Log.d(getContext().getString(R.string.tag), "EmpleoPorConvocatoria: " + listaObjetos.size());
                }

                @Override
                public void onFailure(Call<List<EmpleoPorConvocatoria>> call, Throwable t) {

                }
            });
        }

    }

}
