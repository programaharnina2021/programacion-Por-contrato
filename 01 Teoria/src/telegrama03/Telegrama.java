package telegrama03;

public class Telegrama {

	public double calcularTelegrama(char tipoTelegrama, int numPalabras) {
		// NO SE DEFIENDE ANTE numPalabra negattvo
		assert (tipoTelegrama == 'O' || tipoTelegrama == 'o' || tipoTelegrama == 'U' || tipoTelegrama == 'u');
		assert (numPalabras > 0);
		double costo = 0;
		// Si el tipo de telegrama es ordinario
		if (tipoTelegrama == 'O' || tipoTelegrama == 'o')
			// Si el número de palabras es menor o igual a 10
			if (numPalabras <= 10)
				costo = 25.0f;
			// Si el número de palabras es mayor a 10
			else
				costo = 25.0f + 5.0f * (numPalabras - 10);
		// Si el tipo de telegrama es urgente
		else if (tipoTelegrama == 'U' || tipoTelegrama == 'u')
			// Si el número de palabras es menor o igual a 10
			if (numPalabras <= 10)
				costo = 40.0f;
			// Si el número de palabras es mayor a 10
			else
				costo = 40.0f + 7.5f * (numPalabras - 10);
		// AQUI ESTAS DEFENSA
//		else costo = 0;
		// Escribe el costo del telegrama
		return costo;
	}

}
