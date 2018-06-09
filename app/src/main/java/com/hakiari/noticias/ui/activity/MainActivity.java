package com.hakiari.noticias.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.hakiari.noticias.R;
import com.hakiari.noticias.io.NoticiasApiAdapter;
import com.hakiari.noticias.model.Noticia;
import com.hakiari.noticias.ui.adapter.NoticiasAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<ArrayList<Noticia>> {

    private NoticiasAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.recycler_view_noticias);

        // Usar esta línea para mejorar el rendimiento
        // si sabemos que el contenido no va a afectar
        // el tamaño del RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // Nuestro RecyclerView usará un linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        // Asociamos un adapter (ver más adelante cómo definirlo)
        mAdapter = new NoticiasAdapter();
        mRecyclerView.setAdapter(mAdapter);

        Call<ArrayList<Noticia>> call= NoticiasApiAdapter.getApiService().getNoticias();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<ArrayList<Noticia>> call, Response<ArrayList<Noticia>> response) {
       if(response.isSuccessful()){
           ArrayList<Noticia> noticias =response.body();
           Log.d("onResponse noticias","Size of noticias => "+ noticias.size());
           mAdapter.setDataSet(noticias);
       }
    }

    @Override
    public void onFailure(Call<ArrayList<Noticia>> call, Throwable t) {

    }
}
