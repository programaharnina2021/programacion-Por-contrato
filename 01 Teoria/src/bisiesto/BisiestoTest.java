package bisiesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BisiestoTest {

	@Test
	void testEsBisiesto() {
		Bisiesto bisiesto=new Bisiesto();
		//Aqui pruebo el codigo que resuelve el problema
		assertEquals("NO",bisiesto.esBisiesto(1400));
		assertEquals("NO",bisiesto.esBisiesto(9999));
		assertEquals("SI",bisiesto.esBisiesto(2020));
		//Aqui estoy probando la programacion defensiva
		assertEquals("INVALIDA",bisiesto.esBisiesto(10000));
		assertEquals("INVALIDA",bisiesto.esBisiesto(1399));
	}

}
