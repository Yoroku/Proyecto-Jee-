package cl.ulagos.gestion.ferreteria.ping.boundary;

import java.util.List;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cl.ulagos.gestion.ferreteria.ping.control.CacheUsuario;
import cl.ulagos.gestion.ferreteria.ping.control.IngresoUsuario;
import cl.ulagos.gestion.ferreteria.ping.entity.Usuario;
import cl.ulagos.gestion.ferreteria.ping.entity.UsuarioCreado;


public class IngresarUsuario {

	@Inject
	IngresoUsuario ingresoUsuario;
	
	@PersistenceContext
	EntityManager entityManager;
	@Inject
	Event<UsuarioCreado> usuarioCreado;
	
	@Inject 
	CacheUsuario cacheUsuario;
	
	
	public Usuario ingresarUsuarios() 
	{
	
		Usuario usuario = ingresoUsuario.ingresarUsuario();
		cacheUsuario.cache(usuario);
		entityManager.persist(usuario);
		usuarioCreado.fire(new UsuarioCreado(usuario.getRut()));;
		return usuario;
	}
	
	public List<Usuario> obtenerUsuario(){
		
		return cacheUsuario.retrieveUsuarios();
	}
}
