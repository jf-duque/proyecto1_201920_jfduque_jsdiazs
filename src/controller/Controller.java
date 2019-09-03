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
			switch(option){
				case 1:
					modelo.leerArchivo(1);
					printMenu1();
					break;

				case 2:
					modelo.leerArchivo(2);	
					printMenu1();
					break;
	
				case 3:
					modelo.leerArchivo(3);	
					printMenu1();
					break;

				case 4:
					modelo.leerArchivo(4);	
					printMenu1();
					break;

				case 5: 
					
					break;	
					
				case 6: 

					break;	

				default: 
					System.out.println("--------- \n Opcion Invalida !! \n---------");
					break;
					
				
			}
		
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
					//modelo.consultarTPyDE();
					break;

				case 2:
					modelo.leerArchivo(2);	
					break;
	
				case 3:
					modelo.leerArchivo(3);	
					break;

				case 4:
					modelo.leerArchivo(4);	
					break;

				case 5: 
					
					break;	
					
				case 6: 

					break;	

				default: 
					System.out.println("--------- \n Opcion Invalida !! \n---------");
					break;
					
				
			}
	}
}
