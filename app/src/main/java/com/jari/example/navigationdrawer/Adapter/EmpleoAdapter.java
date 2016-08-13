package com.jari.example.navigationdrawer.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jari.example.navigationdrawer.Model.ResultadoOfertaPublica;
import com.jari.example.navigationdrawer.R;

import java.util.List;

public class EmpleoAdapter extends RecyclerView.Adapter<EmpleoAdapter.MovieViewHolder> {

    private List<ResultadoOfertaPublica> ofertasPublicasEmpleo;
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

    public EmpleoAdapter(List<ResultadoOfertaPublica> movies, int rowLayout, Context context) {
        this.ofertasPublicasEmpleo = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public EmpleoAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(ofertasPublicasEmpleo.get(position).getEmpleo().getConvocatoria().getNombre());
        holder.data.setText(ofertasPublicasEmpleo.get(position).getEmpleo().getGradoNivel().getNivelNombre() + " - " + ofertasPublicasEmpleo.get(position).getEmpleo().getAsignacionSalarial());
        holder.movieDescription.setText(ofertasPublicasEmpleo.get(position).getEmpleo().getDescripcion());
        holder.rating.setText(ofertasPublicasEmpleo.get(position).getEmpleo().getGradoNivel().getGrado());
    }

    @Override
    public int getItemCount() {
        return ofertasPublicasEmpleo.size();
    }
}