package test;

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
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/ArchivoConsignaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/ArchivoConsignaObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/ArchivoConsignaEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/ArchivoConsignaObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}

	@Test
	public void testSinGanadores() {
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/SinGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/SinGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/SinGanadoresEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/SinGanadoresObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}

	@Test
	public void testSinGanadoresConsistencia() {
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/SinGanadoresConsistenciaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/SinGanadoresConsistenciaObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/SinGanadoresConsistenciaEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/SinGanadoresConsistenciaObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}

	@Test
	public void testMismaDistanciaDistintoAngulo() {
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/MismaDistanciaDistintoAnguloEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/MismaDistanciaDistintoAnguloObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/MismaDistanciaDistintoAnguloEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/MismaDistanciaDistintoAnguloObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}
		} catch (FileNotFoundException e) {

			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}

	@Test
	public void testAngulosMuyCercanos() {
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/AngulosMuyCercanosEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/AngulosMuyCercanosObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/AngulosMuyCercanosEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/AngulosMuyCercanosObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {
				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}
	
	@Test
	public void testSoloTresGanadores() {
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/SoloTresGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/SoloTresGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/SoloTresGanadoresEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/SoloTresGanadoresObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {

				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}

	@Test
	public void testUnMillonDeConcursantes() {
		Competencia competencia = DatosCompetencia.leerArchivo("./archivosTest/UnMillonDeConcursantesEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./archivosTest/UnMillonDeConcursantesObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./archivosTest/UnMillonDeConcursantesEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./archivosTest/UnMillonDeConcursantesObtenido.out"));
			while (scannerEsperado.hasNext() || scannerObtenido.hasNext()) {

				Assert.assertEquals(scannerEsperado.nextInt(), scannerObtenido.nextInt());
			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (scannerEsperado != null) {
				scannerEsperado.close();
			}
			if (scannerObtenido != null) {
				scannerObtenido.close();
			}
		}
	}
	

}
