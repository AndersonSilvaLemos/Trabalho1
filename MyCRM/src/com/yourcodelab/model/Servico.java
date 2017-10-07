package com.yourcodelab.model;

public class Servico {
	private int id;
	private String serial;
	private String data;
	private String hora;
	private String descricaoDefeito;
	private Float valorConserto;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDescricaoDefeito() {
		return descricaoDefeito;
	}
	public void setDescricaoDefeito(String descricaoDefeito) {
		this.descricaoDefeito = descricaoDefeito;
	}
	public Float getValorConserto() {
		return valorConserto;
	}
	public void setValorConserto(Float valorConserto) {
		this.valorConserto = valorConserto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Servico(int id, String serial, String data, String hora, String descricaoDefeito, Float valorConserto,
			String status) {
		super();
		this.id = id;
		this.serial = serial;
		this.data = data;
		this.hora = hora;
		this.descricaoDefeito = descricaoDefeito;
		this.valorConserto = valorConserto;
		this.status = status;
	}

	
	
}
