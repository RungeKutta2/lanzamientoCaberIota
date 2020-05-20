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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/ArchivoConsignaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/ArchivoConsignaObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/ArchivoConsignaEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/ArchivoConsignaObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/SinGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/SinGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/SinGanadoresEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/SinGanadoresObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/SinGanadoresConsistenciaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/SinGanadoresConsistenciaObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/SinGanadoresConsistenciaEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/SinGanadoresConsistenciaObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/MismaDistanciaDistintoAnguloEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/MismaDistanciaDistintoAnguloObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/MismaDistanciaDistintoAnguloEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/MismaDistanciaDistintoAnguloObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/AngulosMuyCercanosEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/AngulosMuyCercanosObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/AngulosMuyCercanosEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/AngulosMuyCercanosObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/SoloTresGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/SoloTresGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/SoloTresGanadoresEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/SoloTresGanadoresObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./testCompetencia/UnMillonDeConcursantesEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./testCompetencia/UnMillonDeConcursantesObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./testCompetencia/UnMillonDeConcursantesEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./testCompetencia/UnMillonDeConcursantesObtenido.out"));
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
