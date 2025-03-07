package competenciaCaber;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DatosCompetencia {

	public static Competencia leerArchivo(String path) {
		Locale.setDefault(Locale.ENGLISH);
		Competencia competencia = new Competencia();
		Concursante concursante;
		Lanzamiento lanzamiento;
		try {
			Scanner scanner = new Scanner (new FileReader(path));
			int cantLanzadores = scanner.nextInt();
			for (int i = 0; i < cantLanzadores; i++) {
				concursante = new Concursante(i+1);
				for(int j = 0; j < 3; j++) {
					lanzamiento = new Lanzamiento(scanner.nextDouble(), scanner.nextDouble());
					concursante.setLanzamientos(lanzamiento);
				}
				concursante.calcularConsistencia();
				concursante.calcularDistanciaTotal();
				competencia.setConcursantes(concursante);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return competencia;
	}
	
	public static void escribirArchivo(String path, Competencia competencia) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			for (Integer ganador : competencia.getGanadoresConsistencia()) {
				writer.write(ganador + " ");	
			}
			writer.newLine();
			for (Integer ganador : competencia.getGanadoresDistancia()) {
				writer.write(ganador + " ");	
			}
			writer.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
