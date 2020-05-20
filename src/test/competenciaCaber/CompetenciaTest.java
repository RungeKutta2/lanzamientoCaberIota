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
		Competencia competencia = DatosCompetencia.leerArchivo("./Archivos/ArchivoConsignaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./Archivos/ArchivoConsignaObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./Archivos/ArchivoConsignaEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./Archivos/ArchivoConsignaObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./Archivos/SinGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./Archivos/SinGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./Archivos/SinGanadoresEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./Archivos/SinGanadoresObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./Archivos/SinGanadoresConsistenciaEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./Archivos/SinGanadoresConsistenciaObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./Archivos/SinGanadoresConsistenciaEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./Archivos/SinGanadoresConsistenciaObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./Archivos/MismaDistanciaDistintoAnguloEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./Archivos/MismaDistanciaDistintoAnguloObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./Archivos/MismaDistanciaDistintoAnguloEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./Archivos/MismaDistanciaDistintoAnguloObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./Archivos/AngulosMuyCercanosEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./Archivos/AngulosMuyCercanosObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./Archivos/AngulosMuyCercanosEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./Archivos/AngulosMuyCercanosObtenido.out"));
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
		Competencia competencia = DatosCompetencia.leerArchivo("./Archivos/SoloTresGanadoresEntrada.in");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		DatosCompetencia.escribirArchivo("./Archivos/SoloTresGanadoresObtenido.out", competencia);
		Scanner scannerEsperado = null;
		Scanner scannerObtenido = null;
		try {
			scannerEsperado = new Scanner(new FileReader("./Archivos/SoloTresGanadoresEsperado.out"));
			scannerObtenido = new Scanner(new FileReader("./Archivos/SoloTresGanadoresObtenido.out"));
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
