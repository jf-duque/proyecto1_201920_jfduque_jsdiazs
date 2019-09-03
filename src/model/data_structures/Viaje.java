package model.data_structures;

public class Viaje {
	
	public int sourceid;
	public int dstid;
	public int dow;
	public double mean_travel_time;
	public double standard_deviation_travel_time;
	public double geometric_mean_travel_time;
	public double geometric_standard_deviation_travel_time;
	
	public Viaje(int sourceid, int dstid, int dow, double mean_travel_time, double standard_deviation_travel_time,
			double geometric_mean_travel_time, double geometric_standard_deviation_travel_time) {
		super();
		this.sourceid = sourceid;
		this.dstid = dstid;
		this.dow = dow;
		this.mean_travel_time = mean_travel_time;
		this.standard_deviation_travel_time = standard_deviation_travel_time;
		this.geometric_mean_travel_time = geometric_mean_travel_time;
		this.geometric_standard_deviation_travel_time = geometric_standard_deviation_travel_time;
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
