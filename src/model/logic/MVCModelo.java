package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public MVCModelo()
	{
		viajes = new DinamicArray<Viaje>();
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

	public void consultarTPyDE(int dia, int zonaO, int zonaD)
	{

	}


}
