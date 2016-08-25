package com.jari.example.navigationdrawer.adapters.opecvisible.generales.convocatoria;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria.Desagregado;
import com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria.EmpleoPorConvocatoria;

import java.util.List;

public class EmpleoPorConvocatoriaAdapter extends RecyclerView.Adapter<EmpleoPorConvocatoriaAdapter.MovieViewHolder> {

    private List<EmpleoPorConvocatoria> empleos;
    private Context context;

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView movieTitle;
        TextView data;

        public MovieViewHolder(View v) {
            super(v);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
        }
    }

    public EmpleoPorConvocatoriaAdapter(List<EmpleoPorConvocatoria> empleoPorConvocatorias, Context context) {
        this.empleos = empleoPorConvocatorias;
        this.context = context;
    }

    @Override
    public EmpleoPorConvocatoriaAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empleo_x_convocatoria, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(empleos.get(position).getDescripcion());

        String desagregados = new String();

        for (Desagregado item : empleos.get(position).getDesagregados()) {
            desagregados = (desagregados.length()==0?"":desagregados + "\n") + item.getDescripcion() + " - " + item.getValor();
        }

        holder.data.setText(desagregados);
    }

    @Override
    public int getItemCount() {
        return empleos.size();
    }
}