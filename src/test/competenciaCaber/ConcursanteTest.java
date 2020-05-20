package test.competenciaCaber;

import org.junit.Assert;
import org.junit.Test;

import competenciaCaber.Concursante;
import competenciaCaber.Lanzamiento;


public class ConcursanteTest {
	private final static int LANZAMIENTO_INVALIDO = -2;
	@Test
	public void testSeSeteaBienElConcursante() {
		Concursante concursante = new Concursante(1);
		Assert.assertEquals(1, concursante.getNumeroDeConcursante());
	}
	
	@Test
	public void testCalcularConsistenciaJugadorValido() {
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
	
	@Test
	public void testCalcularConsistenciaJugadorInvalido() {
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50,100.56);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.51,35.45);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.52,89.59);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularConsistencia();
		Assert.assertEquals(LANZAMIENTO_INVALIDO, concursante.getConsistencia(),0);
		
	}
	
	@Test
	public void testCalcularDistanciaTotal() {
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50,10.0);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.51,35.0);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.52,-102.0);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularDistanciaTotal();
		
		Assert.assertEquals(2.708, concursante.getDistanciaTotal(),0);
	}
	
	@Test
	public void testPriorizarConsistenciaDistancia() {
		Concursante concursanteUno = new Concursante(1);
		Lanzamiento lanzamiento1ConcursanteUno = new Lanzamiento(1.50,10.0);
		concursanteUno.setLanzamientos(lanzamiento1ConcursanteUno);
		Lanzamiento lanzamiento2ConcursanteUno = new Lanzamiento(1.51,11.0);
		concursanteUno.setLanzamientos(lanzamiento2ConcursanteUno);
		Lanzamiento lanzamiento3ConcursanteUno = new Lanzamiento(1.52,10.0);
		concursanteUno.setLanzamientos(lanzamiento3ConcursanteUno);
		double consistenciaConcursanteUno = concursanteUno.getConsistencia(); 
		
		Concursante concursanteDos = new Concursante(1);
		Lanzamiento lanzamiento1ConcursanteDos = new Lanzamiento(1.51,10.5);
		concursanteDos.setLanzamientos(lanzamiento1ConcursanteDos);
		Lanzamiento lanzamiento2ConcursanteDos = new Lanzamiento(1.50,11.5);
		concursanteDos.setLanzamientos(lanzamiento2ConcursanteDos);
		Lanzamiento lanzamiento3ConcursanteDos = new Lanzamiento(1.50,12.0);
		concursanteDos.setLanzamientos(lanzamiento3ConcursanteDos);
		double consistenciaConcursanteDos = concursanteDos.getConsistencia(); 
		
		double mejorConsistencia = Math.min(consistenciaConcursanteUno,consistenciaConcursanteDos);
		
		Assert.assertEquals(consistenciaConcursanteDos, mejorConsistencia,0);

	}

}
