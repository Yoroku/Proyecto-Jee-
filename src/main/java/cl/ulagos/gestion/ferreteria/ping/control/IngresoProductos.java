package cl.ulagos.gestion.ferreteria.ping.control;

import java.util.UUID;

import javax.inject.Inject;

import cl.ulagos.gestion.ferreteria.ping.entity.Categoria;
import cl.ulagos.gestion.ferreteria.ping.entity.Detalles;
import cl.ulagos.gestion.ferreteria.ping.entity.Producto;
import cl.ulagos.gestion.ferreteria.ping.entity.Marcas;

public class IngresoProductos {
	
	@Inject
	@otra_marca
	Marcas declararMarcaDefecto; 
	
	@Inject
	@Sin_definir
	Categoria declararCategoriaDefecto; 
	
	@Inject
	@Config("prefijo.id")
	String prefijoID;
	
	public Producto ingresarProductos(Detalles detalles) {
		
		Producto producto = new Producto();
		producto.setIden_producto(prefijoID +"-"+ UUID.randomUUID().toString());
		producto.setNombre_producto(detalles.getNombre_producto());
		producto.setCategoria(detalles.getCategoria()== null ? declararCategoriaDefecto: detalles.getCategoria());
		producto.setMarca(detalles.getMarca()== null ? declararMarcaDefecto: detalles.getMarca());
		producto.setPrecio(detalles.getPrecio());
		
		return producto;
		}

}
