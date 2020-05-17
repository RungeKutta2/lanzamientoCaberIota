package competenciaCaber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Competencia {
	private ArrayList<Integer> ganadoresDistancia;
	private ArrayList<Integer> ganadoresConsistencia;
	private ArrayList<Concursante> concursantes;
	private final static int SIN_CALCULAR = -1;

	public Competencia() {
		ganadoresDistancia = new ArrayList<Integer>();
		ganadoresConsistencia = new ArrayList<Integer>();
		concursantes = new ArrayList<Concursante>();
	}

	public void calcularGanadorDistancia() {
		ganadoresDistancia = new ArrayList<Integer>(3);

		Collections.sort(concursantes, DistanciaComparador);

		for (int i = 0; i < 3; i++) {
			if (concursantes.get(i).getDistanciaTotal() != SIN_CALCULAR) {
				ganadoresDistancia.add(concursantes.get(i).getNumeroDeConcursante());
			}
		}
	}

	public void calcularGanadorConsistencia() {
		ganadoresConsistencia = new ArrayList<Integer>(3);
		
		Collections.sort(concursantes, ConsistenciaComparador);

		for (int i = 0; i < 3; i++) {
			if (concursantes.get(i).getConsistencia() != SIN_CALCULAR) {
				ganadoresConsistencia.add(concursantes.get(i).getNumeroDeConcursante());
			}
		}
	}

	private static Comparator<Concursante> DistanciaComparador = new Comparator<Concursante>() {

		@Override
		public int compare(Concursante concursante1, Concursante concursante2) {
			return concursante2.getDistanciaTotal().compareTo(concursante1.getDistanciaTotal());
		}

	};

	private static Comparator<Concursante> ConsistenciaComparador = new Comparator<Concursante>() {

		@Override
		public int compare(Concursante concursante1, Concursante concursante2) {
			return concursante1.getConsistencia().compareTo(concursante2.getConsistencia());
		}

	};

	public void setConcursantes(Concursante concursante) {
		this.concursantes.add(concursante);
	}

	public ArrayList<Integer> getGanadoresDistancia() {
		return ganadoresDistancia;
	}

	public ArrayList<Integer> getGanadoresConsistencia() {
		return ganadoresConsistencia;
	}

}
