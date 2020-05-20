package test;

import org.junit.Assert;
import org.junit.Test;

import competenciaCaber.Lanzamiento;

public class LanzamientoTest {

	@Test
	public void testSeSeteaBienElLanzamiento() {
			Lanzamiento lanzamiento = new Lanzamiento(1.5,-3.0);
			Assert.assertEquals(1.5, lanzamiento.getDistancia(),0);
			Assert.assertEquals(-3.0, lanzamiento.getAngulo(),0);		
	}
	
	@Test
	public void testLanzamientoValido() {
			Lanzamiento lanzamiento = new Lanzamiento(1.5,-3.0);
			Assert.assertTrue(lanzamiento.verificarLanzamiento());		
	}
	
	@Test
	public void testLanzamientoInvalido() {
			Lanzamiento lanzamiento = new Lanzamiento(1.5,-93.0);
			Assert.assertFalse(lanzamiento.verificarLanzamiento());		
	}
	
	@Test
	public void testLanzamientoDistanciaTotalCompleta() {
			Lanzamiento lanzamiento = new Lanzamiento(1.5,3.0);
			Assert.assertEquals(1.5, lanzamiento.calcularDistanciaFinal(),0);		
	}
	
	@Test
	public void testLanzamientoDistanciaTotalOchentaPorciento() {
			Lanzamiento lanzamiento = new Lanzamiento(1.5,32.0);
			Assert.assertEquals(1.5*0.8, lanzamiento.calcularDistanciaFinal(),0);		
	}
	
	

}
