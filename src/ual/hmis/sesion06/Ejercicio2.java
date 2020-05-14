package ual.hmis.sesion06;

public class Ejercicio2 {
	public boolean login (String nombre, String pass){
		
		String aux="";
		
		if(nombre.equals(aux) || pass.equals(aux)) {
			return false;
		}
		
		if(nombre.length()>29 || pass.length()>29) {
			return false;
		}
		
		if(pass.equals(pass.toLowerCase()) || pass.equals(pass.toUpperCase()) || pass.contains("[0-9]+")) {
			return false;
		}
		
		return compruebaLoginEnBD(nombre, pass);
	}
		
		public boolean compruebaLoginEnBD(String nombre, String pass){
			
		if (nombre == "usuario" && pass=="contrasenA1")
			return true;
		else
			return false;
		}
}
