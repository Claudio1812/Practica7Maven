package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {
	public int maxOcupantes;
	public int maxPeso;
	
	public int maxVehiculos;
	public int maxPasajeros;
	public int numeroVehiculos=0;
	
	public int pesoVehiculos;
	
	ArrayList<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
	
	public boolean embarcarVehiculo (Vehiculo v) {
		numeroVehiculos++;
		pesoVehiculos+=v.pesoConCarga;
		return vehiculos.add(v);
	}
	
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public int totalVehiculos()   {
		int i=0;
		for(Vehiculo v : vehiculos)
			i++;
		return i;
	}
	
	public boolean vacio() {
		return vehiculos.isEmpty();
	}
	
	public boolean superadoMaximoVehiculos() {
		return maxVehiculos<numeroVehiculos;
	}
	
	public boolean superadoMaximoPeso() {
		return pesoVehiculos>maxPeso;
	}


}
