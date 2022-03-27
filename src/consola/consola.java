package consola;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import logica.Proyecto;

public class consola {
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Proyecto proyecto;
//------------------------------------------
	public void crear_proyecto() {
		try {
			System.out.println("Nombre del Proyecto: ");
			String nombre = this.br.readLine();
			System.out.println("Descripcion del Proyecto: ");
			String descripcion = this.br.readLine();
			System.out.println("Ingrese la fecha de Inicio del Proyecto:(yyyy-mm-dd)");
			String fecha_incio = this.br.readLine();
			System.out.println("Ingrese la fecha de Fin del Proyecto:(yyyy-mm-dd)");
			String fecha_final = this.br.readLine();
			this.proyecto = new Proyecto(nombre, descripcion,fecha_incio,fecha_final);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
//------------------------------------------
	public void ejecutar_agregar_participante() {
		try {
			System.out.println("Nombre del Participante: ");
			String nombre = this.br.readLine();
			System.out.println("Correo del Participante: ");
			String correo = this.br.readLine();
			
			this.proyecto.agregar_participante(nombre, correo);	
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//------------------------------------------
	public void ejecutar_eliminar_participante() {
		try {
			System.out.println("Nombre del Participante: ");
			String nombre = this.br.readLine();
			
			this.proyecto.eliminar_participante(nombre);	
			System.out.println("Nombre del Participante: ");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//------------------------------------------	
	public void mostra_info() {
		System.out.println("Nombre del Proyecto\n"
				+ "Descripcion\n"
				+ "fecha inicio del proyecto\n"
				+ "fecha fin del proyecto\n");
		System.out.printf(this.proyecto.getNombre()+"\n"+this.proyecto.getDescripcion()+"\n");
		System.out.print(this.proyecto.getFecha_inicio()+"\n");
		System.out.print(this.proyecto.getFecha_final()+"\n");
		System.out.print("Participantes: "+this.proyecto.getParticipantes().keySet()+"\n");
				
	}
//------------------------------------------	

//------------------------------------------
	
//------------------------------------------
	
//------------------------------------------
	
//------------------------------------------
	public static void main(String[] args) {
		consola c = new consola();
		c.ejecutar_Aplicacion();
	}
//------------------------------------------
	private void mostrar_menu(){
		System.out.println("\nDigite una opcion:\n"
						+ "1. Crear Proyecto\n"
						+ "2. Agregar Participantes\n"
						+ "3. Eliminar Participantes\n"
						+ "4. Mostrar Info del Proyecto\n"
						+ "5. Regsitar Activdidad\n"
						+ "6. Hacer commit dentro de una actividad\n"
						+ "7. Realizar Reporte\n"
						+ "8. Cronometrar Actividad\n"
						+ "0. Salir");
	}
	
	private void ejecutar_Aplicacion(){
		try {
			int op;
			do {
				mostrar_menu();
				op = Integer.parseInt(this.br.readLine()); 
				if(op == 1) {
					crear_proyecto();
				}
				else if(op == 2){
					ejecutar_agregar_participante();
				}
				else if(op == 3){
					ejecutar_eliminar_participante();
				}
				else if(op == 4){
					mostra_info();
				}
				else if(op == 5){
					
				}
				else if(op == 6){
					
				}
				else if(op == 7){
	
				}
			}while(op != 0);
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
