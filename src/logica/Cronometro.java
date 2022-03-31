package logica;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;



public class Cronometro {
	
	private Double tiempo_invertido;
	private LocalDate fecha;
	private LocalTime hora_inicio;
	private LocalTime hora_final;
	private LocalTime in_hora;
	private ArrayList<Double> tiempos = new ArrayList<Double>();
	

	
	
	public void iniciar_crono() {
		this.setFecha(LocalDate.now());
		this.hora_inicio = LocalTime.now();
		this.in_hora = LocalTime.now();
		this.tiempos = new ArrayList<Double>(); 
	}
	
	public void pausar_crono() {
		
		LocalTime hora_pausa = LocalTime.now();
		Double tiempo_acumulado = (double) ChronoUnit.SECONDS.between(this.in_hora,hora_pausa)/60;
		this.tiempos.add(tiempo_acumulado);
	}
	public void reanudar() {
		this.in_hora = LocalTime.now();
	}

	public void terminar_crono() {
		LocalTime hora_terminar = LocalTime.now();
		this.hora_final = hora_terminar;
		Double tiempo_acumulado = (double) ChronoUnit.SECONDS.between(in_hora,hora_terminar)/60;
		this.tiempos.add(tiempo_acumulado);
		
		Double tiempo_t = 0.0;
		for (Double tiempo : tiempos) {
			tiempo_t += tiempo;
		}
		this.tiempo_invertido = tiempo_t;
	}
	
	
	
	
	
	




	

	//getters and setters
	public double getTiempo_invertido() {
		return tiempo_invertido;
	}
	public void setTiempo_invertido(double tiempo_invertido) {
		this.tiempo_invertido = tiempo_invertido;
	}
	public LocalTime getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(LocalTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public LocalTime getHora_final() {
		return hora_final;
	}
	public void setHora_final(LocalTime hora_final) {
		this.hora_final = hora_final;
	}

	public ArrayList<Double> getTiempos() {
		return tiempos;
	}

	public void setTiempos(ArrayList<Double> tiempos) {
		this.tiempos = tiempos;
	}

	public LocalTime getIn_hora() {
		return in_hora;
	}

	public void setIn_hora(LocalTime in_hora) {
		this.in_hora = in_hora;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
