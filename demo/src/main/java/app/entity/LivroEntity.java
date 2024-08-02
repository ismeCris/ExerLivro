package app.entity;

import java.sql.Date;

public class LivroEntity {
	private String titulo;
	private Date ano_publi;
	private String autor;
	
	public LivroEntity(){
		
	}
	public LivroEntity(String titulo, Date ano_publi, String autor){
		
		this.titulo = titulo;
		this.ano_publi = ano_publi;
		this.autor = autor;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getAno_publi() {
		return ano_publi;
	}
	public void setAno_publi(Date ano_publi) {
		this.ano_publi = ano_publi;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
