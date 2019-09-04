	
	package model.logic;

	public class Viaje 
	{
		//Identificador �nico de la zona de origen de los viajes relacionados
		public int sourceid;
		
		// Identificador �nico de la zona de destino de los viajes relacionados
		public int dstid;
		
		//n�mero del mes de los viajes relacionados
		public int month;
		
		//d�a de la semana de los viajes relacionados
		public int dow;
		
		//tiempo promedio en segundos de los viajes relacionados
		public double mean_travel_time;
		
		//desviaci�n est�ndar de los viajes relacionados
		public double standard_deviation_travel_time;
		
		//desviaci�n est�ndar de los viajes relacionados
		public double geometric_mean_travel_time;
		
		//desviaci�n est�ndar geom�trica de los viajes relacionados
		public double geometric_standard_deviation_travel_time;
		
		public Viaje(int pSourceid, int pDstid, int pMonth, int pDow, double pMean_travel_time, double pStandard_deviation_travel_time, double pGeometric_mean_travel_time, double pGeometric_standard_deviation_travel_time )
		{
			sourceid = pSourceid;
			dstid = pDstid;
			month=pMonth;
			dow=pDow;
			mean_travel_time = pMean_travel_time;
			standard_deviation_travel_time = pStandard_deviation_travel_time;
			geometric_mean_travel_time = pGeometric_mean_travel_time;
			geometric_standard_deviation_travel_time =pGeometric_standard_deviation_travel_time;
			
		}

		public int getSourceid() {
			return sourceid;
		}

		public void setSourceid(int sourceid) {
			this.sourceid = sourceid;
		}

		public int getDstid() {
			return dstid;
		}

		public void setDstid(int dstid) {
			this.dstid = dstid;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDow() {
			return dow;
		}

		public void setDow(int dow) {
			this.dow = dow;
		}

		public double getMean_travel_time() {
			return mean_travel_time;
		}

		public void setMean_travel_time(double mean_travel_time) {
			this.mean_travel_time = mean_travel_time;
		}

		public double getStandard_deviation_travel_time() {
			return standard_deviation_travel_time;
		}

		public void setStandard_deviation_travel_time(double standard_deviation_travel_time) {
			this.standard_deviation_travel_time = standard_deviation_travel_time;
		}

		public double getGeometric_mean_travel_time() {
			return geometric_mean_travel_time;
		}

		public void setGeometric_mean_travel_time(double geometric_mean_travel_time) {
			this.geometric_mean_travel_time = geometric_mean_travel_time;
		}

		public double getGeometric_standard_deviation_travel_time() {
			return geometric_standard_deviation_travel_time;
		}

		public void setGeometric_standard_deviation_travel_time(double geometric_standard_deviation_travel_time) {
			this.geometric_standard_deviation_travel_time = geometric_standard_deviation_travel_time;
		}
		
	}

