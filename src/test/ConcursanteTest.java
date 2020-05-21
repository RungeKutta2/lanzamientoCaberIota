package test;

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
	public void testCalcularConsistenciaIdeal() {
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50, 10.0);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.50, 10.0);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.50, 10.0);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularConsistencia();
		Assert.assertEquals(0, concursante.getConsistencia(), 0);
	}

	@Test
	public void testCalcularConsistenciaJugadorValido() {
		double consistenciaCorrecta = 2.1249;
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50, 10.0);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.40, 15.0);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.80, 20.0);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularConsistencia();

		Assert.assertEquals(consistenciaCorrecta, concursante.getConsistencia(), 0.0001);
	}

	@Test
	public void testCalcularConsistenciaJugadorInvalido() {
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50, 100.56);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.51, 35.45);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.52, 89.59);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularConsistencia();
		Assert.assertEquals(LANZAMIENTO_INVALIDO, concursante.getConsistencia(), 0);

	}

	@Test
	public void testCalcularDistanciaTotal() {
		Double distanciaTotalCorrecta = 1.50 + 1.51 * 0.8;
		Concursante concursante = new Concursante(1);
		Lanzamiento lanzamiento1 = new Lanzamiento(1.50, 10.0);
		concursante.setLanzamientos(lanzamiento1);
		Lanzamiento lanzamiento2 = new Lanzamiento(1.51, 35.0);
		concursante.setLanzamientos(lanzamiento2);
		Lanzamiento lanzamiento3 = new Lanzamiento(1.52, -102.0);
		concursante.setLanzamientos(lanzamiento3);
		concursante.calcularDistanciaTotal();

		Assert.assertEquals(distanciaTotalCorrecta, concursante.getDistanciaTotal(), 0);
	}

	@Test
	public void testPriorizarConsistenciaDistancia() {
		Concursante concursanteUno = new Concursante(1);
		Lanzamiento lanzamiento1ConcursanteUno = new Lanzamiento(1.0, 2.0);
		concursanteUno.setLanzamientos(lanzamiento1ConcursanteUno);
		Lanzamiento lanzamiento2ConcursanteUno = new Lanzamiento(1.0, 2.0);
		concursanteUno.setLanzamientos(lanzamiento2ConcursanteUno);
		Lanzamiento lanzamiento3ConcursanteUno = new Lanzamiento(1.0, 2.0);
		concursanteUno.setLanzamientos(lanzamiento3ConcursanteUno);
		double consistenciaConcursanteUno = concursanteUno.getConsistencia();

		Concursante concursanteDos = new Concursante(1);
		Lanzamiento lanzamiento1ConcursanteDos = new Lanzamiento(2.0, 1.0);
		concursanteDos.setLanzamientos(lanzamiento1ConcursanteDos);
		Lanzamiento lanzamiento2ConcursanteDos = new Lanzamiento(2.0, 1.0);
		concursanteDos.setLanzamientos(lanzamiento2ConcursanteDos);
		Lanzamiento lanzamiento3ConcursanteDos = new Lanzamiento(2.0, 1.0);
		concursanteDos.setLanzamientos(lanzamiento3ConcursanteDos);
		double consistenciaConcursanteDos = concursanteDos.getConsistencia();

		double mejorConsistencia = Math.min(consistenciaConcursanteUno, consistenciaConcursanteDos);

		Assert.assertEquals(consistenciaConcursanteDos, mejorConsistencia, 0);

	}

}
