package test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import competenciaCaber.Competencia;
import competenciaCaber.DatosCompetencia;

public class Test {

	@org.junit.Test
	public void test() {
		
		Competencia competencia = DatosCompetencia.leerArchivo("Lanzamientos.txt");
		List<Integer> ganadoresDistancia = new ArrayList<Integer>();
		ganadoresDistancia.add(2);
		ganadoresDistancia.add(1);
		ganadoresDistancia.add(3);
		Assert.assertEquals(ganadoresDistancia, competencia.calcularGanadorDistancia());
	}

}
