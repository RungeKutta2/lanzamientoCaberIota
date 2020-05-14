package competenciaCaber;

public class Lanzamiento {
	private double distancia;
	private double angulo;
	
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getAngulo() {
		return angulo;
	}
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public boolean verificarLanzamiento() {
		return this.angulo <= 90 && this.angulo >= -90;
	}
	
	public double calcularDistanciaFinal() {
		if(this.angulo <= 11 && this.angulo >= 1) {
			this.distancia *= 0.8; //Ver si modificamos adentro o no.
		}
		return this.distancia;
	}
	
	
}
