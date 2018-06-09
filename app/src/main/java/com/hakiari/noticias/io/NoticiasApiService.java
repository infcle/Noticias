package com.hakiari.noticias.io;

import com.hakiari.noticias.model.Noticia;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NoticiasApiService {

    @GET("noticias")
    Call<ArrayList<Noticia>> getNoticias();



}