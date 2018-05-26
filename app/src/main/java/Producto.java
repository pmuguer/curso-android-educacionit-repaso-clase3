package com.example.pablo.repasoandroid;

public class Producto {
    private String nombre;
    private Integer precio;
    //private Integer imagen;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
        //this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    //public Integer getImagen() {
    //    return imagen;
    //}
}
