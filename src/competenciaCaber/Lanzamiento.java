package competenciaCaber;

public class Lanzamiento {
	private double distancia;
	private double angulo;

	public Lanzamiento(double distancia, double angulo) {
		this.distancia = distancia;
		this.angulo = angulo;
	}

	public double getAngulo() {
		return angulo;
	}

	public boolean verificarLanzamiento() {
		return this.angulo <= 90 && this.angulo >= -90;
	}

	public double calcularDistanciaFinal() {
		double distanciaFinal = 0;
		if (verificarLanzamiento()) {
			if (angulo <= 30 && angulo >= -30) {
				distanciaFinal = distancia;
			} else {
				distanciaFinal = distancia * 0.8;
			}
		}

		return distanciaFinal;
	}

}
