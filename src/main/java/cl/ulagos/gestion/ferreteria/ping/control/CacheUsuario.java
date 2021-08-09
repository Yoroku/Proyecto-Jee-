package cl.ulagos.gestion.ferreteria.ping.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ulagos.gestion.ferreteria.ping.entity.Usuario;

public class CacheUsuario {

	private final Map<String, Usuario> cache = new ConcurrentHashMap<>();
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	@PostConstruct
	private void inicializarCacheUser() {

		rescatarUsuarios();
	}
	
	public void cache(Usuario usuario) {
		
		cache.put(String.valueOf(usuario.getRut()), usuario);
	}
	
	public void rescatarUsuarios() {
		
		List<Usuario> lista = entityManager.createNamedQuery("ALL_USUARIO", Usuario.class).getResultList();
		lista.forEach(this::cache);
	}
	
	public List<Usuario> retrieveUsuarios(){
		
		return new ArrayList<>(cache.values());
	}
	
}