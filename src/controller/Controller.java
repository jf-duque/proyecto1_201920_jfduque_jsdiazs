package controller;

import java.util.Scanner;

import model.logic.MVCModelo;
import view.MVCView;

public class Controller {

	/* Instancia del Modelo*/
	private MVCModelo modelo;
	
	/* Instancia de la Vista*/
	private MVCView view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new MVCView();
		modelo = new MVCModelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		String dato = "";
		String respuesta = "";

			view.printMenu();

			int option = lector.nextInt();
			modelo.leerArchivo(option);
			printMenu1();
		
	}	
	
	public void printMenu1()
	{
		
		Scanner lector = new Scanner(System.in);
		String dato = "";
		String respuesta = "";
		view.printMenu1();
			
			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printZonaOrigen();
					Scanner lectorZO = new Scanner(System.in);
					int zonaO = lectorZO.nextInt();
					view.printZonaDestino();
					Scanner lectorZD = new Scanner(System.in);
					int zonaD = lectorZD.nextInt();
					view.printDiaSemana();
					Scanner lectorDia = new Scanner(System.in);
					int dia = lectorDia.nextInt();
					
					modelo.consultarTPyDE(zonaO, zonaD, dia);
					break;
					
				case 2:
					view.printCantidadViajes();
					Scanner lectorNV = new Scanner(System.in);
					int n = lectorNV.nextInt();
					//modelo.consultarInfoNVMTP(n);
					break;

				default: 
					System.out.println("--------- \n Opcion Invalida !! \n---------");
					break;
					
				
			}
	}
}
