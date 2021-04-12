package bisiesto;

public class BisiestoContrato {
	/**
	 * Calcula si un a�o es bisiesto o no
	 * 
	 * @param anno a calcula
	 * @return "SI" si es bisiesto o "NO" si no lo es
	 */
	/*
	 * Los annos validos son entre 1400 y 9999
	 */
	public String esBisiesto(int anno) {
		//precondiciones
		assert (anno >= 1400 && anno <= 9999);
		//si cumples, el codigo
		if (!(anno % 400 == 0)) {
			if (!(anno % 100 == 0)) {
				if (anno % 4 == 0)
					return "SI";
				else
					return "NO";
			} else
				return "NO";
		} else
			return "SI";
	}

}
