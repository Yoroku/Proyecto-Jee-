package cl.ulagos.gestion.ferreteria.ping.control;

import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

import java.util.stream.Collectors;

import cl.ulagos.gestion.ferreteria.ping.entity.Producto;
import cl.ulagos.gestion.ferreteria.ping.entity.Marcas;
import cl.ulagos.gestion.ferreteria.ping.entity.Categoria;


public class Inventario {
	
	List<Producto> listaProductos = new ArrayList<Producto>();
	
	public void store(Producto producto)
	{
		//store
		listaProductos.add(producto);
	}
	
	public Producto obtenerProductos(String id_prod)
	{
		for (Producto producto :listaProductos)
		{
			if(producto.getIden_producto().equals(id_prod))
			{
				return producto;
			}
		}
		return null;
		
	}
	
	public List<Producto> cargarProductos(){
		return listaProductos;
	}
	
	public List<Producto> cargarProductos(Marcas marcas){
		return listaProductos.stream().filter(productos->productos.getMarca().equals(marcas)).collect(Collectors.toList());
	}
	

	public void inicializar() {
		
		Producto producto = new Producto();
		producto.setIden_producto(UUID.randomUUID().toString());
		producto.setNombre_producto("Destornillador Electrico");
		producto.setMarca(Marcas.Makita);
		producto.setCategoria(Categoria.Herramientas_electricas);
		producto.setPrecio(25000);
		listaProductos.add(producto);
		
	}
	

}
