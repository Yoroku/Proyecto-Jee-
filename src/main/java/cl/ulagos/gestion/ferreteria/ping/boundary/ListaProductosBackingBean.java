package cl.ulagos.gestion.ferreteria.ping.boundary;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cl.ulagos.gestion.ferreteria.ping.entity.Producto;

/**
 * @author miguel
 *
 */
@Named("dtProducto")
@ViewScoped
public class ListaProductosBackingBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Producto> producto;
	private Producto productoSeleccionado;
	
	@Inject
	private IngresarProductos ingresarProductos;
	
	@PostConstruct
    public void init() {
        producto = ingresarProductos.obtenerProducto();
    }
	
	public void setProductoSeleccionado(Producto productoSeleccionado)
	{
		this.productoSeleccionado = productoSeleccionado;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public IngresarProductos getIngresarProductos() {
		return ingresarProductos;
	}

	public void setIngresarProductos(IngresarProductos ingresarProductos) {
		this.ingresarProductos = ingresarProductos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Producto getProductoSeleccionado() {
		return productoSeleccionado;
	}
}
	