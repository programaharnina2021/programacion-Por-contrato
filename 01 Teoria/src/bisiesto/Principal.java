package bisiesto;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Principal {
public static void main(String[] args) {
	BisiestoContrato bisiesto=new BisiestoContrato();
	//Aqui pruebo el codigo que resuelve el problema
	System.out.println(bisiesto.esBisiesto(1400));
	System.out.println(bisiesto.esBisiesto(2020));
	System.out.println(bisiesto.esBisiesto(12020));
}
}
