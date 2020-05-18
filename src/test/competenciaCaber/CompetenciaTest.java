package test.competenciaCaber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import competenciaCaber.Competencia;
import competenciaCaber.DatosCompetencia;

public class CompetenciaTest {

	@Test
	public void testArchivoConsigna() {
		Competencia competencia = DatosCompetencia.leerArchivo("ArchivoConsignaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("ArchivoConsignaObtenido.out", competencia);
		Scanner scannerEsperado = null, scannerObtenido = null;
		try {
			scannerEsperado = new Scanner (new FileReader("ArchivoConsignaEsperado.out"));
			scannerObtenido = new Scanner (new FileReader("ArchivoConsignaObtenido.out"));
			while(scannerEsperado.hasNext() && scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());				
			}
			scannerEsperado.close();
			scannerObtenido.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSinGanadores() {
		Competencia competencia = DatosCompetencia.leerArchivo("SinGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("SinGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null, scannerObtenido = null;
		try {
			scannerEsperado = new Scanner (new FileReader("SinGanadoresEsperado.out"));
			scannerObtenido = new Scanner (new FileReader("SinGanadoresObtenido.out"));
			while(scannerEsperado.hasNext() || scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());				
			}
			
			scannerEsperado.close();
			scannerObtenido.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	@Test
	public void testSinGanadoresConsistencia() {
		Competencia competencia = DatosCompetencia.leerArchivo("SinGanadoresConsistenciaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("SinGanadoresConsistenciaObtenido.out", competencia);
		Scanner scannerEsperado = null, scannerObtenido = null;
		try {
			scannerEsperado = new Scanner (new FileReader("SinGanadoresConsistenciaEsperado.out"));
			scannerObtenido = new Scanner (new FileReader("SinGanadoresConsistenciaObtenido.out"));
			while(scannerEsperado.hasNext() && scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());				
			}
			scannerEsperado.close();
			scannerObtenido.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMismaDistanciaDistintoAngulo() {
		Competencia competencia = DatosCompetencia.leerArchivo("MismaDistanciaDistintoAnguloEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("MismaDistanciaDistintoAnguloObtenido.out", competencia);
		Scanner scannerEsperado = null, scannerObtenido = null;
		try {
			scannerEsperado = new Scanner (new FileReader("MismaDistanciaDistintoAnguloEsperado.out"));
			scannerObtenido = new Scanner (new FileReader("MismaDistanciaDistintoAnguloObtenido.out"));
			while(scannerEsperado.hasNext() && scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());				
			}
			scannerEsperado.close();
			scannerObtenido.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAngulosMuyCercanos() {
		Competencia competencia = DatosCompetencia.leerArchivo("AngulosMuyCercanosEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("AngulosMuyCercanosObtenido.out", competencia);
		Scanner scannerEsperado = null, scannerObtenido = null;
		try {
			scannerEsperado = new Scanner (new FileReader("AngulosMuyCercanosEsperado.out"));
			scannerObtenido = new Scanner (new FileReader("AngulosMuyCercanosObtenido.out"));
			while(scannerEsperado.hasNext() && scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());				
			}
			scannerEsperado.close();
			scannerObtenido.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
