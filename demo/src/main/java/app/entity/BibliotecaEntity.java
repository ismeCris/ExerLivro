package app.entity;

public class BibliotecaEntity {
	private String endereco;
	private String telefone;
	
	public  BibliotecaEntity() {
	

	}
	public  BibliotecaEntity(String endereco, String telefone) {
		this.endereco = endereco;
		this.telefone = telefone;

	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
