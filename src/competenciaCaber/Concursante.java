package competenciaCaber;

import java.util.ArrayList;

public class Concursante {
	private int numeroDeConcursante;
	private double consistencia;
	private double distanciaTotal;
	private ArrayList<Lanzamiento> lanzamientos;
	
	public Concursante() {
		lanzamientos = new ArrayList<Lanzamiento>();
	}
	
	public double calcularConsistencia() {
//		15, 15, 15 ---- 0 - 1
		return consistencia;
		
	}
	
	public double calcularDistanciaTotal() {
		return consistencia;
		
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

	public double getDistanciaTotal() {
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
