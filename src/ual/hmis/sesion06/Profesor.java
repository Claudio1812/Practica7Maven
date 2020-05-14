package ual.hmis.sesion06;

import java.util.ArrayList;

public class Profesor {
	private ArrayList<Alumno> alumnosDePracticas=new ArrayList<Alumno>();
	public Profesor(ArrayList<Alumno> al) {
		alumnosDePracticas=al;
	}

	public void calificarAlumnos() {

		for(int i=0; i<alumnosDePracticas.size(); i++) {
			for(int j=0; j<alumnosDePracticas.get(i).getActividadesAsignadas().size(); j++) {        
				double suma = 0.0;
				for(int k=0; k<alumnosDePracticas.get(i).getActividadesAsignadas().get(j).getEjercicios().size(); k++) {
					double puntuacion = alumnosDePracticas.get(i).getActividadesAsignadas().get(j).getEjercicios().get(k).getPuntuacion();
					suma += puntuacion;
				}

				if(suma >= 5)
					alumnosDePracticas.get(i).getActividadesAsignadas().get(j).setApta(true);
				else 
					alumnosDePracticas.get(i).getActividadesAsignadas().get(j).setApta(false);
			}      
		}
	}
}
