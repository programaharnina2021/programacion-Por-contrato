package circulo02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	void testCalcularArea() {
		Circulo circulo=new Circulo();
		//probando codigo
		assertEquals(3.145,circulo.calcularArea(1),0.005);
		assertEquals(0,circulo.calcularArea(0));
		//probando defensa
		assertEquals(-1, circulo.calcularArea(-1));
		
	}

}
