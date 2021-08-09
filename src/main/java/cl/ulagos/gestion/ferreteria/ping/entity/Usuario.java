package cl.ulagos.gestion.ferreteria.ping.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "ALL_USERS", query ="SELECT a FROM Usuario a")
})
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static final String ALL_USERS = "Usuario.findAll";
	@Id
	private int rut;
	private String nombres;
	private String apellidos;
	@Enumerated(EnumType.STRING)
	private Rol rol;
	@Enumerated(EnumType.STRING)
	private Cargo cargo;
	
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
