package test.competenciaCaber;



import java.io.File;

import org.junit.Assert;

import competenciaCaber.Competencia;
import competenciaCaber.DatosCompetencia;

public class Test {

	@org.junit.Test
	public void test() {
		File esperado = new File ("esperado.out");
		Competencia competencia = DatosCompetencia.leerArchivo("entrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		
	}

}
