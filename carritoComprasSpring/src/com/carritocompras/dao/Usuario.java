package com.carritocompras.dao;

public class Usuario {
	public String nombre;
	public String apaterno;
	public String amaterno;
	public String correo;
	public String pass;

	/**
	 * Constructor para la clase usuario;
	 */
	public Usuario() {
	}

	/**
	 * Constructor para la clase usuario pásando los parámetros.
	 * 
	 * @param nombre
	 * @param apaterno
	 * @param amaterno
	 * @param correo
	 * @param pass
	 */
	public Usuario(String nombre, String apaterno, String amaterno,
			String correo, String pass) {
		// this.id_usuario= id_usuario;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.correo = correo;
		this.pass = pass;
	}


	// Métodos get y set para los atributos de la clase usuario:
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getApaterno() {
		return this.apaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public String getAmaterno() {
		return this.amaterno;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass() {
		return this.pass;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apaterno=" + apaterno
				+ ", amaterno=" + amaterno + ", correo=" + correo + ", pass="
				+ pass + "]";
	}
}
