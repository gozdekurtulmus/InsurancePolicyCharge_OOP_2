package insuredValue;

public class Truck extends Vehicle {
	private String truckBed;
	
	public Truck(String[] properties) {
		super(properties[0],Integer.parseInt(properties[1]), properties[2], Double.parseDouble(properties[3]),
				Integer.parseInt(properties[4]), properties[5], Integer.parseInt(properties[6]));
		this.truckBed = properties[7];		
	}
	
	public double calculateRiskFactor() { 
		double value = super.calculateRiskFactor();
		return ((Math.pow(getAge(),3) / (0.008 * getFuelVolume())) * value )/ Math.pow(values.truckbed(truckBed),2);
	}

	public String getTruckBed() {
		return truckBed;
	}

	public void setTruckBed(String truckBed) {
		this.truckBed = truckBed;
	}
}
