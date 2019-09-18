package controller;

import java.util.Scanner;

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

	public void runHourWeekMonth()
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin )
		{
			view.HourWeekMonth();

			int option = lector.nextInt();
			switch(option){
			case 1:
				//runHour();
				break;
			case 2:
				runWeek();
				break;
			case 3:
				runMonth();
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

	public void runWeek() 
	{

		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";
		
		view.printTrimestre();
		int option = lector.nextInt();
		modelo.CSVreaderWeek(option);
		printMenu1();
	}	

	public void runMonth()	
	{
		
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";
		
		view.printTrimestre();
		int option = lector.nextInt();
		modelo.CSVreaderMonth(option);
		printMenu2();
	}	
	
	public void printMenu1()
	{
		view.funciones();
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";
		int option = lector.nextInt();
		switch(option)
		{
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
			view.funciones();
			break;

		case 2:
			view.printDia();
			Scanner lectorD = new Scanner(System.in);
			int d = lectorD.nextInt();
			view.printCantidadViajes();
			Scanner lectorNV = new Scanner(System.in);
			int n = lectorNV.nextInt();
			modelo.ordenarPorTimepoPromedio(n, d);
			break;

		default: 
			System.out.println("--------- \n Opcion Invalida !! \n---------");
			break;
		}
	}
	
	public void printMenu2()
	{
		view.funciones();
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";
		int option = lector.nextInt();
		switch(option)
		{
		case 1:
			view.printZonaOrigen();
			Scanner lectorZO = new Scanner(System.in);
			int zonaO = lectorZO.nextInt();
			view.printZonaDestino();
			Scanner lectorZD = new Scanner(System.in);
			int zonaD = lectorZD.nextInt();
			view.printMes();
			Scanner lectorMes = new Scanner(System.in);
			int mes = lectorMes.nextInt();					
			modelo.consultarTPyDEMes(zonaO, zonaD, mes);
			view.funciones();
			break;

		case 2:
			
			view.Advert();
			view.printMesSel();
			Scanner lectorD = new Scanner(System.in);
			int m = lectorD.nextInt();
			view.printCantidadViajes();
			Scanner lectorNV = new Scanner(System.in);
			int n = lectorNV.nextInt();
			modelo.ordenarPorTimepoPromedio(n, m);
			break;


		default: 
			System.out.println("--------- \n Opcion Invalida !! \n---------");
			break;
		}
	}
	
	
}

