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

	public double calcularDistanciaTotal() {
		double distanciaTotal = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			distanciaTotal += lanzamiento.calcularDistanciaFinal();
		}
		return distanciaTotal;

	}

	public int getNumeroDeConcursante() {
		return numeroDeConcursante;
	}

	public void setNumeroDeConcursante(int numeroDeConcursante) {
		this.numeroDeConcursante = numeroDeConcursante;
	}

	public double getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(double consistencia) {
		this.consistencia = consistencia;
	}

	public Double getDistanciaTotal() {
		distanciaTotal = calcularDistanciaTotal();
		return distanciaTotal;
	}

	public void setDistanciaTotal(double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}

	public ArrayList<Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}

	public void setLanzamientos(Lanzamiento lanzamiento) {
		this.lanzamientos.add(lanzamiento);
	}
}
