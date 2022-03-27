package logica;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Participante {
	
	private String nombre;
	private String Correo;
	private Boolean dueno;
	private HashMap<String,ArrayList<Actividad>> Actividades = new HashMap<String,ArrayList<Actividad>>();
	
	public void agregar_actividadActividad(String titulo, String descripcion, String autor, String tipo)
	{
		
		Actividad Acti = new Actividad(titulo,descripcion,autor, tipo);
		
		
		if (  Actividades.containsKey(titulo) ) {
			Actividades.get(titulo).add(Acti);
		}
		else {
			ArrayList<Actividad> listActi  = new ArrayList<Actividad>();
			listActi.add(Acti);
			Actividades.put(titulo,listActi);
		}
    }
	
	
	

	
	
//Constructor
	public Participante(String nombre, String correo, String dueño) {
		super();
		this.nombre = nombre;
		this.Correo = correo;
		this.dueno = Boolean.parseBoolean(dueño);
		
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
	public HashMap<String,ArrayList<Actividad>> getActividades() {
		return Actividades;
	}



	public Boolean getDueno() {
		return dueno;
	}

	public void setDueño(String dueno) {
		this.dueno = Boolean.parseBoolean(dueno);
	}
	

}
