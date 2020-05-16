package competenciaCaber;



public class Main {

	public static void main(String[] args) {
		Competencia competencia = DatosCompetencia.leerArchivo("C:\\Repo\\LanzandoElCaber\\lanzamientoCaberIota\\Lanzamientos.txt");
		competencia.calcularGanadorDistancia();
		competencia.calcularGanadorConsistencia();
		
		
		
		
	}

}
