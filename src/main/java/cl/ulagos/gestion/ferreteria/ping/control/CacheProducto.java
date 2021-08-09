package cl.ulagos.gestion.ferreteria.ping.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ulagos.gestion.ferreteria.ping.entity.Producto;

@Singleton
public class CacheProducto {

	private final Map<String, Producto> cache = new ConcurrentHashMap<>();
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	@PostConstruct
	private void inicializarCache() {

		rescatarProductos();
	}
	
	public void cache(Producto producto) {
		
		cache.put(producto.getIden_producto(), producto);
	}
	
	public void rescatarProductos() {
		
		List<Producto> lista = entityManager.createNamedQuery("ALL_PRODUCTOS", Producto.class).getResultList();
		lista.forEach(this::cache);
	}
	
	public List<Producto> retrieveProductos(){
		
		return new ArrayList<>(cache.values());
	}
	
}