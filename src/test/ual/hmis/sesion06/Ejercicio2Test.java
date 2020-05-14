package test.ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import test.ual.hmis.sesion06.*;
import ual.hmis.sesion06.Ejercicio2;

public class Ejercicio2Test {

	@Test
	public void test() {
		Ejercicio2 ej2 = new Ejercicio2();
		assertEquals(ej2.login("", ""),false);
		assertEquals(ej2.login("hola", ""),false);
		assertEquals(ej2.login("", "hola"),false);
		
		assertEquals(ej2.login("usuario","contrasena1"),false);
		assertEquals(ej2.login("usuario","pass"),false);
		
		assertEquals(ej2.login("usuario","CONTRASENA1"),false);
		assertEquals(ej2.login("usuario","CONTRASENA"),false);
		
		assertEquals(ej2.login("usuario","Contrasenaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),false);
		assertEquals(ej2.login("usuariooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo","contrasenA1"),false);

		
		
		assertEquals(ej2.login("usuario","contrasenaMAL"),false);
		assertEquals(ej2.login("usuario","contrasenA1"),true);
		assertEquals(ej2.login("usuarie","pasS12"),false);
	}

}
