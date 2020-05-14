package test.ual.hmis.sesion06;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion06.Alumno;



public class Ejercicio7Test {

	@Test
	public void test() {
	Alumno al = new Alumno();
	assertEquals(al.cursoSegunEdad(2017),"1  infantil");
	assertEquals(al.cursoSegunEdad(2016),"2  infantil");
	assertEquals(al.cursoSegunEdad(2015),"3  infantil");
	assertEquals(al.cursoSegunEdad(2014),"1  primaria");
	assertEquals(al.cursoSegunEdad(2013),"2  primaria");
	assertEquals(al.cursoSegunEdad(2012),"3  primaria");
	assertEquals(al.cursoSegunEdad(2011),"4  primaria");
	assertEquals(al.cursoSegunEdad(2010),"5  primaria");
	assertEquals(al.cursoSegunEdad(2009),"6  primaria");
	assertEquals(al.cursoSegunEdad(2008),"1  secundaria");
	assertEquals(al.cursoSegunEdad(2007),"2  secundaria");
	assertEquals(al.cursoSegunEdad(2006),"3  secundaria");
	assertEquals(al.cursoSegunEdad(2005),"4  secundaria");
	assertEquals(al.cursoSegunEdad(2002),"chiquito");

	
	
	}

}
