package cl.ulagos.gestion.ferreteria.ping.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CreacionProductoExceptionMapper implements ExceptionMapper<CreacionProductoException>{

	@Override
	public Response toResponse(CreacionProductoException exception) {
		return Response.serverError()
				.header("X-automovil-error", exception.getMessage())
				.entity(exception.getMessage())
				.build();
	}
}
