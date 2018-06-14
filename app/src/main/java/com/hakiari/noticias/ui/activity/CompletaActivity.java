package com.hakiari.noticias.ui.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.hakiari.noticias.R;
import com.hakiari.noticias.model.Noticia;

public class CompletaActivity extends AppCompatActivity {
    Noticia noticia;
    ImageView imagenNota;
    TextView titular;
    TextView detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completa);
        imagenNota = findViewById(R.id.ivCompletaImagen);
        titular = findViewById(R.id.tvCompletaTitulo);
        detalle = findViewById(R.id.tvCompletaDetalle);
        noticia = (Noticia) getIntent().getSerializableExtra("mi_noticia");

        imagenNota.setImageBitmap(noticia.getImagen_media());
        titular.setText(Html.fromHtml(noticia.getTitulo()));
        detalle.setText(Html.fromHtml(noticia.getDetalle()));
    }
}
