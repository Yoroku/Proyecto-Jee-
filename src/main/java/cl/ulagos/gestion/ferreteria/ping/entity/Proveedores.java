package cl.ulagos.gestion.ferreteria.ping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedores {
	
	@Id
	private long id;
	private String nombre_proveedor;
	private String direccion;
	private String telefono;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
