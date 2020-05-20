package test.competenciaCaber;

import org.junit.Assert;
import org.junit.Test;

import competenciaCaber.Concursante;
import competenciaCaber.Lanzamiento;


public class ConcursanteTest {

	@Test
	public void testSeSeteaBienElConcursante() {
		Concursante concursante = new Concursante(1);
		Assert.assertEquals(1, concursante.getNumeroDeConcursante());
	}
	
	@Test
	public void testCalcularConsistencia() {
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50,10.0);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.51,11.0);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.52,12.0);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularConsistencia();
		
		
		Assert.assertEquals(0, concursante.getConsistencia(),0.5);
	}
	
	
	

}
