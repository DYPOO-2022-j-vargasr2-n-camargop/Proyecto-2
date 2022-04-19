package logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



public class ManejadorArchivos {

	
private static String rutaAct = "infoactividades.csv";
private static String rutaPar = "infoparticipantes.csv";
private static String rutaProy = "infoproyect.csv";


/////////////////////////////////////////////////////////////////////


	public void guardar_proyecto(Proyecto proyecto) {
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(rutaProy));
			
			String nombre = proyecto.getNombre();
			String descripcion = proyecto.getDescripcion();
			String fecha_inicio = proyecto.getFecha_inicio().toString();
			String fecha_final = proyecto.getFecha_final().toString();
			writer.write(nombre+","+descripcion+","+fecha_inicio+","+fecha_final);
			
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void guardar_participantes(Proyecto proyecto) {
	
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(rutaPar));
			
			for (String key_name : proyecto.getParticipantes().keySet()) {
				
				Participante P = proyecto.getParticipantes().get(key_name);		
				
				writer.write(P.getNombre()+","+P.getCorreo()+","+P.getDueno().toString());
				writer.newLine();
			}
			
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	public void guardar_actividades(Proyecto proyecto) {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(rutaAct));
			
			for (String key_name : proyecto.getParticipantes().keySet()) {
				
				Participante P = proyecto.getParticipantes().get(key_name);
				
				for (String key_Acti : P.getActividades().keySet()){
					
					for (Actividad Acti : P.getActividades().get(key_Acti)) {
				
						writer.write(Acti.getTitulo()+","+Acti.getDescripcion()+","+Acti.getAutor()+
					","+Acti.getTipo()+","+Acti.getFecha().toString()+","+Acti.getHora_inicio().toString()
					+","+Acti.getHora_final().toString()+","+Acti.getTiempo_invertido().toString());
						writer.newLine();
						
					}
				}
			}
			
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
/////////////////////////////////////////////////////////////////////
	
	
	public Proyecto leer_proyecto(Proyecto proyecto){
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(rutaProy));
			
			String linea;
			while((linea=br.readLine())!=null) {
				String []datos = linea.split(",");
				
				proyecto = new Proyecto(datos[0], datos[1], datos[2], datos[3]);
				
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return proyecto;
		
	}
	
	public void leer_participantes(Proyecto proyecto) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(rutaPar));
			
			String linea;
			while((linea=br.readLine())!=null) {
				String []datos = linea.split(",");
				
				proyecto.agregar_participante(datos[0], datos[1]);
				proyecto.getParticipantes().get(datos[0]).setDueño(datos[2]);
				
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void leer_actividades(Proyecto proyecto) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(rutaAct));
			
			String linea;
			while((linea=br.readLine())!=null) {
				String []datos = linea.split(",");
				
				proyecto.getParticipantes().get(datos[2]).agregar_actividadActividad_valoresmodificados(datos[0],
						datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
				
				
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	
}
