package ual.hmis.sesion06;

public class Ejercicio3 {
	public String devolver(int cantidad) {
		String devolver="numero mayor que 0 porfavor";
		
		if(cantidad>0) {
			devolver="";
			if(cantidad>4 && cantidad<13) {
				
				for(int j=0;j<cantidad;j++) {
					devolver=devolver+"*";
				}
				
				return devolver;
				}else {
					
					if(cantidad<4) {
						return devolver="*****";
					}else {
						return devolver="************";
					}
				}
		}
		
		return devolver;
	}
}
