package ual.hmis.sesion06;

import java.util.ArrayList;

public class Alumno {

	
private String nombre;

	private ArrayList<Actividad> actividades;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividades;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividades = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double suma=0.0;
		Actividad ac=new Actividad();
		for(Actividad act : actividades) {
			if(act.getNombre()==nombreActividad) {
				ac=act;
				for(Ejercicio ej : act.getEjercicios()) 
					suma+=ej.getPuntuacion();
				}
		}
		ac.setPuntuacionTotal(suma);
		return suma;
	}
	
	public String cursoSegunEdad(int nacimiento) {
		
		nacimiento=nacimiento%100;
		
		String[] educacion= new String[20];
		
		educacion[17]="1  infantil";
		educacion[16]="2  infantil";
		educacion[15]="3  infantil";
		educacion[14]="1  primaria";
		educacion[13]="2  primaria";
		educacion[12]="3  primaria";
		educacion[11]="4  primaria";
		educacion[10]="5  primaria";
		educacion[9]="6  primaria";
		educacion[8]="1  secundaria";
		educacion[7]="2  secundaria";
		educacion[6]="3  secundaria";
		educacion[5]="4  secundaria";
		educacion[2]="chiquito";


 		
			return educacion[nacimiento];
		}
	

public String calificacion(double nota) {
	String resultado;
		if(nota>=0 && nota<=4.9) {
			return resultado="Suspenso";
		}
		
		if(nota>=5.0 && nota<=6.9) {
			return resultado="Aprobado";
		}
		
		if(nota>=7.0 && nota<=8.9) {
			return resultado="Notable";
		}
		
		if(nota>=9 && nota<=9.9) {
			return resultado="Sobresaliente";
		}
		
		if(nota<0) {
			return resultado="Error";
		}else {
			return resultado="Matricula";
		}
		
		
		}
	

}
