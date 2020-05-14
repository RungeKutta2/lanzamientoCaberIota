package competenciaCaber;

public class Lanzamiento {
	private double distancia;
	private double angulo;
	
	public Lanzamiento(double distancia, double angulo) {
		super();
		this.distancia = distancia;
		this.angulo = angulo;
	}
	
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
		double distanciaFinal = 0;
		if(this.verificarLanzamiento() && this.angulo >= 30 && this.angulo <= -30) {
			distanciaFinal = this.distancia * 0.8;
		}
		return distanciaFinal;
	}
	
	
}
