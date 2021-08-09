package cl.ulagos.gestion.ferreteria.ping.boundary;

import java.net.URI;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.stream.JsonCollectors;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import com.sun.istack.NotNull;

import cl.ulagos.gestion.ferreteria.ping.entity.Detalles;
import cl.ulagos.gestion.ferreteria.ping.entity.Marcas;
import cl.ulagos.gestion.ferreteria.ping.entity.Producto;
import jakarta.validation.Valid;

@Path("productos")
public class RecursosProductos{	
	
	@Inject
	IngresarProductos ingresarProductos;

	@Context
	UriInfo uriInfo;
	
	@GET
	public JsonArray obtenerProductoMarca(@NotNull @QueryParam ("filter") Marcas marca){
		
		return ingresarProductos.obtenerProducto(marca)
		.stream()
		.map(c->Json.createObjectBuilder()
			.add("ID", c.getIden_producto())
			.add("Nombre Producto", c.getNombre_producto())
			.add("Categoria",c.getCategoria().name())
			.add("Marca", c.getMarca().name())
			.add("Precio", c.getPrecio())
			.build())
		.collect(JsonCollectors.toJsonArray());
				
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearProducto(@Valid @NotNull Detalles detalles)
	{
		Producto producto = ingresarProductos.ingresarProductos(detalles);
		
		URI uri = uriInfo.getBaseUriBuilder()
				.path(RecursosProductos.class)
				.path(RecursosProductos.class, "obtenerProducto")
				.build(producto.getIden_producto());
		
		return Response.created(uri).build();
		
	}
	

	/*@GET
	@Path("{iden_producto}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Producto obtenerProducto(@PathParam("iden_producto") String id_prod)
	{
		return ingresarProductos.obtenerProductos(id_prod);
	}*/
	
	
}