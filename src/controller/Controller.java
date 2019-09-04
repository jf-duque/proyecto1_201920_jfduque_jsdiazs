package controller;

import java.util.Scanner;

import model.data_structures.LinkedQueue;
import model.logic.MVCModelo;
import model.logic.Viaje;
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

	public void runMesDia()
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin )
		{
			view.mesOdia();

			int option = lector.nextInt();
			switch(option){
			case 1:
				runMes();
				break;
			case 2:
				runMes();
				break;
			case 3: 
				System.out.println("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	
			}
			fin=true;
		}
	}

	public void runDia() 
	{

		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				modelo.CSVreaderWeek(1);
				view.printMenu1();
				printMenu1();
				break;

			case 2:
				modelo.CSVreaderWeek(2);
				view.printMenu1();
				printMenu1();
				break;

			case 3:
				modelo.CSVreaderWeek(3);
				view.printMenu1();
				printMenu1();
				break;
			case 4:
				modelo.CSVreaderWeek(4);
				view.printMenu1();

				break;
			case 5: 
				System.out.println("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			}
			fin=true;
		}
	}	

	public void runMes() 
	{

		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				modelo.CSVreaderMonth(1);
				view.printMenu1();
				printMenu1();
				break;

			case 2:
				modelo.CSVreaderMonth(2);
				view.printMenu1();
				printMenu1();
				break;

			case 3:
				modelo.CSVreaderMonth(3);
				view.printMenu1();
				printMenu1();
				break;
			case 4:
				modelo.CSVreaderMonth(4);
				view.printMenu1();

				break;
			case 5: 
				System.out.println("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			}
			fin=true;
		}
	}	
	public void printMenu1() 
	{

		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){

			int option = lector.nextInt();
			switch(option){
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;

			case 4: 
				System.out.println("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			}
			fin=true;
		}
	}
}
