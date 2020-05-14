package competenciaCaber;

import java.util.ArrayList;

public class Competencia {
	private ArrayList<Integer> ganadoresDistancia;
	private ArrayList<Integer> ganadoresConsistencia;
	private ArrayList<Concursante> concursantes;

	public Competencia() {
		ganadoresDistancia = new ArrayList<Integer>();
		ganadoresConsistencia = new ArrayList<Integer>();
		concursantes = new ArrayList<Concursante>();
	}
	
	public ArrayList<Integer> calcularGanadorDistancia() {
		return null;
		
	}
	
	public ArrayList<Integer> calcularGanadorConsistencia() {
		return null;
		
	}

	public ArrayList<Concursante> getConcursantes() {
		return concursantes;
	}

	public void setConcursantes(Concursante concursante) {
		this.concursantes.add(concursante);
	}

	public ArrayList<Integer> getGanadoresDistancia() {
		return ganadoresDistancia;
	}

	public void setGanadoresDistancia(ArrayList<Integer> ganadoresDistancia) {
		this.ganadoresDistancia = ganadoresDistancia;
	}

	public ArrayList<Integer> getGanadoresConsistencia() {
		return ganadoresConsistencia;
	}

	public void setGanadoresConsistencia(ArrayList<Integer> ganadoresConsistencia) {
		this.ganadoresConsistencia = ganadoresConsistencia;
	}
	

}
