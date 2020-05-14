package competenciaCaber;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Competencia competencia = DatosCompetencia.leerArchivo("Lanzamientos.txt");
		ArrayList<Concursante> concursantes = competencia.getConcursantes();
		for(Concursante concursante : concursantes) {
			ArrayList<Lanzamiento> lanzamientos = concursante.getLanzamientos();
			for(Lanzamiento lanzamiento : lanzamientos) {
				
			}
		}
	}

}
