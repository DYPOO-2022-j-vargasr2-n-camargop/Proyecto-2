package logica;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;

public class Proyecto {

	private String nombre;
	private String descripcion;
	private LocalDate fecha_inicio;
	private LocalDate fecha_final;
	private HashMap<String,Participante> Participantes = new HashMap<String,Participante>();
	
	
	public void agregar_participante(String nombre, String correo)
	{	
		if (Participantes.isEmpty()) {
			Participante P = new Participante(nombre, correo, "true");
			Participantes.put(nombre,P);
		}
		else {
			Participante P = new Participante(nombre, correo, "false");
			Participantes.put(nombre,P);
		}
	}
	
	public void eliminar_participante(String nombre) {
		Participantes.remove(nombre);
	}
	
	
//Constructor	
public Proyecto(String nombre, String descripcion,String fecha_inicio,String fecha_final) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		LocalDate localDate_i = LocalDate.parse(fecha_inicio);
		this.fecha_inicio = localDate_i;
		LocalDate localDate_f = LocalDate.parse(fecha_final);
		this.fecha_final = localDate_f;
	}

//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//------------------------------------------
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
//------------------------------------------
	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		LocalDate localDate = LocalDate.parse(fecha_inicio);
		this.fecha_inicio = localDate;
	}
//------------------------------------------
	public LocalDate getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(String fecha_final) {
		LocalDate localDate = LocalDate.parse(fecha_final);
		this.fecha_final = localDate;
	}
//------------------------------------------
	public HashMap<String, Participante> getParticipantes() {
		return Participantes;
	}

	
	
	
	
}
