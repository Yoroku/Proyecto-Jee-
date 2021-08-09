package cl.ulagos.gestion.ferreteria.ping.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, Integer> rut;
	public static volatile SingularAttribute<Usuario, String> apellidos;
	public static volatile SingularAttribute<Usuario, Cargo> cargo;
	public static volatile SingularAttribute<Usuario, Rol> rol;
	public static volatile SingularAttribute<Usuario, String> nombres;

	public static final String RUT = "rut";
	public static final String APELLIDOS = "apellidos";
	public static final String CARGO = "cargo";
	public static final String ROL = "rol";
	public static final String NOMBRES = "nombres";

}

