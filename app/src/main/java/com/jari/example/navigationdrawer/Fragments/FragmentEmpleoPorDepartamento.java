package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jari.example.navigationdrawer.R;

/**
 * Created by Jonnathan on 15/08/2016.
 */
public class FragmentEmpleoPorDepartamento extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_empleos_x_departamento, container, false);
        return view;
    }
}
