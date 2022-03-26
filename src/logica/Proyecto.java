package logica;

import java.sql.Date;
import java.util.HashMap;

public class Proyecto {

	private String nombre;
	private String descripcion;
	private Date fecha_inicio;
	private Date fecha_final;
	private HashMap<String,Participante> Participantes = new HashMap<String,Participante>();
	
	
	public void agregar_participante(String nombre, String correo)
	{	
		Participante P = new Participante(nombre, correo);
		Participantes.put(nombre, P);
	}
	
	
	
	
//Constructor	
public Proyecto(String nombre, String descripcion, Date fecha_inicio, Date fecha_final) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
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
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
//------------------------------------------
	public Date getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}
//------------------------------------------
	public HashMap<String, Participante> getParticipantes() {
		return Participantes;
	}

	
	
	
	
}
