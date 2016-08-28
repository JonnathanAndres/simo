package com.jari.example.navigationdrawer.adapters.opecvisible.generales.opecvisible.generales.departamento;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.models.opecvisible.generales.departamento.EmpleoPorDepartamento;

import java.util.List;

/**
 * Created by Jonnathan on 28/08/2016.
 */
public class EmpleoPorDepartamentoAdapter extends RecyclerView.Adapter<EmpleoPorDepartamentoAdapter.EmpleoPorDepartamentoHolder> {

    private List<EmpleoPorDepartamento> empleos;
    private Context context;

    public static class EmpleoPorDepartamentoHolder extends RecyclerView.ViewHolder {
        TextView movieTitle;
        TextView data;

        public EmpleoPorDepartamentoHolder(View v) {
            super(v);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
        }
    }

    public EmpleoPorDepartamentoAdapter(List<EmpleoPorDepartamento> empleoPorDepartamento, Context context) {
        this.empleos = empleoPorDepartamento;
        this.context = context;
    }

    @Override
    public EmpleoPorDepartamentoAdapter.EmpleoPorDepartamentoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empleo_x_rangos, parent, false);
        return new EmpleoPorDepartamentoHolder(view);
    }

    @Override
    public void onBindViewHolder(EmpleoPorDepartamentoHolder holder, int position) {
        holder.movieTitle.setText(empleos.get(position).getDescripcion());
        holder.data.setText("" + empleos.get(position).getValor());
    }

    @Override
    public int getItemCount() {
        return empleos.size();
    }
}