package cl.ulagos.gestion.ferreteria.ping.control;

import javax.enterprise.event.Observes;
import cl.ulagos.gestion.ferreteria.ping.entity.ProductoCreado;


public class ProductoCreadoListener {
	
	public void onProductoCreadoListener(@Observes ProductoCreado productoCreado) {
		
		System.out.println("Id Producto: " + productoCreado.getIden_producto());
	}
	

}
