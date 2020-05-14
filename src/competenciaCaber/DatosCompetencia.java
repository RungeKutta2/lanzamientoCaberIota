package competenciaCaber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DatosCompetencia {

	public static Competencia leerArchivo(String path) {
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
				competencia.setConcursantes(concursante);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return competencia;
	}
	
	public void escribirArchivo(String path, Competencia competencia) {
		
	}
}
