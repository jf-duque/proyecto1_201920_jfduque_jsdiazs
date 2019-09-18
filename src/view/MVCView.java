package view;

import model.logic.MVCModelo;

public class MVCView 
{
	    /**
	     * Metodo constructor
	     */
	    public MVCView()
	    {
	    	
	    }
	    
		/**
		 * El usuario seleccionara en que tipo de rango quiere recibir la informaci�n
		 */
	    public void HourWeekMonth()
		{
			System.out.println("Elegir c�mo quiere trabajar los datos:");
			System.out.println("1. por Hora");
			System.out.println("2. por Dia");
			System.out.println("3. por Mes");
			System.out.println("4. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
	    public void printTrimestre()
		{
			System.out.println("Elegir el trimestre del a�o:");
			System.out.println("1. 2018-1");
			System.out.println("2. 2018-2");
			System.out.println("3. 2018-3");
			System.out.println("4. 2018-4");
			System.out.println("5. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
		public void funciones() // funciones lo modifique
		{
			System.out.println("Elegir la funcion:");
			System.out.println("1. Consultar tiempo promedio de viaje y su desviaci�n estandar.");
			System.out.println("2. Consultar la informaci�n de los viajes con mayor tiempo promedio.");
			System.out.println("3. Comparar los tiempos prmedio de los viajes.");
			System.out.println("4. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
		public void funcionesHour()
		{
			System.out.println("Elegir la funcion:");
			System.out.println("1. Consultar los viajes entre una zona de origen y una zona destino en una franja horaria.");
			System.out.println("2. Consultar la informaci�n de los N viajes con mayor tiempo promedio para una hora dada.");
			System.out.println("3. Generar una gr�fica ASCII.");
			System.out.println("4. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
		//Menus para funciones por hora
		
		public void printHoraI()
		{
			System.out.print("Ingrese la hora de inicio: ");
		}
		
		public void printHoraF()
		{
			System.out.print("Ingrese la hora final: ");
		}
		
		public void printHora()
		{
			System.out.print("Ingrese la hora: ");
		}
		
		//menu para el metodo consultar tiempo promedio y desviacion estandar
		public void printZonaOrigen()
		{
			System.out.print("Ingrese zona de origen: ");
		}
		public void printZonaDestino()
		{
			System.out.print("Ingrese zona de destino: ");
		}
		public void printDiaSemana()
		{
			System.out.print("Ingrese el d�a (siendo domingo = 1, lunes = 2, e.t.c): ");
		}
		
		public void printMes()
		{
			System.out.print("Ingrese el mes (siendo enero = 1, febrero = 2, e.t.c): ");
		}
		
		public void printHora()
		{
			System.out.println("Ingrese la hora (De 0 a 23 horas)");
		}
		//---------------------------------------------------------------------
		
		//menu para metodo consultar info n viajes con mayor tiempo primedio
		
		public void printDia()
		{
			System.out.print("Ingrese el d�a que desea consultar:");
		}
		public void printCantidadViajes()
		{
			System.out.print("Ingrese la canditad de viajes que desea consultar:");
		}	
		
		public void printMesSel()
		{
			System.out.print("Ingrese el mes que desea consultar:");
		}
		
		public void Advert()
		{
				System.out.println("Recuerde que el trimestre elegido afectara en los meses que puede seleccionar");
				System.out.println("2018-1 incluye los meses 1-3");
				System.out.println("2018-2 incluye los meses 4-6");
				System.out.println("2018-3 incluye los meses 7-9");
				System.out.println("2018-4 incluye los meses 10-12");
				System.out.println("");
		}
		
		//---------------------------------------------------------------------
		

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(MVCModelo modelo)
		{
			// TODO implementar
		}
}
