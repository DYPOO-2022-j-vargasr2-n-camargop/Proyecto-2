package logica;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Participante {
	
	private String nombre;
	private String Correo;
	private ArrayList<Actividad> Actividades = new ArrayList<Actividad>();
	
	public void agregar_actividad(String titulo, String descripcion, String autor, 
			String tipo, LocalDateTime fecha, LocalTime hora_inicio)
	{
		Actividad Acti = new Actividad(titulo, descripcion, autor, tipo, fecha, hora_inicio);
		Actividades.add(Acti);
	}
	
	
	

	
	
	
	
	
	
//Constructor
	public Participante(String nombre, String correo) {
		super();
		this.nombre = nombre;
		Correo = correo;
	}

//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
//------------------------------------------	
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
//------------------------------------------
	public ArrayList<Actividad> getActividades() {
		return Actividades;
	}
	

}
