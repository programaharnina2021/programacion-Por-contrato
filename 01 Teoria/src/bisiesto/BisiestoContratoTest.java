package bisiesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BisiestoContratoTest {

	@Test
	void testEsBisiesto() {
		BisiestoContrato bisiesto=new BisiestoContrato();
		//Aqui pruebo el codigo que resuelve el problema
		assertEquals("NO",bisiesto.esBisiesto(1400));
		assertEquals("NO",bisiesto.esBisiesto(9999));
		assertEquals("SI",bisiesto.esBisiesto(2020));
	}
}
