package consola;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class consola {
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//------------------------------------------
	public static void main(String[] args) {
		consola c = new consola();
		c.ejecutar_Aplicacion();
	}
//------------------------------------------
	private void mostrar_menu(){
		System.out.println("Digite una opcion:\n"
						+ "1. Crear Proyecto"
						+ "2. Agregar Participantes"
						+ "3. Eliminar Participantes"
						+ "4. Regsitar Activdidad"
						+ "5. Hacer commit dentro de una actividad"
						+ "6. Realizar Reporte"
						+ "7. Cronometrar Actividad"
						+ "0. Salir");
	}
	
	private void ejecutar_Aplicacion(){
		try {
			int op;
			do {
				mostrar_menu();
				op = Integer.parseInt(this.br.readLine()); 
				if(op == 1) {
					
				}
				else if(op == 2){
					
				}
				else if(op == 3){
					
				}
				else if(op == 4){
					
				}
				else if(op == 5){
					
				}
				else if(op == 2){
					
				}
				else if(op == 2){
	
				}
			}while(op != 0);
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
