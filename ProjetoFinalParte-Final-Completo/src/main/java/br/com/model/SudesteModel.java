package br.com.model;

public class SudesteModel {

	Integer idsudeste;
	Integer telefone;
	String nome;
	String estado;
	String site;
	
	
	
	
	public SudesteModel(Integer idsudeste, Integer telefone, String nome, String estado, String site) {
		super();
		this.idsudeste = idsudeste;
		this.telefone = telefone;
		this.nome = nome;
		this.estado = estado;
		this.site = site;
	}
	
	
	
	public Integer getIdsudeste() {
		return idsudeste;
	}
	public void setIdsudeste(Integer idsudeste) {
		this.idsudeste = idsudeste;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	
}
