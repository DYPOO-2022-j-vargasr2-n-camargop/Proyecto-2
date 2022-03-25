package logica;

public class Commit {

	private String comentario;
	private int tiempo_tardado;
	
	
//Constructor
	public Commit(String comentario, int tiempo_tardado) {
		super();
		this.comentario = comentario;
		this.tiempo_tardado = tiempo_tardado;
		}
//getters and setters
	public int getTiempo_tardado() {
		return tiempo_tardado;
	}
	public void setTiempo_tardado(int tiempo_tardado) {
		this.tiempo_tardado = tiempo_tardado;
	}
//////////
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
