package com.jari.example.navigationdrawer.adapters.opecvisible.generales.rangos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jari.example.navigationdrawer.R;
import com.jari.example.navigationdrawer.adapters.opecvisible.generales.convocatoria.EmpleoPorConvocatoriaAdapter;
import com.jari.example.navigationdrawer.models.opecvisible.generales.rango.EmpleoPorRango;

import java.util.List;

/**
 * Created by Jonnathan on 27/08/2016.
 */
public class EmpleoPorRangoAdapter extends RecyclerView.Adapter<EmpleoPorRangoAdapter.EmpleoPorRangoHolder> {

    private List<EmpleoPorRango> empleos;
    private Context context;

    public static class EmpleoPorRangoHolder extends RecyclerView.ViewHolder {
        TextView movieTitle;
        TextView data;

        public EmpleoPorRangoHolder(View v) {
            super(v);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
        }
    }

    public EmpleoPorRangoAdapter(List<EmpleoPorRango> empleoPorConvocatorias, Context context) {
        this.empleos = empleoPorConvocatorias;
        this.context = context;
    }

    @Override
    public EmpleoPorRangoAdapter.EmpleoPorRangoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empleo_x_rangos, parent, false);
        return new EmpleoPorRangoHolder(view);
    }

    @Override
    public void onBindViewHolder(EmpleoPorRangoHolder holder, int position) {
        holder.movieTitle.setText(empleos.get(position).getDescripcion());
        holder.data.setText("" + empleos.get(position).getValor());
    }

    @Override
    public int getItemCount() {
        return empleos.size();
    }
}