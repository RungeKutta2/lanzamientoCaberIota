package competenciaCaber;

import java.util.ArrayList;

public class Concursante {
	private int numeroDeConcursante;
	private double consistencia;
	private double distanciaTotal;
	private ArrayList<Lanzamiento> lanzamientos;
	private final static int SIN_CALCULAR = -1;

	public Concursante(int numeroDeConcursante) {
		this.numeroDeConcursante = numeroDeConcursante;
		lanzamientos = new ArrayList<Lanzamiento>();
		distanciaTotal = SIN_CALCULAR;

	}

	public double calcularConsistencia() {
		double consistencia = 0;
		if (validar()) {
			for (Lanzamiento lanzamiento : lanzamientos) {
				consistencia += lanzamiento.getAngulo();
			}

		}

		return consistencia;
	}

	private boolean validar() {
		for (Lanzamiento lanzamiento : lanzamientos) {
			if (!lanzamiento.verificarLanzamiento()) {
				return false;
			}
		}
		return true;
	}

	public void calcularDistanciaTotal() {
		distanciaTotal = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			distanciaTotal += lanzamiento.calcularDistanciaFinal();
		}
	}

	public int getNumeroDeConcursante() {
		return numeroDeConcursante;
	}

	public Double getConsistencia() {
		return consistencia;
	}

	public Double getDistanciaTotal() {
		if (distanciaTotal == SIN_CALCULAR) {
			calcularDistanciaTotal();
		}
		return distanciaTotal;
	}

	public void setLanzamientos(Lanzamiento lanzamiento) {
		lanzamientos.add(lanzamiento);
	}
}
