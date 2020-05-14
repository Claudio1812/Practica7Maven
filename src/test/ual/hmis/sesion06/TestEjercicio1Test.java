package test.ual.hmis.sesion06;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion06.Ejercicio1;



public class TestEjercicio1Test {

	@Test
	public void test() {
		Ejercicio1 ej1 = new Ejercicio1();
		assertEquals(ej1.transformar(2),1);
		assertEquals(ej1.transformar(3),1);
		assertEquals(ej1.transformar(5),1);
		
		
	}

}
