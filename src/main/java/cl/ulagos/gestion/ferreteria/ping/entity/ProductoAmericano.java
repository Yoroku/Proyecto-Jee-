package cl.ulagos.gestion.ferreteria.ping.entity;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

import javax.validation.Constraint;
import javax.validation.Payload;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE,ElementType.PARAMETER})
@Constraint(validatedBy = ProductoAmericanoValidador.class)
@Documented
public @interface ProductoAmericano {

		String message() default "";
		
		Class<?>[] groups() default {};
		
		Class<? extends Payload>[] payload() default {};
}
