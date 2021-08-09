package cl.ulagos.gestion.ferreteria.ping.exception;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ViolacionConstraintExceptionMapper implements ExceptionMapper<ConstraintViolationException>{

	@Override
	public Response toResponse(ConstraintViolationException exception) {
				return Response.status(Response.Status.BAD_REQUEST)
						.header("X-Validacion-error", exception.getMessage())
						.entity(exception.getMessage())
						.build();
	}
}
