package test.ual.hmis.sesion06;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion06.Ferry;
import ual.hmis.sesion06.Vehiculo;


public class Ejercicio8Test {

	@Test
	public void test() {
		ArrayList<Vehiculo> contenedor = new ArrayList<Vehiculo>();
		Ferry barco = new Ferry();
		Ferry barco1 = new Ferry();
		
		Vehiculo coche1 = new Vehiculo();
		Vehiculo coche2 = new Vehiculo();
		Vehiculo coche3 = new Vehiculo();
		Vehiculo coche4 = new Vehiculo();

		coche1.setPesoConCarga(268);
		coche2.setPesoConCarga(450);
		coche3.setPesoConCarga(320);
		coche4.setPesoConCarga(2560);
		coche1.setNumeroPasajeros(6);
		coche1.setNumeroRuedas(4);
		coche1.setPesoConCarga(1200);
		
		contenedor.add(coche1);
		contenedor.add(coche2);
		contenedor.add(coche3);
		
		barco1.maxPeso=0;
		barco1.maxVehiculos=0;
		barco.maxOcupantes=300;
		barco.maxVehiculos=2;
		barco.setVehiculos(contenedor);
		barco.getVehiculos();

		assertEquals(barco.superadoMaximoPeso(),false);
		assertEquals(barco.superadoMaximoVehiculos(),false);
		
		barco.embarcarVehiculo(coche4);
		assertEquals(barco.superadoMaximoPeso(),true);
		assertEquals(barco.vacio(),false);
		assertEquals(barco.totalVehiculos(),4);
		assertEquals(coche1.getNumeroPasajeros(),6);
		assertEquals(coche1.getNumeroRuedas(),4);
		assertEquals(coche1.getPesoConCarga(),1200);
		assertEquals(barco1.vacio(),true);
		assertEquals(barco1.superadoMaximoVehiculos(),false);
		assertEquals(barco1.superadoMaximoPeso(),false);

		barco1.embarcarVehiculo(coche4);
		assertEquals(barco1.superadoMaximoVehiculos(),true);

		
	}

}
