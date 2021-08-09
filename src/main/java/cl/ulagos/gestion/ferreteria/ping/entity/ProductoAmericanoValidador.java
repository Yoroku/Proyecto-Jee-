package cl.ulagos.gestion.ferreteria.ping.entity;

import javax.validation.ConstraintValidatorContext; 
import javax.validation.ConstraintValidator;

public class ProductoAmericanoValidador implements ConstraintValidator<ProductoAmericano, Marcas>{

	public void initialize(ProductoAmericanoValidador constraint) {
		
	}
	
	public boolean isValid(Marcas marca, ConstraintValidatorContext context)
	{	
		if(marca == Marcas.DeWALT)
		{
			return marca == Marcas.DeWALT;
		}
		else if(marca == Marcas.Makita)
		{
			return marca == Marcas.Makita ;
		}
		else
		{
		    return marca == Marcas.Milwaukee; 
		}
	}

}
