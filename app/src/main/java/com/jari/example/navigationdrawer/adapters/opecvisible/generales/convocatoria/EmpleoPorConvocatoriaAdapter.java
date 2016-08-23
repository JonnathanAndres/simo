package com.jari.example.navigationdrawer.adapters.opecvisible.generales.convocatoria;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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
    private int rowLayout;
    private Context context;


    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;


        public MovieViewHolder(View v) {
            super(v);
            moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
            movieDescription = (TextView) v.findViewById(R.id.description);
            rating = (TextView) v.findViewById(R.id.rating);
        }
    }

    public EmpleoPorConvocatoriaAdapter(List<EmpleoPorConvocatoria> empleoPorConvocatorias, int rowLayout, Context context) {
        this.empleos = empleoPorConvocatorias;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public EmpleoPorConvocatoriaAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        v = LayoutInflater.from(viewGroup.getContext())
//                .inflate(R.layout.clientes_cliente_item, viewGroup, false);
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(empleos.get(position).getDescripcion());

        String desagregados = new String();

        for (Desagregado item :
                empleos.get(position).getDesagregados()) {
            desagregados = (desagregados.length()==0?"":desagregados + "\n") + item.getDescripcion() + item.getValor();
        }

        holder.data.setText(desagregados);
        holder.movieDescription.setText(empleos.get(position).getDescripcion());
        holder.rating.setText(String.valueOf(empleos.get(position).getValor()));
    }

    @Override
    public int getItemCount() {
        return empleos.size();
    }
}