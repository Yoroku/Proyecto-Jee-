package cl.ulagos.gestion.ferreteria.ping.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class PersistirProductoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PersistirProductoException(String mensaje) {
		
		super(mensaje);
		
	}
}
