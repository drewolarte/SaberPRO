package com.saberpro.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Estudiante {
	
	@Id
	private String id;
	
	private String usuario;
	
	private String password;
	
	private String nombre;
	
	private String apellido;
	
	private String correo;
	
	private String telefono;
	
	private String numregistro;
	
	private String estado;
	
	private double puntajeGlobal;
	
	private double puntajeComunicacion;
	
	private double puntajeRazonamiento;
	
	private double puntajeLectura;
	
	private double puntajeCompetencias;
	
	private double puntajeIngles;
	
	private double puntajeFormulacion;
	
	private double puntajePensamiento;
	
	private double puntajeDiseno;
	
	private String nivelIngles;

	public Estudiante() {}

	public Estudiante(String id, String usuario, String password, String nombre, String apellido, String correo,
			String telefono, String numregistro, String estado, double puntajeGlobal, double puntajeComunicacion,
			double puntajeRazonamiento, double puntajeLectura, double puntajeCompetencias, double puntajeIngles,
			double puntajeFormulacion, double puntajePensamiento, double puntajeDiseno, String nivelIngles) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.numregistro = numregistro;
		this.estado = estado;
		this.puntajeGlobal = puntajeGlobal;
		this.puntajeComunicacion = puntajeComunicacion;
		this.puntajeRazonamiento = puntajeRazonamiento;
		this.puntajeLectura = puntajeLectura;
		this.puntajeCompetencias = puntajeCompetencias;
		this.puntajeIngles = puntajeIngles;
		this.puntajeFormulacion = puntajeFormulacion;
		this.puntajePensamiento = puntajePensamiento;
		this.puntajeDiseno = puntajeDiseno;
		this.nivelIngles = nivelIngles;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNumregistro() {
		return numregistro;
	}

	public void setNumregistro(String numregistro) {
		this.numregistro = numregistro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPuntajeGlobal() {
		return puntajeGlobal;
	}

	public void setPuntajeGlobal(double puntajeGlobal) {
		this.puntajeGlobal = puntajeGlobal;
	}

	public double getPuntajeComunicacion() {
		return puntajeComunicacion;
	}

	public void setPuntajeComunicacion(double puntajeComunicacion) {
		this.puntajeComunicacion = puntajeComunicacion;
	}

	public double getPuntajeRazonamiento() {
		return puntajeRazonamiento;
	}

	public void setPuntajeRazonamiento(double puntajeRazonamiento) {
		this.puntajeRazonamiento = puntajeRazonamiento;
	}

	public double getPuntajeLectura() {
		return puntajeLectura;
	}

	public void setPuntajeLectura(double puntajeLectura) {
		this.puntajeLectura = puntajeLectura;
	}

	public double getPuntajeCompetencias() {
		return puntajeCompetencias;
	}

	public void setPuntajeCompetencias(double puntajeCompetencias) {
		this.puntajeCompetencias = puntajeCompetencias;
	}

	public double getPuntajeIngles() {
		return puntajeIngles;
	}

	public void setPuntajeIngles(double puntajeIngles) {
		this.puntajeIngles = puntajeIngles;
	}

	public double getPuntajeFormulacion() {
		return puntajeFormulacion;
	}

	public void setPuntajeFormulacion(double puntajeFormulacion) {
		this.puntajeFormulacion = puntajeFormulacion;
	}

	public double getPuntajePensamiento() {
		return puntajePensamiento;
	}

	public void setPuntajePensamiento(double puntajePensamiento) {
		this.puntajePensamiento = puntajePensamiento;
	}

	public double getPuntajeDiseno() {
		return puntajeDiseno;
	}

	public void setPuntajeDiseno(double puntajeDiseno) {
		this.puntajeDiseno = puntajeDiseno;
	}

	public String getNivelIngles() {
		return nivelIngles;
	}

	public void setNivelIngles(String nivelIngles) {
		this.nivelIngles = nivelIngles;
	}

}
