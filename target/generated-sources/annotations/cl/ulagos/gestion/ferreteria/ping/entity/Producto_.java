package cl.ulagos.gestion.ferreteria.ping.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, Marcas> marca;
	public static volatile SetAttribute<Producto, Proveedores> proveedores;
	public static volatile SingularAttribute<Producto, Integer> precio;
	public static volatile SingularAttribute<Producto, String> iden_producto;
	public static volatile SingularAttribute<Producto, Categoria> categoria;
	public static volatile SingularAttribute<Producto, String> nombre_producto;

	public static final String MARCA = "marca";
	public static final String PROVEEDORES = "proveedores";
	public static final String PRECIO = "precio";
	public static final String IDEN_PRODUCTO = "iden_producto";
	public static final String CATEGORIA = "categoria";
	public static final String NOMBRE_PRODUCTO = "nombre_producto";

}

