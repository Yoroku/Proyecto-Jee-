package cl.ulagos.gestion.ferreteria.ping.boundary;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.RollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;

import cl.ulagos.gestion.ferreteria.ping.entity.Categoria;
import cl.ulagos.gestion.ferreteria.ping.entity.Detalles;
import cl.ulagos.gestion.ferreteria.ping.entity.Marcas;

@Named("masProductos")
@SessionScoped
public class AgregarProductoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IngresarProductos ingresarProductos;
	
	private String idEnProducto;
	private String nombreProducto;
	private int precio;
	private String marca;
	private String categoria;
	
	public AgregarProductoBean()
	{
		
	}
	
	public String crearProducto() throws SecurityException, IllegalStateException, NotSupportedException, SystemException, RollbackException, IOException 
	{
		Detalles detalles = new Detalles(String.valueOf(this.nombreProducto),Integer.valueOf(this.precio), Marcas.valueOf(this.marca), Categoria.valueOf(this.categoria));
		ingresarProductos.ingresarProductos(detalles);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto Creado"));
		FacesContext.getCurrentInstance().getExternalContext().redirect("productos.xhtml");
		return "Producto Creado";
	}

	public String getIdEnProducto() {
		return idEnProducto;
	}

	public void setIdEnProducto(String idEnProducto) {
		this.idEnProducto = idEnProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
