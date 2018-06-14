package com.hakiari.noticias.ui.activity;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Base64;
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
        String data=getIntent().getStringExtra("imagen");

        try {
            byte[] byteData = Base64.decode(data, Base64.DEFAULT);
            Bitmap imagen_media = BitmapFactory.decodeByteArray(byteData, 0, byteData.length);
            imagenNota.setImageBitmap(imagen_media);
        } catch (Exception e) {
            e.printStackTrace();
        }
        titular.setText(Html.fromHtml(getIntent().getStringExtra("titulo")));
        detalle.setText(Html.fromHtml(getIntent().getStringExtra("detalle")));
    }
}
