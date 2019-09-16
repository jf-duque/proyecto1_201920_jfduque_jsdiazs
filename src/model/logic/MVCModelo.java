package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import com.opencsv.CSVReader;

import model.data_structures.DinamicArray;
import model.logic.Viaje;

/**
 * Definicion del modelo del mundo
 *
 */
public class MVCModelo 
{
	/**
	 * Atributos del modelo del mundo
	 */
<<<<<<< HEAD
	private IArregloDinamico datos;
	
	private LinkedQueue lista;
	
	private LinkedQueue listaAuxiliar;
	
	 private static String TBLANCO="\u001b[1;37m";
	 private static String TROJO="\u001b[1;31m";
	 private static String TVERDECLARO="\u001b[1;32m";
	 private static String TAMARILLO="\u001b[1;33m";
	 private static String TAZUL="\u001b[1;34m";
	 private static String TROSA="\u001b[1;35m";
	 private static String TAZULCLARO="\u001b[1;36m";
	 
	 private static String FBLANCO="\u001b[1;47m";
	 private static String FROJO="\u001b[1;41m";
	 private static String FVERDECLARO="\u001b[1;42m";
	 private static String FAMARILLO="\u001b[1;43m";
	 private static String FAZUL="\u001b[1;44m";
	 private static String FROSA="\u001b[1;45m";
	 private static String FAZULCLARO="\u001b[1;46m";
	 private static String FNEGRO="\u001b[1;40m";
	 
	 private static String FF="\u001b[0m";
	 
	 private Viaje viajeMayorParcial;
	 
	 private double mayorParcial;
=======
	private DinamicArray<Viaje> viajes;

	private static String TBLANCO="\u001b[1;37m";
	private static String TROJO="\u001b[1;31m";
	private static String TVERDECLARO="\u001b[1;32m";
	private static String TAMARILLO="\u001b[1;33m";
	private static String TAZUL="\u001b[1;34m";
	private static String TROSA="\u001b[1;35m";
	private static String TAZULCLARO="\u001b[1;36m";

	private static String FBLANCO="\u001b[1;47m";
	private static String FROJO="\u001b[1;41m";
	private static String FVERDECLARO="\u001b[1;42m";
	private static String FAMARILLO="\u001b[1;43m";
	private static String FAZUL="\u001b[1;44m";
	private static String FROSA="\u001b[1;45m";
	private static String FAZULCLARO="\u001b[1;46m";
	private static String FNEGRO="\u001b[1;40m";

	private static String FF="\u001b[0m";
>>>>>>> 68cf0d1adfe5b2fee0e9557996a28eff847f2a8e
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public MVCModelo()
	{
<<<<<<< HEAD
		datos = new ArregloDinamico(7);
		lista = new LinkedQueue<Viaje>();
		listaAuxiliar = new LinkedQueue<Viaje>();
		viajeMayorParcial = null;
		mayorParcial = 0;
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public MVCModelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
=======
		viajes = new DinamicArray<Viaje>();
>>>>>>> 68cf0d1adfe5b2fee0e9557996a28eff847f2a8e
	}

	public void CSVreaderHour(int pTrimestre)
	{
		if(pTrimestre > 4)
		{
			System.out.print("Numero de trimestre inválido ");
		}
		else
		{

			CSVReader reader = null;
			try {
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-"+pTrimestre+"-All-HourlyAggregate.csv"));			
				String[] nextline = reader.readNext();
				nextline = reader.readNext();
				int n = 0;
				while(nextline != null)
				{					
					int    sourceid = Integer.parseInt(nextline[0]);
					int    dstid = Integer.parseInt(nextline[1]);
					int    dayHourMonth = Integer.parseInt(nextline[2]);
					float mean_travel_time = Float.parseFloat(nextline[3]);
					float standard_deviation_travel_time = Float.parseFloat(nextline[4]);
					float geometric_mean_travel_time = Float.parseFloat(nextline[5]);
					float geometric_standard_deviation_travel_time = Float.parseFloat(nextline[6]);
					n++;
					Viaje nuevo = new Viaje(sourceid, dstid, dayHourMonth, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
					viajes.agregar(nuevo);
					nextline = reader.readNext();	
				}
				System.out.println("");
				System.out.println(FNEGRO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FNEGRO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
				System.out.println("");
				reader.close();

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void CSVreaderWeek(int pTrimestre)
	{
		if(pTrimestre > 4)
		{
			System.out.print("Numero de trimestre inválido ");
		}
		else
		{

			CSVReader reader = null;
			try {
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-"+pTrimestre+"-All-WeeklyAggregate.csv"));			
				String[] nextline = reader.readNext();
				nextline = reader.readNext();
				int n = 0;
				while(nextline != null)
				{					
					int    sourceid = Integer.parseInt(nextline[0]);
					int    dstid = Integer.parseInt(nextline[1]);
					int    dayHourMonth = Integer.parseInt(nextline[2]);
					float mean_travel_time = Float.parseFloat(nextline[3]);
					float standard_deviation_travel_time = Float.parseFloat(nextline[4]);
					float geometric_mean_travel_time = Float.parseFloat(nextline[5]);
					float geometric_standard_deviation_travel_time = Float.parseFloat(nextline[6]);
					n++;
					Viaje nuevo = new Viaje(sourceid, dstid, dayHourMonth, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
					//lista.enqueue(nuevo);

					nextline = reader.readNext();					
				}
				System.out.println("");
				System.out.println(FNEGRO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FNEGRO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
				System.out.println("");
				reader.close();

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void CSVreaderMonth(int pTrimestre)
	{
		if(pTrimestre > 4)
		{
			System.out.print("Numero de trimestre inválido ");
		}
		else
		{
			CSVReader reader = null;
			try {
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-"+pTrimestre+"-All-MonthlyAggregate.csv"));			
				String[] nextline = reader.readNext();
				nextline = reader.readNext();
				int n = 0;
				
				//Debido a la memoria limitada de java solo guarda 3238053 viajes.
				
				while(nextline != null && n < 100)
				{					
<<<<<<< HEAD
						int    sourceid = Integer.parseInt(nextline[0]);
						int    dstid = Integer.parseInt(nextline[1]);
						int    dow = Integer.parseInt(nextline[2]);
						double mean_travel_time = Double.parseDouble(nextline[3]);
						double standard_deviation_travel_time = Double.parseDouble(nextline[4]);
						double geometric_mean_travel_time = Double.parseDouble(nextline[5]);
						double geometric_standard_deviation_travel_time = Double.parseDouble(nextline[6]);	
						n++;
						Viaje nuevo = new Viaje(sourceid, dstid, dow, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
						lista.enqueue(nuevo);
						//System.out.println(FVERDECLARO + TBLANCO + n + FF + FF);

						nextline = reader.readNext();					
				}
				System.out.println("");
				System.out.println(FVERDECLARO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FVERDECLARO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
=======
					int    sourceid = Integer.parseInt(nextline[0]);
					int    dstid = Integer.parseInt(nextline[1]);
					int    dayHourMonth = Integer.parseInt(nextline[2]);
					float mean_travel_time = Float.parseFloat(nextline[3]);
					float standard_deviation_travel_time = Float.parseFloat(nextline[4]);
					float geometric_mean_travel_time = Float.parseFloat(nextline[5]);
					float geometric_standard_deviation_travel_time = Float.parseFloat(nextline[6]);
					n++;
					Viaje nuevo = new Viaje(sourceid, dstid, dayHourMonth, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
					//lista.enqueue(nuevo);

					nextline = reader.readNext();					
				}
				System.out.println("");
				System.out.println(FNEGRO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FNEGRO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
				System.out.println(FNEGRO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
>>>>>>> 68cf0d1adfe5b2fee0e9557996a28eff847f2a8e
				System.out.println("");
				reader.close();

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
<<<<<<< HEAD
	
	public void consultarTPyDE(int pZonaO, int pZonaD, int pDia)
	{
		LinkedQueue listaAux = new LinkedQueue<Viaje>();
		if(lista.isEmpty())
		{
			System.out.println("La lista de viajes esta vacía.");
		}
		else
		{
			Iterator iter = lista.iterator();
			
			while(iter.hasNext())
			{
				Viaje actual = (Viaje)iter.next();
				
				if(actual.getDow() == pDia && actual.getSourceid() == pZonaO && actual.getDstid() == pZonaD)
				{
					listaAux.enqueue(actual);
				}
			}
		}
		
		if(listaAux.isEmpty())
		{
			System.out.println("");
			System.out.println(FROJO + TBLANCO + "No hay vijaes para los datos especificados." + FF + FF);
		}
		else
		{
			System.out.println("");
			Iterator iter2 = listaAux.iterator();
			while(iter2.hasNext())
			{
				Viaje actual = (Viaje)iter2.next();
				System.out.println(FVERDECLARO + TBLANCO + "Tiempo promedio: " + + actual.getMean_travel_time() + " || Desviación estandar: " + actual.getStandard_deviation_travel_time() + FF + FF);
			}
		}
		
		
		
	}
	
	public void ordenarPorTiempoPromedio()
	{
		
	}
	
	//----------------------------------------------------------------------------
	
	/**
	public void consultarInfoNVMTP(int pNViajes)
	{
		Iterator iter = lista.iterator();
		double mayor = 0;
		Viaje nuevo = null;
		
		while(iter.hasNext()) 
		{
			Viaje actual = (Viaje)iter.next();
			if(actual.getMean_travel_time() > mayor)
			{
				mayor = actual.getMean_travel_time();
				nuevo = actual;
			}
		}
		
		listaAuxiliar.enqueue(nuevo);
		
		viajeMayorParcial = (Viaje)listaAuxiliar.getLast();
		 mayorParcial = viajeMayorParcial.getMean_travel_time();

		for(int i = 0; i < pNViajes; i++)
		{
			funcAux(mayorParcial);
		}
		
		Iterator iter2 = listaAuxiliar.iterator();
		
		while(iter2.hasNext())
		{
			Viaje actual = (Viaje)iter2.next();
			
			System.out.println(actual.getMean_travel_time());
		}
	}

	public void funcAux(double pMayorParcial)
	{
		Iterator iter = lista.iterator();
		double mayor = 0;
		Viaje nuevo = null;
		while(iter.hasNext()) 
		{
			Viaje actual = (Viaje)iter.next();
			if(actual.getMean_travel_time() > mayor && actual.getMean_travel_time() < mayorParcial)
			{
				mayorParcial = actual.getMean_travel_time();
				nuevo = actual;
			}
		}
		listaAuxiliar.enqueue(nuevo);
		//System.out.println(listaAuxiliar.size());
=======

	public void consultarTPyDE(int dia, int zonaO, int zonaD)
	{

>>>>>>> 68cf0d1adfe5b2fee0e9557996a28eff847f2a8e
	}
	*/
	//-----------------------------------------------------------------------


}
