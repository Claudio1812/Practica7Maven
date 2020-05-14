package test.ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import test.ual.hmis.sesion06.*;
import ual.hmis.sesion06.Ejercicio3;


public class Ejercicio3Test {

	@Test
	public void test() {
		Ejercicio3 ej3 = new Ejercicio3();
		
		assertEquals(ej3.devolver(-1),"numero mayor que 0 porfavor");
		assertEquals(ej3.devolver(9),"*********");
		assertEquals(ej3.devolver(1),"*****");
		assertEquals(ej3.devolver(13),"************");
		
	}

}
