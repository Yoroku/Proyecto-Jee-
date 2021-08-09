package cl.ulagos.gestion.ferreteria.ping.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedores.class)
public abstract class Proveedores_ {

	public static volatile SingularAttribute<Proveedores, String> direccion;
	public static volatile SingularAttribute<Proveedores, Long> id;
	public static volatile SingularAttribute<Proveedores, String> nombre_proveedor;
	public static volatile SingularAttribute<Proveedores, String> telefono;

	public static final String DIRECCION = "direccion";
	public static final String ID = "id";
	public static final String NOMBRE_PROVEEDOR = "nombre_proveedor";
	public static final String TELEFONO = "telefono";

}

