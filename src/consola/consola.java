package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import logica.Participante;
import logica.Proyecto;

public class consola {
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Proyecto proyecto;
//------------------------------------------
	public void crear_proyecto() {
		try {
			System.out.println("\nCrear Proyecto ");
			System.out.println("Nombre del Proyecto: ");
			String nombre = this.br.readLine();
			System.out.println("Descripcion del Proyecto: ");
			String descripcion = this.br.readLine();
			System.out.println("Ingrese la fecha de Inicio del Proyecto:(yyyy-mm-dd)");
			String fecha_inicio = this.br.readLine();
			System.out.println("¿Conoce la fecha de Fin del Proyecto?\n"
					+"1. Si\n"+"2. No\n");
			int op = Integer.parseInt(this.br.readLine());
			if (op == 1) {
				System.out.println("Ingrese la fecha de Fin del Proyecto:(yyyy-mm-dd)");
				String fecha_final = this.br.readLine();
				this.proyecto = new Proyecto(nombre, descripcion,fecha_inicio,fecha_final);
			}else if (op == 2){
				this.proyecto = new Proyecto(nombre, descripcion,fecha_inicio,fecha_inicio);
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//------------------------------------------
	public void ejecutar_modificarfechafinal_proyecto() {
		try {
			System.out.println("Ingrese la fecha de Fin del Proyecto:(yyyy-mm-dd)");
			String fecha_final = this.br.readLine();
			this.proyecto.setFecha_final(fecha_final);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
//------------------------------------------
	public void ejecutar_agregar_participante() {
		try {
			System.out.println("Nombre del Participante a Agregar: ");
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
			System.out.println("Nombre del Participante a Eliminar: ");
			String nombre = this.br.readLine();
			
			this.proyecto.eliminar_participante(nombre);	
			System.out.println("Nombre del Participante: ");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//------------------------------------------	
	public void mostra_info() {
		System.out.println("Info del Proyecto\n");
		
		System.out.printf("Nombre Proyecto: "+this.proyecto.getNombre()+"\n"
		+"Descripcion: "+this.proyecto.getDescripcion()+"\n");
		System.out.print("Fecha Inicio: "+this.proyecto.getFecha_inicio()+" \n");
		System.out.print("Fecha Final: "+this.proyecto.getFecha_final()+" \n");
		System.out.print("Participantes: "+this.proyecto.getParticipantes().keySet()+"\n");
		
		for (String key_participante : this.proyecto.getParticipantes().keySet() ) {
			
			Participante P = this.proyecto.getParticipantes().get(key_participante);
			System.out.print("\nNombre Participante: "+P.getNombre()+" |");
			System.out.print("Correo: "+P.getCorreo()+" |Dueño: "+P.getDueno()+"\n");
			System.out.print("Actividades:"+P.getActividades().keySet()+"\n");
			
		}
				
	}
//------------------------------------------	
	public void ejecutar_agregar_actividad(){
		
		try {
			System.out.print("Digite una opcion:\n"
					+"1. Agregar Actividad con fecha y hora de inicio por defecto\n"
					+"2. Agregar Actividad con fecha y hora de inicio modificados\n");
			int op = Integer.parseInt(this.br.readLine());
			
			if (op == 1) {
				
				System.out.print("Ingrese el nombre del participante autor de la Actividad: ");
				String autor = this.br.readLine();
				System.out.print("Ingrese el titulo de la Actividad: ");
				String titulo = this.br.readLine();
				System.out.print("Ingrese una descripcion de la Actividad: ");
				String descripcion = this.br.readLine();
				System.out.print("Ingrese de que tipo es la Actividad: ");
				String tipo = this.br.readLine();
				System.out.print("Ingrese la hora final de la Actividad:(hh:mm:ss) ");
				String hora_final = this.br.readLine();
				
				this.proyecto.getParticipantes().get(autor).agregar_actividadActividad_valorespordefecto(titulo,
						descripcion,autor,tipo,hora_final);
			}
			else if (op == 2){
				
				System.out.print("Ingrese el nombre del participante autor de la Actividad: ");
				String autor = this.br.readLine();
				System.out.print("Ingrese el titulo de la Actividad: ");
				String titulo = this.br.readLine();
				System.out.print("Ingrese una descripcion de la Actividad: ");
				String descripcion = this.br.readLine();
				System.out.print("Ingrese de que tipo es la Actividad: ");
				String tipo = this.br.readLine();
				System.out.print("Ingrese la fecha de la Actividad: ");
				String fecha = this.br.readLine();
				System.out.print("Ingrese la hora Inicial de la Actividad:(hh:mm:ss)");
				String hora_inicio = this.br.readLine();
				System.out.print("Ingrese la hora final de la Actividad:(hh:mm:ss)");
				String hora_final = this.br.readLine();
				
				this.proyecto.getParticipantes().get(autor).agregar_actividadActividad_valoresmodificados(titulo, 
						descripcion, autor, tipo, fecha, hora_inicio, hora_final);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
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
						+ "2. Modificar Fecha Final del Proyecto\n"
						+ "3. Agregar Participantes\n"
						+ "4. Eliminar Participantes\n"
						+ "5. Mostrar Info del Proyecto\n"
						+ "6. Regsitar Activdidad\n"
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
					ejecutar_modificarfechafinal_proyecto();
				}
				else if(op == 3){
					ejecutar_agregar_participante();
				}
				else if(op == 4){
					ejecutar_eliminar_participante();
				}
				else if(op == 5){
					mostra_info();
				}
				else if(op == 6){
					ejecutar_agregar_actividad();
				}
				else if(op == 7){
	
				}
				else if(op == 8){
					
				}
			}while(op != 0);
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
