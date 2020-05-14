package competenciaCaber;



public class Main {

	public static void main(String[] args) {
		Competencia competencia = DatosCompetencia.leerArchivo("Lanzamientos.txt");
		competencia.calcularGanadorDistancia();
	}

}
