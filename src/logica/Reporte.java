package logica;

import java.time.LocalDate;
import java.util.HashMap;

public class Reporte {
	
	private String nombre;
	private int tiempo_invertido;
	private HashMap<String, Double> tiempo_invertido_tipo;
	private HashMap<LocalDate, Double> tiempo_invertido_dia;
	
	
//Constructor	
public Reporte(String nombre, int tiempo_invertido, HashMap<String, Double> tiempo_invertido_tipo,
			HashMap<LocalDate, Double> tiempo_invertido_dia) {
		super();
		this.nombre = nombre;
		this.tiempo_invertido = tiempo_invertido;
		this.tiempo_invertido_tipo = tiempo_invertido_tipo;
		this.tiempo_invertido_dia = tiempo_invertido_dia;
	}


//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashMap<String, Double> getTiempo_invertido_tipo() {
		return tiempo_invertido_tipo;
	}
	public void setTiempo_invertido_tipo(HashMap<String, Double> tiempo_invertido_tipo) {
		this.tiempo_invertido_tipo = tiempo_invertido_tipo;
	}
	public HashMap<LocalDate, Double> getTiempo_invertido_dia() {
		return tiempo_invertido_dia;
	}
	public void setTiempo_invertido_dia(HashMap<LocalDate, Double> tiempo_invertido_dia) {
		this.tiempo_invertido_dia = tiempo_invertido_dia;
	}
	public int getTiempo_invertido() {
		return tiempo_invertido;
	}
	public void setTiempo_invertido(int tiempo_invertido) {
		this.tiempo_invertido = tiempo_invertido;
	}
	
	

}
