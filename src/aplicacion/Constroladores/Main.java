package aplicacion.Constroladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import aplicacion.Entidades.LibrosDto;
import aplicacion.Servicios.ImplementacionConsultasBD;
import aplicacion.Servicios.ImplementacionMenu;
import aplicacion.Servicios.InterfazConsultasBD;
import aplicacion.Servicios.InterfazMenu;

/**
 * Clase por la que se entra a la aplicación que contiene el main. 
 * En ella solo estan definidos los pasos y el procedimiento de ejecución que sigue la aplicación.
 * @author ASMP-05/10/2023
 *
 */
public class Main {

	public static void main(String[] args) {
		
		InterfazMenu menu=new ImplementacionMenu();
		InterfazConsultasBD consul=new ImplementacionConsultasBD();
		
		List<LibrosDto> bd=new ArrayList<>();
		
		Boolean cerrarMenu = false; 
		
		 int opcion=0;
	
				while(!cerrarMenu) 
				{	
					try {
						 Scanner preguntar=new Scanner(System.in);
						//Mostramos el menú
						menu.Menu();
						System.out.println("Introduza la opción deseada: ");
						opcion = preguntar.nextInt();
						if(opcion>=0 && opcion<=4)
						{
							System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
						}
						//Llama a insertar a la base de datos
						//select a la base de datos
						//Actualiza la base de datos
						//Elimina en la base de datos
						switch (opcion) 
						{			
							case 1:
								consul.ModificarEnBBDD(0);
								break;
								
							case 2:
								bd=consul.SeleccionarEnBBDD(false);
								break;
								
							case 3:
								consul.ModificarEnBBDD(2);
								break;
							
							case 4:
								consul.ModificarEnBBDD(1);
								break;
							case 0:
								JOptionPane.showMessageDialog(null,"¡Gracias por visitar nuestra Empresa!");
								cerrarMenu = true;
								break;
							default:
								System.err.println("Solo se puede del 0 al 3");
						}
				}catch(Exception e) {
					System.err.println("[ERROR] Se ha surgido otro error");

				 }
					
				}
	}

}
