package com.example.stose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carrito")
public class Carrito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "img")
    private String img;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "cantidad")
    private String cantidad;

    @Column(name = "precio")
    private String precio;

    @Override
    public String toString() {
        return "Carrito [id=" + id + ", img=" + img + ", titulo=" + titulo + ", cantidad=" + cantidad + ", precio="
                + precio + "]";
    }

    public Carrito(Long id, String img, String titulo, String cantidad, String precio) {
        this.id = id;
        this.img = img;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Carrito(String img, String titulo, String cantidad, String precio) {
        this.img = img;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Carrito() {

    }

}
