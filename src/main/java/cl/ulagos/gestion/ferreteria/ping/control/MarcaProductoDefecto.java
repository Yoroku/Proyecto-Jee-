package cl.ulagos.gestion.ferreteria.ping.control;
import javax.enterprise.inject.Produces;

import cl.ulagos.gestion.ferreteria.ping.entity.Marcas;

public class MarcaProductoDefecto {
	
	@Produces
	@otra_marca
	public Marcas declararMarcaDefecto()
	{
		return Marcas.otra_marca;
	}

}
