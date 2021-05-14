package insuredValue;

public class Vehicle extends InsuredValue{
	private String plateCity;
	private double engineVolume;
	private int yearOfProduction;
	private String gear;
	private int fuelTankVolume;	
	RiskFactorValues values = rfcValues;
	
	
	public Vehicle(String number, int year, String city, double volume, int yProduction, String gear, int fuelVolume) {
		super(number,year);
		this.plateCity = city;
		this.engineVolume = volume;
		this.yearOfProduction = yProduction;
		this.gear = gear;
		this.fuelTankVolume = fuelVolume;
		
	}
	public double calculateRiskFactor() {
		double[] rfvList = values.rfvForVehicle(plateCity, gear);
		return engineVolume* rfvList[0] * 0.03;
	}
	
	public int getFuelVolume() {
		return this.fuelTankVolume;
	}
	
	public int getAge() {
		return 2020 - this.yearOfProduction;
	}

	public String getPlateCity() {
		return plateCity;
	}

	public void setPlateCity(String plateCity) {
		this.plateCity = plateCity;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public int getFuelTankVolume() {
		return fuelTankVolume;
	}

	public void setFuelTankVolume(int fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
}
