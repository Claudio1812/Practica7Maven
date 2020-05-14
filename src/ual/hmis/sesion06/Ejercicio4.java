package ual.hmis.sesion06;

public class Ejercicio4 {

		public String comun(String entrada, String compare) {
			String devolver="";
			char aux;
			
			for(int i=0;i<entrada.length();i++) {
				aux=entrada.charAt(i);
				
				for(int j=0;j<compare.length();j++) {
					if(aux==compare.charAt(j))
						devolver+=aux;
				}
				
			}
			
			return devolver;
		}
}
