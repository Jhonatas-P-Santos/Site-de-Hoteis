package br.com.model;

public class HotelModel {

	Integer idnordeste;
	Integer telefone;
	String nome;
	String estado;
	String site;
	
	
	public HotelModel(Integer idnordeste, Integer telefone, String nome, String estado, String site) {
		super();
		this.idnordeste = idnordeste;
		this.telefone = telefone;
		this.nome = nome;
		this.estado = estado;
		this.site = site;
	}
	
	
	public Integer getIdnordeste() {
		return idnordeste;
	}
	public void setIdnordeste(Integer idnordeste) {
		this.idnordeste = idnordeste;
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