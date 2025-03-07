package competenciaCaber;

import java.util.ArrayList;

public class Concursante {
	private int numeroDeConcursante;
	private double consistencia;
	private double distanciaTotal;
	private ArrayList<Lanzamiento> lanzamientos;
	private final static int LANZAMIENTO_INVALIDO = -2;

	public Concursante(int numeroDeConcursante) {
		this.numeroDeConcursante = numeroDeConcursante;
		this.lanzamientos = new ArrayList<Lanzamiento>();

	}

	public void calcularConsistencia() {
		if (validar()) {
			double sumatoriaAngulos = 0;
			double sumatoriaDistancias = 0;
			for (Lanzamiento lanzamiento : this.lanzamientos) {
				sumatoriaAngulos += lanzamiento.getAngulo();
				sumatoriaDistancias += lanzamiento.getDistancia();
			}
			double mediaAngulo = sumatoriaAngulos / 3;
			double mediaDistancia = sumatoriaDistancias / 3;

			sumatoriaAngulos = 0;
			sumatoriaDistancias = 0;
			double varianzaAngulo = 0;
			double varianzaDistancia = 0;
			for (Lanzamiento lanzamiento : this.lanzamientos) {
				sumatoriaAngulos = Math.pow(lanzamiento.getAngulo() - mediaAngulo, 2);
				varianzaAngulo += sumatoriaAngulos;
				sumatoriaDistancias = Math.pow(lanzamiento.getDistancia() - mediaDistancia, 2);
				varianzaDistancia += sumatoriaDistancias;
			}

			varianzaAngulo = varianzaAngulo / 2;
			varianzaDistancia = varianzaDistancia / 2;
			double desvioAngulo = Math.sqrt(varianzaAngulo);
			double desvioDistancia = Math.sqrt(varianzaDistancia);
			this.consistencia = (desvioAngulo*0.4 + desvioDistancia*0.6);
		}
		else {
			this.consistencia = LANZAMIENTO_INVALIDO;			
		}
	}

	private boolean validar() {
		boolean esValido = true;
		int i = 0;
		while(esValido && i<3) {
			esValido = this.lanzamientos.get(i).verificarLanzamiento();
			i++;
		}
		return esValido;
	}

	public void calcularDistanciaTotal() {
		this.distanciaTotal = 0;
		for (Lanzamiento lanzamiento : this.lanzamientos) {
			this.distanciaTotal += lanzamiento.calcularDistanciaFinal();
		}
	}

	public int getNumeroDeConcursante() {
		return this.numeroDeConcursante;
	}

	public Double getConsistencia() {
		return this.consistencia;
	}

	public Double getDistanciaTotal() {

		return this.distanciaTotal;
	}

	public void setLanzamientos(Lanzamiento lanzamiento) {
		this.lanzamientos.add(lanzamiento);
	}
}
