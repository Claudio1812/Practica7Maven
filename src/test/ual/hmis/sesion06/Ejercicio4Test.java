package test.ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion06.Ejercicio4;


public class Ejercicio4Test {

	@Test
	public void test() {
		Ejercicio4 ej4 = new Ejercicio4();
		
		assertEquals(ej4.comun("encagar", "penco"),"enc");
		assertEquals(ej4.comun("metro", "etica"),"et");
		assertEquals(ej4.comun("telar", "piano"),"a");
	}

}
