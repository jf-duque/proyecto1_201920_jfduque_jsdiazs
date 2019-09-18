package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.opencsv.CSVReader;

import model.data_structures.DinamicArray;
import model.data_structures.DinamicArrayIterator;
import model.data_structures.IDinamicArray;
import model.data_structures.LinkedQueue;
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
	private DinamicArray<Viaje> viajes;
	private DinamicArray<Viaje> listaMes;
	private LinkedQueue<Viaje> lista;
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
	
	private int trimestre;
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public MVCModelo()
	{
		viajes = new DinamicArray<Viaje>();
		listaMes = new DinamicArray<Viaje>();
		lista = new LinkedQueue<Viaje>();
		trimestre = 0;

	}
	
	public void CSVreaderHour(int pTrimestre)
	{
		if(pTrimestre > 4)
		{
			System.out.print("Numero de trimestre inválido ");
		}
		else
		{
			trimestre = pTrimestre;
			CSVReader reader = null;
			try {
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-" + pTrimestre + "-All-HourlyAggregate.csv"));			
				String[] nextline = reader.readNext();
				nextline = reader.readNext();
				int n = 0;
				while(nextline != null)
				{					
					int   sourceid = Integer.parseInt(nextline[0]);
					int   dstid = Integer.parseInt(nextline[1]);
					int   dayHourMonth = Integer.parseInt(nextline[2]);
					float mean_travel_time = Float.parseFloat(nextline[3]);
					float standard_deviation_travel_time = Float.parseFloat(nextline[4]);
					float geometric_mean_travel_time = Float.parseFloat(nextline[5]);
					float geometric_standard_deviation_travel_time = Float.parseFloat(nextline[6]);
					n++;
					Viaje nuevo = new Viaje(sourceid, dstid, dayHourMonth, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
					lista.enqueue(nuevo);
					viajes.agregar(nuevo);

					nextline = reader.readNext();					
				}
				System.out.println("");
				System.out.println(FVERDECLARO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FVERDECLARO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
				zonaMenorId();
				zonaMayorId();
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
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-" + pTrimestre + "-WeeklyAggregate.csv"));			
				String[] nextline = reader.readNext();
				nextline = reader.readNext();
				int n = 0;
				while(nextline != null)
				{					
					int   sourceid = Integer.parseInt(nextline[0]);
					int   dstid = Integer.parseInt(nextline[1]);
					int   dayHourMonth = Integer.parseInt(nextline[2]);
					float mean_travel_time = Float.parseFloat(nextline[3]);
					float standard_deviation_travel_time = Float.parseFloat(nextline[4]);
					float geometric_mean_travel_time = Float.parseFloat(nextline[5]);
					float geometric_standard_deviation_travel_time = Float.parseFloat(nextline[6]);
					n++;
					Viaje nuevo = new Viaje(sourceid, dstid, dayHourMonth, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
					lista.enqueue(nuevo);
					viajes.agregar(nuevo);

					nextline = reader.readNext();					
				}
				System.out.println("");
				System.out.println(FVERDECLARO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FVERDECLARO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
				zonaMenorId();
				zonaMayorId();
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
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-" + pTrimestre + "-All-MonthlyAggregate.csv"));			
				String[] nextline = reader.readNext();
				nextline = reader.readNext();
				int n = 0;
<<<<<<< HEAD
				while(nextline != null )
=======
				while(nextline != null && n < 100)
>>>>>>> 7ed373e25a2dc89e837abede7e5d82df66412d5a
				{					
					int   sourceid = Integer.parseInt(nextline[0]);
					int   dstid = Integer.parseInt(nextline[1]);
					int   dayHourMonth = Integer.parseInt(nextline[2]);
					float mean_travel_time = Float.parseFloat(nextline[3]);
					float standard_deviation_travel_time = Float.parseFloat(nextline[4]);
					float geometric_mean_travel_time = Float.parseFloat(nextline[5]);
					float geometric_standard_deviation_travel_time = Float.parseFloat(nextline[6]);
					n++;
					Viaje nuevo = new Viaje(sourceid, dstid, dayHourMonth, mean_travel_time, standard_deviation_travel_time, geometric_mean_travel_time, geometric_standard_deviation_travel_time);
					lista.enqueue(nuevo);
					viajes.agregar(nuevo);
					nextline = reader.readNext();					
				}

				System.out.println("");
				System.out.println(FVERDECLARO + TBLANCO + "El trimestre elegio fue: 2018-" +  pTrimestre +  "." + FF + FF );
				System.out.println(FVERDECLARO + TBLANCO + "La cantidad de viajes fueron: "+ n + "." + FF + FF);
				zonaMenorId();
				zonaMayorId();
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



	public void consultarTPyDEMes(int pZonaO, int pZonaD, int pMes)
	{
		LinkedQueue listaAux = new LinkedQueue<Viaje>();
		DinamicArray aux = new DinamicArray<Viaje>();
		if(viajes.isEmpty())
		{
			System.out.println("La lista de viajes esta vacía.");
		}
		else
		{
			Iterator iter = lista.iterator();

			while(iter.hasNext())
			{
				Viaje actual = (Viaje)iter.next();

				if(actual.getHourDayMonth() == pMes && actual.getSourceid() == pZonaO && actual.getDstid() == pZonaD)
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
				System.out.println(FVERDECLARO + TBLANCO + "Tiempo promedio: " + actual.getMean_travel_time() + " || Desviación estandar: " + actual.getStandard_deviation_travel_time() + FF + FF);
			}

		}
	}


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

				if(actual.getHourDayMonth() == pDia && actual.getSourceid() == pZonaO && actual.getDstid() == pZonaD)
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
				System.out.println(FVERDECLARO + TBLANCO + "Tiempo promedio: " + actual.getMean_travel_time() + " || Desviación estandar: " + actual.getStandard_deviation_travel_time() + FF + FF);
			}

		}


	}
		

	public void ordenarPorTimepoPromedio(int pN, int pDia)
	{
		quickSort(viajes, 0, viajes.darTamano()-1);
		int cant = 0;
		for(int i = viajes.darTamano()-1; i >= 0 && cant < pN; i--)
		{
			if(viajes.darElemento(i).getHourDayMonth() ==  pDia)
			{
				cant++;
				Viaje act = viajes.darElemento(i);
				System.out.println(FVERDECLARO + TBLANCO + cant + ". Zona de origen: " + act.getSourceid() + "  || Zona destino: " + act.getDstid() + "  || T promeido: " + act.getMean_travel_time() + "  || D estadar: " + act.getStandard_deviation_travel_time() + FF + FF);			
			}
		}
	}

	public void zonaMenorId() 
	{
		Viaje menorZona = viajes.darElemento(1);
		for (int i = 0; i < viajes.darTamano(); i++) 
		{
			if(menorZona.compareTo(viajes.darElemento(i))==1)
			{
				menorZona=viajes.darElemento(i);
			}
		}
		System.out.println(FVERDECLARO + TBLANCO + "La zona con menor identificador es " + menorZona.getSourceid() + FF + FF);
	}

	public void zonaMayorId()
	{
		Viaje mayorZona = viajes.darElemento(1);
		for (int i = 0; i < viajes.darTamano(); i++) 
		{
			if(mayorZona.compareTo(viajes.darElemento(i))==-1)
			{
				mayorZona=viajes.darElemento(i);
			}
		}
		System.out.println(FVERDECLARO + TBLANCO + "La zona con mayor identificador es " + mayorZona.getSourceid() + FF + FF);
	}


	//---------------------------ORDENAMIENTO-----------------------------------------------
	//--------------------------------------------------------------------------------------

	public static void quickSort(DinamicArray arr, int start, int end)
	{

		int partition = partition(arr, start, end);

		if(partition-1>start) {
			quickSort(arr, start, partition - 1);
		}
		if(partition+1<end) {
			quickSort(arr, partition + 1, end);
		}
	}

	public static int partition(DinamicArray arr, int start, int end)
	{
		Viaje pivot = (Viaje) arr.darElemento(end);

		for(int i = start; i < end; i++){
			if(((Viaje) arr.darElemento(i)).getMean_travel_time() < pivot.getMean_travel_time()){
				Viaje temp = (Viaje) arr.darElemento(start);

				arr.set(start, arr.darElemento(i));
				arr.set(i, temp);
				start++;
			}
		}

		Viaje temp = (Viaje) arr.darElemento(start);
		arr.set(start, pivot);
		arr.set(end, temp);

		return start;
	}
	
	
	//----------------------------Funciones para hora------------------------------------------
	//-----------------------------------------------------------------------------------------
	
	public void consultarViajesFranjaH(int pZonaO, int pZonaD, int pHI, int pHF)
	{
		int cant = 0;
		for(int i = 0; i < viajes.darTamano(); i++)
		{
			Viaje act = viajes.darElemento(i);
			if((act.getSourceid() >= pZonaO) && (act.getDstid() <= pZonaD) && (act.getHourDayMonth() >= pHI) && (act.getHourDayMonth() <= pHF))
			{
				cant++;
				System.out.println(FVERDECLARO + TBLANCO + cant + ". Tiempo Promedio: " + act.getMean_travel_time() + " || Desviacion estandar: " + act.getStandard_deviation_travel_time() + FF + FF);
			}
		}
	}
	
	public void crearASCII(int pZonaO, int pZonaD)
	{
		System.out.println(FVERDECLARO + TBLANCO +"Aproximación en minutos de viajes entre zona origen y zona destino." + FF + FF);
		System.out.println(FVERDECLARO + TBLANCO +"Trimestre "+ trimestre +" del 2018 detallado por cada hora del día" + FF + FF);
		System.out.println(FVERDECLARO + TBLANCO + "Zona Origen "+ pZonaO + FF + FF);
		System.out.println(FVERDECLARO + TBLANCO + "Zona Destinio "+ pZonaD + FF + FF);
		System.out.println(FVERDECLARO + TBLANCO + "Hora |   # de minutos " + FF + FF);
		
		
		for(int i = 0; i < 24; i++)
		{
			System.out.print(FVERDECLARO + TBLANCO + i + "    |" + FF + FF);
			for(int j = 0; j < viajes.darTamano(); j++)
			{
				Viaje act = viajes.darElemento(j);
				if(act.getSourceid() >= pZonaO && act.getDstid() <= pZonaD && act.getHourDayMonth() == i)
				{
					int a = Math.round(act.getMean_travel_time());
					int minutos = a / 60;
					System.out.print(FVERDECLARO + TBLANCO + "   " + minutos + " " + FF + FF);
				}
			}
			System.out.println();
		}
		
	}

}
