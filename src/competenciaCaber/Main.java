package competenciaCaber;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Competencia competencia = DatosCompetencia.leerArchivo("Lanzamientos.txt");
		competencia.calcularGanadorDistancia();
	}

}
