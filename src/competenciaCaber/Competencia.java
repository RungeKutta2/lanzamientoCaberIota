package competenciaCaber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Competencia {
	private ArrayList<Integer> ganadoresDistancia;
	private ArrayList<Integer> ganadoresConsistencia;
	private ArrayList<Concursante> concursantes;

	public Competencia() {
		ganadoresDistancia = new ArrayList<Integer>();
		ganadoresConsistencia = new ArrayList<Integer>();
		concursantes = new ArrayList<Concursante>();
	}

	public int compararDistancias(Concursante concursante1, Concursante concursante2) {
		return (int) (concursante1.getDistanciaTotal() - concursante2.getDistanciaTotal());
	}

	public List<Integer> calcularGanadorDistancia() {
		List<Integer> ganadoresDistancia = new ArrayList<Integer>(3);
		Collections.sort(concursantes, new Comparator<Concursante>() {
			public int compare(Concursante concursante1, Concursante concursante2) {
				return (int) (concursante1.getDistanciaTotal() - concursante2.getDistanciaTotal());
			}
		});
		
		for (int i = 2; i >=0; i--) {
			ganadoresDistancia.add(concursantes.get(i).getNumeroDeConcursante());
		}
		System.out.println(ganadoresDistancia);
		return ganadoresDistancia;
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
