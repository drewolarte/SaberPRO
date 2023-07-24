package com.saberpro.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Coordinador {
	
	@Id
	private String id;
	
	private String usuario;
	
	private String password;
	
	private String nombre;
	
	private String apellido;

	public Coordinador() {}
	
	public Coordinador(String id, String usuario, String password, String nombre, String apellido) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	

}
