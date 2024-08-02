package app.entity;

import java.sql.Date;

public class LivroEntity {
	private long id;
	private String titulo;
	private String ano_publi;
	private String autor;
	
	public LivroEntity(){
		
	}
	public LivroEntity(long id, String titulo, String ano_publi, String autor){
		this.id = id;
		this.titulo = titulo;
		this.ano_publi = ano_publi;
		this.autor = autor;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno_publi() {
		return ano_publi;
	}
	public void setAno_publi(String ano_publi) {
		this.ano_publi = ano_publi;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
