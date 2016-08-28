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

import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.adapters.opecvisible.generales.opecvisible.generales.departamento.EmpleoPorDepartamentoAdapter;
import com.jari.example.navigationdrawer.models.opecvisible.generales.departamento.EmpleoPorDepartamento;
import com.jari.example.navigationdrawer.models.opecvisible.generales.rango.EmpleoPorRango;
import com.jari.example.navigationdrawer.services.ApiClientEmpleos;
import com.jari.example.navigationdrawer.services.ApiInterfaceEmpleos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jonnathan on 15/08/2016.
 */
public class FragmentEmpleoPorDepartamento extends Fragment {
    private static final String KEY_BUNDLE_LISTAEMPLEOPORDEPARTAMENTO = "FragmentEmpleoPorDepartamento_key_lista";
    RecyclerView _recyclerView;
    private ArrayList<EmpleoPorDepartamento> _listaEmpleoPorDepartamentos;

    public FragmentEmpleoPorDepartamento() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_empleos_x_departamento, container, false);
        _recyclerView = (RecyclerView) view.findViewById(R.id.empleosRecyclerView);
        _recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        if(savedInstanceState != null) {
            _listaEmpleoPorDepartamentos = savedInstanceState.getParcelableArrayList(KEY_BUNDLE_LISTAEMPLEOPORDEPARTAMENTO);
        }
        cargarEmpleos();
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(KEY_BUNDLE_LISTAEMPLEOPORDEPARTAMENTO, _listaEmpleoPorDepartamentos);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null) {
            _listaEmpleoPorDepartamentos = savedInstanceState.getParcelableArrayList(KEY_BUNDLE_LISTAEMPLEOPORDEPARTAMENTO);
        }
    }

    private void cargarEmpleos() {
        if(_listaEmpleoPorDepartamentos != null && _listaEmpleoPorDepartamentos.size()>0) {
            _recyclerView.setAdapter(new EmpleoPorDepartamentoAdapter(_listaEmpleoPorDepartamentos, getActivity().getApplicationContext()));
        } else {
            ApiInterfaceEmpleos apiService = ApiClientEmpleos.getClient().create(ApiInterfaceEmpleos.class);
            Call<List<EmpleoPorDepartamento>> call = apiService.getEmpleosPorDepartamentos();
            call.enqueue(new Callback<List<EmpleoPorDepartamento>>() {
                @Override
                public void onResponse(Call<List<EmpleoPorDepartamento>> call, Response<List<EmpleoPorDepartamento>> response) {

                    List<EmpleoPorDepartamento> listaObjetos = response.body();
                    _listaEmpleoPorDepartamentos = new ArrayList(listaObjetos);

                    _recyclerView.setAdapter(new EmpleoPorDepartamentoAdapter(_listaEmpleoPorDepartamentos, getActivity().getApplicationContext()));
                    Log.d(getContext().getString(R.string.tag), "EmpleoPorConvocatoria: " + listaObjetos.size());
                }

                @Override
                public void onFailure(Call<List<EmpleoPorDepartamento>> call, Throwable t) {

                }
            });
        }
    }
}
