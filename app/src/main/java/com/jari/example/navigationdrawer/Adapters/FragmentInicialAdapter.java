package com.jari.example.navigationdrawer.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jari.example.navigationdrawer.fragments.FragmentEmpleoPorConvocatoria;
import com.jari.example.navigationdrawer.fragments.FragmentEmpleoPorDepartamento;
import com.jari.example.navigationdrawer.fragments.FragmentEmpleoPorRango;

/**
 * Created by Jonnathan on 19/08/2016.
 */
public class FragmentInicialAdapter extends FragmentPagerAdapter {
    private final int ITEMS = 3;

    public FragmentInicialAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 1:
                return new FragmentEmpleoPorConvocatoria();
            case 2:
                return new FragmentEmpleoPorRango();
            case 3:
                return new FragmentEmpleoPorDepartamento();
            default:
                return new FragmentEmpleoPorConvocatoria();
        }
    }

    @Override
    public int getCount() {
        return ITEMS;
    }
}
