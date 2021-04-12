package circulo02;

public class Circulo {
	/**
	 * Me defiendo
	 * 
	 * @param radio tiene que ser positivo
	 * @return el valor calculado del area o -1 si el radio es negativo
	 */
	public float calcularArea(float radio) {
		//defensa
		if (radio < 0) {
			return -1;
		}
		//logica
		return (float)(Math.PI*Math.pow(radio,2));	
	}
}
