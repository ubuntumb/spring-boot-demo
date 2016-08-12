package uca.edu.py.prueba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 7044042836218961861L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "per_codigo")
	private int id;

	@Column(name = "per_apellido")
	private String apellido;

	@Column(name = "per_nombre")
	private String nombre;

	@Column(name = "per_cedula")
	private String cedula;

	@Column(name = "per_sexo")
	private int sexo;

	public Persona() {
	}

	public Persona(int id, String apellido, String nombre, String cedula,
			int sexo, Date fec_naciemiento) {
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.cedula = cedula;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
}
