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
		consistencia = SIN_CALCULAR;

	}

//	public double calcularConsistencia() {
//		double consistencia = 0;
//		if (validar()) {
//			for (Lanzamiento lanzamiento : lanzamientos) {
//				consistencia += lanzamiento.getAngulo();
//			}
//
//		}
//		return consistencia;
//	}

	public void calcularConsistencia() {
		if (validar()) {
			double sumatoriaAngulos = 0;
			double sumatoriaDistancias = 0;
			for (Lanzamiento lanzamiento : lanzamientos) {
				sumatoriaAngulos += lanzamiento.getAngulo();
				sumatoriaDistancias += lanzamiento.getDistancia();
			}
			double mediaAngulo = sumatoriaAngulos / 3;
			double mediaDistancia = sumatoriaDistancias / 3;

			sumatoriaAngulos = 0;
			sumatoriaDistancias = 0;
			double varianzaAngulo = 0;
			double varianzaDistancia = 0;
			for (Lanzamiento lanzamiento : lanzamientos) {
				sumatoriaAngulos = Math.pow(lanzamiento.getAngulo() - mediaAngulo, 2);
				varianzaAngulo += sumatoriaAngulos;
				sumatoriaDistancias = Math.pow(lanzamiento.getDistancia() - mediaDistancia, 2);
				varianzaDistancia += sumatoriaDistancias;
			}

			varianzaAngulo = varianzaAngulo / 2;
			varianzaDistancia = varianzaDistancia / 2;
			double desvioAngulo = Math.sqrt(varianzaAngulo);
			double desvioDistancia = Math.sqrt(varianzaDistancia);
			consistencia = (Math.rint(desvioAngulo * 100) / 100) + (Math.rint(desvioDistancia * 100) / 100);
		}
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
		if (distanciaTotal == SIN_CALCULAR) {
			calcularConsistencia();			
		}
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
