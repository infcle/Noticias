package com.hakiari.noticias.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hakiari.noticias.R;
import com.hakiari.noticias.model.Noticia;

import java.util.ArrayList;

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder> {
    private ArrayList<Noticia> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitulo;
        public ImageView ivImagen;

        public ViewHolder(View v) {
            super(v);
            tvTitulo= v.findViewById(R.id.tvNoticiaTitulo);
            ivImagen=v.findViewById(R.id.ivNoticiaImagen);
        }
    }

    public NoticiasAdapter() {
        mDataSet = new ArrayList<>();
    }

    public void setDataSet(ArrayList<Noticia> dataSet) {
        mDataSet = dataSet;
        notifyDataSetChanged();
    }

    @Override
    public NoticiasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nnoticias_view, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.tvTitulo.setText(mDataSet.get(i).getTitulo());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}