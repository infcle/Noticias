package com.hakiari.noticias.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hakiari.noticias.R;
import com.hakiari.noticias.model.Noticia;
import com.hakiari.noticias.ui.activity.CompletaActivity;

import java.util.ArrayList;

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder> {
    private ArrayList<Noticia> mDataSet;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitulo;
        public TextView tvResumen;
        public ImageView ivImagen;
        public TextView tvFuente;

        public ViewHolder(View v) {
            super(v);
            tvTitulo = v.findViewById(R.id.tvNoticiaTitulo);
            tvResumen = v.findViewById(R.id.tvResumen);
            ivImagen = v.findViewById(R.id.ivNoticiaImagen);
            tvFuente=v.findViewById(R.id.tvFuente);
        }
    }

    public NoticiasAdapter(Context context) {
        mDataSet = new ArrayList<>();
        this.context=context;
    }

    public void setDataSet(ArrayList<Noticia> dataSet) {
        mDataSet = dataSet;
        notifyDataSetChanged();
    }

    @Override
    public NoticiasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nnoticias_view, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.tvTitulo.setText(Html.fromHtml(mDataSet.get(i).getTitulo()));
        holder.tvFuente.setText(Html.fromHtml(mDataSet.get(i).getFuente()));
        String nota=mDataSet.get(i).Resumen(mDataSet.get(i).getDetalle());
        holder.tvResumen.setText(nota);
        try {
            byte[] byteData = Base64.decode(mDataSet.get(i).getImg_mini(), Base64.DEFAULT);
            Bitmap imagen_mini = BitmapFactory.decodeByteArray( byteData, 0, byteData.length);
            holder.ivImagen.setImageBitmap(imagen_mini);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        // bind click event
        holder.tvResumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, CompletaActivity.class);
                intent.putExtra("mi_noticia",mDataSet.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}