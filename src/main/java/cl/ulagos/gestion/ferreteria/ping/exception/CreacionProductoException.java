package cl.ulagos.gestion.ferreteria.ping.exception;

import javax.ejb.ApplicationException;

@ApplicationException
public class CreacionProductoException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CreacionProductoException(String mensaje) {
		
		super(mensaje);
	}
}
