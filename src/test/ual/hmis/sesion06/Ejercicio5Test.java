package test.ual.hmis.sesion06;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion06.Actividad;
import ual.hmis.sesion06.Alumno;
import ual.hmis.sesion06.Ejercicio;
import ual.hmis.sesion06.Profesor;


public class Ejercicio5Test {
	@Test
	public void test() {
		Actividad actividad = new Actividad();
		Actividad actividad1 = new Actividad();
		Actividad activad2 = new Actividad();

		Ejercicio primero = new Ejercicio();
		Ejercicio segundo = new Ejercicio();
		Ejercicio tercero = new Ejercicio();

		Alumno federico = new Alumno();

		ArrayList<Ejercicio> contenedorEjer = new ArrayList<Ejercicio>();
		ArrayList<Actividad> contenedorAc = new ArrayList<Actividad>();
		ArrayList<Alumno> contenedorAlum = new ArrayList<Alumno>();
		
		contenedorAlum.add(federico);
		Profesor federica=new Profesor(contenedorAlum);

		primero.setNombre("primero");
		primero.setPuntuacion(4.7);
		segundo.setNombre("segundo");
		segundo.setPuntuacion(25.0);
		tercero.setNombre("tercero");
		tercero.setPuntuacion(11.2);
		
		contenedorEjer.add(primero);
		contenedorEjer.add(segundo);
		
		actividad.setEjercicios(contenedorEjer);
		actividad.setNombre("primero");
		actividad1.agregarEjercicioCalificado("ejer", 10.0);
		actividad1.setApta(false);
		
		contenedorAc.add(actividad);
		contenedorAc.add(actividad1);
		contenedorAc.add(activad2);
		
		federico.setActividadesAsignadas(contenedorAc);
		federico.setNombre("federico");
		federica.calificarAlumnos();
		
		assertEquals(primero.getNombre(),"primero");
		assertEquals("federico",federico.getNombre());
		assertEquals(contenedorAc,federico.getActividadesAsignadas());
		assertEquals(federico.calcularNotaActividad("primero"),29.7,0.01);
		assertEquals(federico.calcularNotaActividad("primero"),actividad.getPuntuacionTotal(),0.01);
		assertEquals(actividad1.isApta(),true);
		
		
	}

}
