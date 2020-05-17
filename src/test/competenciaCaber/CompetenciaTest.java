package test.competenciaCaber;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import competenciaCaber.Competencia;
import competenciaCaber.DatosCompetencia;

class CompetenciaTest {

	@Before
	void setUp() throws Exception {
	}

	@Test
	public void test() {
//		final File esperado = new File("esperado.out");
//		Competencia competencia = DatosCompetencia.leerArchivo("entrada.in");
//		competencia.calcularGanadorConsistencia();
//		competencia.calcularGanadorDistancia();
//		DatosCompetencia.escribirArchivo("obtenido.out", competencia);
//		
		File esperado = new File ("esperado.out");
		Competencia competencia = DatosCompetencia.leerArchivo("entrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("obtenido.out", competencia);
		Assert.assertEquals(esperado, "obtenido.out");
	}
//	
//	final File expected = new File("xyz.txt"); 
//    final File output = folder.newFile("xyz.txt"); 
//    TestClass.xyz(output); 
//    Assert.assertEquals(FileUtils.readLines(expected), FileUtils.readLines(output));
	

}
