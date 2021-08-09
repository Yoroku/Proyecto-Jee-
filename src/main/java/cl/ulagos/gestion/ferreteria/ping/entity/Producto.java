package cl.ulagos.gestion.ferreteria.ping.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = "ALL_PRODUCTOS", query ="SELECT a FROM Producto a")
})
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static final String ALL_PRODUCTOS = "Productos.findAll";
	@Id
	private String iden_producto;
	private String nombre_producto;
	private int precio;
	@Enumerated(EnumType.STRING)
	private Marcas marca;
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="producto", nullable = false)
	private Set<Proveedores> proveedores = new HashSet<Proveedores>();
	
	//@ManyToMany
	//private Set<Clientes> clientes;
	
	public Producto() {}
	 
	public String getIden_producto() {
		return iden_producto;
	}
	
	public void setIden_producto(String iden_producto) {
		this.iden_producto = iden_producto;
	}
	
	public String getNombre_producto() {
		return nombre_producto;
	}
	
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public Marcas getMarca() {
		return marca;
	}
	
	public void setMarca(Marcas marca) {
		this.marca = marca;
	}
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	




}
