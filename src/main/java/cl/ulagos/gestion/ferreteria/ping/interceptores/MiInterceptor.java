package cl.ulagos.gestion.ferreteria.ping.interceptores;


import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import cl.ulagos.gestion.ferreteria.ping.entity.Detalles;


@Interceptor
public class MiInterceptor {

	@AroundInvoke
	public Object funcionArIn(InvocationContext context) throws Exception {
		
		Object [] lista = context.getParameters();
		for (Object objeto : lista) {
			
			if (objeto instanceof Detalles)
			{
				Detalles detalles = (Detalles) objeto;
				System.out.println("Marca: " + detalles.getMarca());
			}
			
		}
		return context.proceed();
	}
	
}
