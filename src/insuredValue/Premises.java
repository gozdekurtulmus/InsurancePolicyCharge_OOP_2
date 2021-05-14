package insuredValue;

public class Premises extends InsuredValue {
	private String premisesCity;
	private int numberOfFloors;
	private int yearOfC;
	private String typeOfC;
	private double surfaceArea;
	RiskFactorValues values = rfcValues;
	
	public Premises (String number, int year, String city, int floors, int yearOfC, String typeOfC, double area) {
		
		super(number,year);
		this.premisesCity = city;
		this.numberOfFloors = floors;
		this.yearOfC = yearOfC;
		this.typeOfC = typeOfC;
		this.surfaceArea = area;
		
	}
	
	public double calculateRiskFactor() {
		double[] rfv = values.rfvForPremises(premisesCity, numberOfFloors, yearOfC, typeOfC);
		return rfv[0]* rfv[1] * rfv[2] * rfv[3] * surfaceArea ; 
	}

	public String getPremisesCity() {
		return premisesCity;
	}

	public void setPremisesCity(String premisesCity) {
		this.premisesCity = premisesCity;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getYearOfC() {
		return yearOfC;
	}

	public void setYearOfC(int yearOfC) {
		this.yearOfC = yearOfC;
	}

	public String getTypeOfC() {
		return typeOfC;
	}

	public void setTypeOfC(String typeOfC) {
		this.typeOfC = typeOfC;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
}
