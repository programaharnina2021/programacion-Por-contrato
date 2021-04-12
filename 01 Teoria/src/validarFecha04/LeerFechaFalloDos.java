package validarFecha04;



public class LeerFechaFalloDos{
	/**
	 * Nos dice si una fecha es valida entre 1/1/1900 y 31/12/2000
	 * @return true si valido o false en caso contrario
	 */
//	private boolean validarFecha(int dia, int mes, int anno) {
	//public por junit
	public boolean validarFecha(int dia, int mes, int anno) {		
		boolean valido = true;
		// Algoritmo
		
			if (dia < 1 || dia > 31) {
				valido = false;
			} 
		
		
			if (mes < 1 || mes > 12) {
				valido = false;
			}
		
			if (anno < 1900 || anno > 2000) {
				valido = false;
			}
		
		return valido;
	}
}//class
