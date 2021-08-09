package cl.ulagos.gestion.ferreteria.ping.control;

import javax.enterprise.inject.Produces;

import cl.ulagos.gestion.ferreteria.ping.entity.Categoria;

public class CategoriaProductoDefecto {
	
	@Produces
	@Sin_definir
	public Categoria declararCategoriaDefecto()
	{
		return Categoria.Sin_definir;
	}

}
