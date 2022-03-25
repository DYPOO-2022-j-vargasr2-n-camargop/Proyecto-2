package logica;

import java.util.ArrayList;

public class Participante {
	
	private String nombre;
	private String Correo;
	private ArrayList<Actividad> Actividades = new ArrayList<Actividad>();
	
	public void agregar_actividad(Actividad Acti)
	{
		Actividades.add(Acti);
	}
	
	
//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
//////////	
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
//////////
	public ArrayList<Actividad> getActividades() {
		return Actividades;
	}
	
	

	

}
