package com.example.stose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_destacados")
public class destacados {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "img")
	    private String img;

	    @Column(name = "titulo", nullable = false, length = 100)
	    private String titulo;

	    @Column(name = "autor", nullable = false, length = 100)
	    private String autor;

	    @Column(name = "id_editorial", nullable = false, length = 50)
	    private String id_editorial;

	    @Column(name = "id_categoria", nullable = false, length = 50)
	    private String id_categoria;

	    @Column(name = "id_subcategoria", nullable = false, length = 50)
	    private String id_subcategoria;

	    @Column(name = "precio_original", nullable = false, length = 50)
	    private String precio_original;

	    @Column(name = "precio_descuento", nullable = false, length = 50)
	    private String precio_descuento;

	    @Column(name = "porcentaje_descuento", nullable = false, length = 50)
	    private String porcentaje_descuento;

	    @Column(name = "numero_pagina", nullable = false, length = 50)
	    private String numero_pagina;

	    @Column(name = "year_publicacion", nullable = false, length = 50)
	    private String year_publicacion;

	    @Column(name = "disponible", nullable = false, length = 50)
	    private String disponible;

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

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public String getId_editorial() {
	        return id_editorial;
	    }

	    public void setId_editorial(String id_editorial) {
	        this.id_editorial = id_editorial;
	    }

	    public String getId_categoria() {
	        return id_categoria;
	    }

	    public void setId_categoria(String id_categoria) {
	        this.id_categoria = id_categoria;
	    }

	    public String getId_subcategoria() {
	        return id_subcategoria;
	    }

	    public void setId_subcategoria(String id_subcategoria) {
	        this.id_subcategoria = id_subcategoria;
	    }

	    public String getPrecio_original() {
	        return precio_original;
	    }

	    public void setPrecio_original(String precio_original) {
	        this.precio_original = precio_original;
	    }

	    public String getPrecio_descuento() {
	        return precio_descuento;
	    }

	    public void setPrecio_descuento(String precio_descuento) {
	        this.precio_descuento = precio_descuento;
	    }

	    public String getPorcentaje_descuento() {
	        return porcentaje_descuento;
	    }

	    public void setPorcentaje_descuento(String porcentaje_descuento) {
	        this.porcentaje_descuento = porcentaje_descuento;
	    }

	    public String getNumero_pagina() {
	        return numero_pagina;
	    }

	    public void setNumero_pagina(String numero_pagina) {
	        this.numero_pagina = numero_pagina;
	    }

	    public String getYear_publicacion() {
	        return year_publicacion;
	    }

	    public void setYear_publicacion(String year_publicacion) {
	        this.year_publicacion = year_publicacion;
	    }

	    public String getDisponible() {
	        return disponible;
	    }

	    public void setDisponible(String disponible) {
	        this.disponible = disponible;
	    }

	    public destacados(Long id, String img, String titulo, String autor, String id_editorial, String id_categoria,
	            String id_subcategoria, String precio_original, String precio_descuento, String porcentaje_descuento,
	            String numero_pagina, String year_publicacion, String disponible) {
	        this.id = id;
	        this.img = img;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.id_editorial = id_editorial;
	        this.id_categoria = id_categoria;
	        this.id_subcategoria = id_subcategoria;
	        this.precio_original = precio_original;
	        this.precio_descuento = precio_descuento;
	        this.porcentaje_descuento = porcentaje_descuento;
	        this.numero_pagina = numero_pagina;
	        this.year_publicacion = year_publicacion;
	        this.disponible = disponible;
	    }

	    public destacados(String img, String titulo, String autor, String id_editorial, String id_categoria,
	            String id_subcategoria, String precio_original, String precio_descuento, String porcentaje_descuento,
	            String numero_pagina, String year_publicacion, String disponible) {
	        this.img = img;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.id_editorial = id_editorial;
	        this.id_categoria = id_categoria;
	        this.id_subcategoria = id_subcategoria;
	        this.precio_original = precio_original;
	        this.precio_descuento = precio_descuento;
	        this.porcentaje_descuento = porcentaje_descuento;
	        this.numero_pagina = numero_pagina;
	        this.year_publicacion = year_publicacion;
	        this.disponible = disponible;
	    }

	    @Override
	    public String toString() {
	        return "Tendencia [id=" + id + ", img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", id_editorial="
	                + id_editorial + ", id_categoria=" + id_categoria + ", id_subcategoria=" + id_subcategoria
	                + ", precio_original=" + precio_original + ", precio_descuento=" + precio_descuento
	                + ", porcentaje_descuento=" + porcentaje_descuento + ", numero_pagina=" + numero_pagina
	                + ", year_publicacion=" + year_publicacion + ", disponible=" + disponible + "]";
	    }

	    public destacados() {
	        
	    }
}
