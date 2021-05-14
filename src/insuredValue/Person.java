package insuredValue;

public class Person extends InsuredValue {

	private String residenceCity, name, nationalID, gender;
	private int birthYear;
	private String illness;
	
	public Person(String[] properties) {
		super(properties[0], Integer.parseInt(properties[1]));
		this.residenceCity = properties[2];
		this.name = properties[3];
		this.nationalID = properties[4];
		this.gender = properties[5];
		this.birthYear = Integer.parseInt(properties[6]);
		this.illness = properties[7];
	}
	
	public double calculateRiskFactor() {
		return Math.pow((2020 - birthYear),2) / (rfcValues.rfvForPerson(illness)   * 18) ;
	}

	public String getResidenceCity() {
		return residenceCity;
	}

	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}
}
