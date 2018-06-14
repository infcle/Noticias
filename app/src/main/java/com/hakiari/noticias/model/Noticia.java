package com.hakiari.noticias.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class Noticia {
    int id_puntobolnoticias;
    String titulo;
    String detalle;
    String fuente;
    String fecha;
    String img_media;
    String img_mini;
    String mime;
    String nombrefile;
    int importancia;
    int prioridad;
    Bitmap imagen_media;
    Bitmap imagen_mini;

    public int getId_puntobolnoticias() {
        return id_puntobolnoticias;
    }

    public void setId_puntobolnoticias(int id_puntobolnoticias) {
        this.id_puntobolnoticias = id_puntobolnoticias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImg_media() {
        return img_media;
    }

    public void setImg_media(String img_media) {
        this.img_media = img_media;
        try {
            byte[] byteData = Base64.decode(img_media, Base64.DEFAULT);
            this.imagen_media = BitmapFactory.decodeByteArray(byteData, 0, byteData.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getImg_mini() {
        return img_mini;
    }

    public void setImg_mini(String img_mini) {
        this.img_mini = img_mini;
        try {
            byte[] byteData = Base64.decode(img_mini, Base64.DEFAULT);
            this.imagen_mini = BitmapFactory.decodeByteArray(byteData, 0, byteData.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getNombrefile() {
        return nombrefile;
    }

    public void setNombrefile(String nombrefile) {
        this.nombrefile = nombrefile;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Bitmap getImagen_media() {
        return imagen_media;
    }

    public Bitmap getImagen_mini() {
        return imagen_mini;
    }

    public String Resumen(String nota) {
        String aux = nota.substring(0, 100);
        return aux + " ver mas...";
    }
}


