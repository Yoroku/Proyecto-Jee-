package cl.ulagos.gestion.ferreteria.ping.boundary;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import cl.ulagos.gestion.ferreteria.ping.entity.Usuario;

public class ListaUsuarioBackingBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Usuario> usuario;
	private Usuario usuarioSeleccionado;
	
	@Inject
	private IngresarUsuario ingresarUsuario;
	
	@PostConstruct
    public void init() {
        usuario = ingresarUsuario.obtenerUsuario();
    }

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}

	public IngresarUsuario getIngresarUsuario() {
		return ingresarUsuario;
	}

	public void setIngresarUsuario(IngresarUsuario ingresarUsuario) {
		this.ingresarUsuario = ingresarUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
