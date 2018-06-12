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
            this.imagen_media = BitmapFactory.decodeByteArray( byteData, 0, byteData.length);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String getImg_mini() {
        return img_mini;
    }

    public void setImg_mini(String img_mini) {
        this.img_mini = img_mini;
        try {
            byte[] byteData = Base64.decode("/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAAA8AAD/4QMvaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjYtYzA2NyA3OS4xNTc3NDcsIDIwMTUvMDMvMzAtMjM6NDA6NDIgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDQyAyMDE1IChXaW5kb3dzKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDowRjRGOUJGNUUxN0YxMUU2OUM0N0Q2ODMyQjA5RjZCQyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDowRjRGOUJGNkUxN0YxMUU2OUM0N0Q2ODMyQjA5RjZCQyI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjBGNEY5QkYzRTE3RjExRTY5QzQ3RDY4MzJCMDlGNkJDIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjBGNEY5QkY0RTE3RjExRTY5QzQ3RDY4MzJCMDlGNkJDIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+/+4ADkFkb2JlAGTAAAAAAf/bAIQABgQEBAUEBgUFBgkGBQYJ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", Base64.DEFAULT);
            this.imagen_mini = BitmapFactory.decodeByteArray( byteData, 0, byteData.length);
        }
        catch(Exception e) {
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
}


