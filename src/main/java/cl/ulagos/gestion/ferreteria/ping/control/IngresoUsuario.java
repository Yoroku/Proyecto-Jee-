package cl.ulagos.gestion.ferreteria.ping.control;

import cl.ulagos.gestion.ferreteria.ping.entity.Usuario;

public class IngresoUsuario {
	
	public Usuario ingresarUsuario() {
		
		Usuario usuario = new Usuario();
		usuario.setRut(usuario.getRut());
		usuario.setNombres(usuario.getNombres());
		usuario.setApellidos(usuario.getApellidos());
		usuario.setRol(usuario.getRol());
		usuario.setCargo(usuario.getCargo());

		return usuario;
		}
}
