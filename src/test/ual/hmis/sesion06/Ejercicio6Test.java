package test.ual.hmis.sesion06;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import test.ual.hmis.sesion06.*;
import ual.hmis.sesion06.Alumno;

public class Ejercicio6Test {

	@Test
	public void test() {
		
		Alumno yo = new Alumno();
		
		assertEquals(yo.calificacion(-10),"Error");
		assertEquals(yo.calificacion(4.9),"Suspenso");
		assertEquals(yo.calificacion(5.0),"Aprobado");
		assertEquals(yo.calificacion(8.0),"Notable");
		assertEquals(yo.calificacion(9.0),"Sobresaliente");
		assertEquals(yo.calificacion(10),"Matricula");
	}

}
