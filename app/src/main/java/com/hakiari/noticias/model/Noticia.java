package com.hakiari.noticias.model;

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
    }

    public String getImg_mini() {
        return img_mini;
    }

    public void setImg_mini(String img_mini) {
        this.img_mini = img_mini;
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
}


