package competenciaCaber;

import java.util.ArrayList;

public class Concursante {
	private int numeroDeConcursante;
	private double consistencia;
	private double distanciaTotal;
	private ArrayList<Lanzamiento> lanzamientos;

	public Concursante(int numeroDeConcursante) {
		this.numeroDeConcursante = numeroDeConcursante;
		lanzamientos = new ArrayList<Lanzamiento>();

	}

	/*
	 * public boolean validar() {
	 * 
	 * }
	 */

	public double calcularConsistencia() {

		return consistencia;
	}

	public void calcularDistanciaTotal() {
		double distanciaTotal = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			distanciaTotal += lanzamiento.calcularDistanciaFinal();
		}
		this.distanciaTotal = distanciaTotal;
	}

	public int getNumeroDeConcursante() {
		return numeroDeConcursante;
	}

	public void setNumeroDeConcursante(int numeroDeConcursante) {
		this.numeroDeConcursante = numeroDeConcursante;
	}

	public Double getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(double consistencia) {
		this.consistencia = consistencia;
	}

	public Double getDistanciaTotal() {
		calcularDistanciaTotal();
		return distanciaTotal;
	}


	public ArrayList<Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}

	public void setLanzamientos(Lanzamiento lanzamiento) {
		this.lanzamientos.add(lanzamiento);
	}
}
