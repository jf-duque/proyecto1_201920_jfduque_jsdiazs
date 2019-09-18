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
		 * El usuario seleccionara en que tipo de rango quiere recibir la información
		 */
	    public void HourWeekMonth()
		{
			System.out.println("Elegir cómo quiere trabajar los datos:");
			System.out.println("1. por Hora");
			System.out.println("2. por Dia");
			System.out.println("3. por Mes");
			System.out.println("4. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
	    public void printTrimestre()
		{
			System.out.println("Elegir el trimestre del año:");
			System.out.println("1. 2018-1");
			System.out.println("2. 2018-2");
			System.out.println("3. 2018-3");
			System.out.println("4. 2018-4");
			System.out.println("5. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
		public void printMenu1()
		{
			System.out.println("Elegir la funcion:");
			System.out.println("1. Consultar timepo promedio de viaje y su desviación estandar.");
			System.out.println("2. Consultar la información de los viajes con mayor timpo promedio.");
			System.out.println("3. Comparar los tiempos prmedio de los viajes.");
			System.out.println("4. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
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
			System.out.print("Ingrese el día (siendo domingo = 1, lunes = 2, e.t.c): ");
		}
		//---------------------------------------------------------------------
		
		//menu para metodo consultar info n viajes con mayor tiempo primedio
		
		public void printDia()
		{
			System.out.print("Ingrese el día que desea consultar:");
		}
		public void printCantidadViajes()
		{
			System.out.print("Ingrese la canditad de viajes que desea consultar:");
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
