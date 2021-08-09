package cl.ulagos.gestion.ferreteria.ping.boundary;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ulagos.gestion.ferreteria.ping.control.CacheProducto;
import cl.ulagos.gestion.ferreteria.ping.control.IngresoProductos;
import cl.ulagos.gestion.ferreteria.ping.control.Inventario;
import cl.ulagos.gestion.ferreteria.ping.entity.Detalles;
import cl.ulagos.gestion.ferreteria.ping.entity.Marcas;
import cl.ulagos.gestion.ferreteria.ping.entity.Producto;
import cl.ulagos.gestion.ferreteria.ping.entity.ProductoCreado;
import cl.ulagos.gestion.ferreteria.ping.interceptores.MiInterceptor;

@Stateless
public class IngresarProductos {	
	
	@Inject
	IngresoProductos ingresoProductos;
	
	@Inject
	Inventario inventario;
	
	@PersistenceContext
	EntityManager entityManager;
	@Inject
	Event<ProductoCreado> productoCreado;
	
	@Inject 
	CacheProducto cacheProducto;
	
	
	@Interceptors(MiInterceptor.class)
	public Producto ingresarProductos(Detalles detalles) 
	{
		/*if (new Random().nextBoolean())
			throw new CreacionProductoException("no se puede crear un producto");*/
		
		
		Producto producto = ingresoProductos.ingresarProductos(detalles);
		inventario.store(producto);
		cacheProducto.cache(producto);
		entityManager.persist(producto);
		productoCreado.fire(new ProductoCreado(producto.getIden_producto()));;
		return producto;
	}
	
	public List<Producto> obtenerProducto(){
		
		return cacheProducto.retrieveProductos();
		
		/*List<Producto> listaProductos = entityManager.createNamedQuery("ALL_PRODUCTOS", Producto.class).getResultList();
		for(Producto li: listaProductos)
			System.out.println(li.getIden_producto());
		return listaProductos;*/
	}
	
	public void inicializar() {
		
		inventario.inicializar();
		
	}
	/*
	public List<Producto> obtenerProducto(){
	
	return inventario.cargarProductos();
	}
	*/
	public List<Producto> obtenerProducto(Marcas marca){
		
	return inventario.cargarProductos(marca);
	}
	/*
	public Producto obtenerProductos(String id_prod){
		
	return inventario.obtenerProductos(id_prod);
	}*/
}