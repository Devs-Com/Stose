package com.example.stose.model;

public class libroOfertaModel {

		//Detalle Libro
		private String Titulo;
		private String Autor;
		
		//Descripcion
		private String Contenido;
		
		//Informacion
		private String AutorInfo;
		private String Categoria;
		private String AnoPublicacion;
		private String Editorial;
		private String NumeroPaginas;
		
		
		
		//DETALLE LIBRO
		public String getTitulo() {
	        return Titulo;
	    }
	    public void setTitulo(String titulo) {
	        Titulo = titulo;
	    }
		
	    public String getAutor() {
	    	return Autor;
	    }
	    
	    public void setAutor(String autor) {
	    	Autor = autor;
	    }
	    
		//DESCRIPCIÓN
	    
	    public String getContenido() {
	    	return Contenido;
	    }
	    
	    public void setContenido(String contenido) {
	    	Contenido = contenido;
	    }
		
		//INFORMACIÓN
	    public String getAutorInfo() {
	    	return AutorInfo;
	    }
	    
	    public void setAutorInfo(String autorInfo) {
	    	AutorInfo = autorInfo;
	    }
	    
	    public String getCategoria() {
	    	return Categoria;
	    }
	    
	    public void setCategoria(String categoria) {
	    	Categoria = categoria;
	    }
	    
	    public String getAnoPublicacion() {
	    	return AnoPublicacion;
	    }
	    
	    public void setAnoPublicacion(String anoPublicacion) {
	    	AnoPublicacion = anoPublicacion;
	    }
	    
	    public String getEditorial() {
	    	return Editorial;
	    }
	    
	    public void setEditorial(String editorial) {
	    	Editorial = editorial;
	    }
	    
	    public String getNumeroPaginas() {
	    	return NumeroPaginas;
	    }
	    
	    public void setNumeroPaginas(String numeroPaginas) {
	    	NumeroPaginas = numeroPaginas;
	    }
		
		
}
