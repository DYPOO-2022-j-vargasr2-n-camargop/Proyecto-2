package logica;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class Actividad {

	private String titulo;
	private String descripcion;
	private String autor;
	private String tipo;
	private LocalDate fecha; 
	private LocalTime hora_inicio;
	private LocalTime hora_final;
	//private ArrayList<Commit> Commits = new ArrayList<Commit>();
	
	
	//public void agregar_commit(String comentario, int tiempo_tardado)
	{
		//Commit com = new Commit(comentario,tiempo_tardado);
		//Commits.add(com);
	}
	
	public void modificar_fecha_y_hora(String fecha,String hora_inicio)
	{
		LocalDate f = LocalDate.parse(fecha);
		setFecha(f);
		LocalTime t = LocalTime.parse(hora_inicio);
		setHora_inicio(t);
	}
	
	public int tiempo_invertido() {
		return (int) ChronoUnit.MINUTES.between(hora_inicio, hora_final);
		
	}
		
	
//Constructor
	public Actividad(String titulo, String descripcion, String autor, String tipo, String hora_final) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.autor = autor;
		this.tipo = tipo;
		this.setFecha(LocalDate.now());
		this.hora_inicio = LocalTime.now();	
		this.hora_final = LocalTime.parse(hora_final);
	}

//getters and setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
//------------------------------------------
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
//------------------------------------------
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
//------------------------------------------
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
//------------------------------------------

//------------------------------------------
	public LocalTime getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(LocalTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
//------------------------------------------
	public LocalTime getHora_final() {
		return hora_final;
	}
	public void setHora_final(LocalTime hora_final) {
		this.hora_final = hora_final;
	}
//------------------------------------------
	//public ArrayList<Commit> getCommits() {
		//return Commits;}


	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	
	
	
	

	
	
	
	
}
