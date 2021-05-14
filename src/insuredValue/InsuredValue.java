package insuredValue;

public class InsuredValue {

	private String insuranceNumber;
	private int yearOfInsurance;
	RiskFactorValues rfcValues = new RiskFactorValues();
	
	public InsuredValue(String number, int year) {
		this.insuranceNumber = number;
		this.yearOfInsurance = year;
		
	}
	
	public double calculateRiskFactor() {
		return 0;
	}

	public double insuranceRank(){
		return 2020 - yearOfInsurance;
	}
	
	public String getInsuranceNumber() {
		return this.insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public int getYearOfInsurance() {
		return this.yearOfInsurance;
	}

	public void setYearOfInsurance(int yearOfInsurance) {
		this.yearOfInsurance = yearOfInsurance;
	}

}
