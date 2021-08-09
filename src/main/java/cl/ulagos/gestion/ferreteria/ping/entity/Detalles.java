package cl.ulagos.gestion.ferreteria.ping.entity;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

import com.sun.istack.NotNull;

public class Detalles {
	
	@NotNull
	private final String nombre_producto;
	@NotNull
	private final int precio;
	
	@NotNull
	@ProductoAmericano
	private final Marcas marca;
	
	@NotNull
	private final Categoria categoria;
	
	@JsonbCreator
	public Detalles(@JsonbProperty("nombre_producto")String nombre_producto, @JsonbProperty("precio")int precio, @JsonbProperty("marca") Marcas marca,  @JsonbProperty("categoria")Categoria categoria) 
	{
		this.nombre_producto = nombre_producto;
		this.marca = marca;
		this.precio = precio;
		this.categoria = categoria;
	}
	

	public String getNombre_producto() {
		return nombre_producto;
	}

	public int getPrecio() {
		return precio;
	}

	public Marcas getMarca() {
		return marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}