package insuredValue;

public class RiskFactorValues {
	
	public RiskFactorValues() {}
	
	public double[] rfvForPremises(String city, int floors, int year, String type ) {
	double[] returnArray = new double[4];

	double value = switch (city) {
		case "Izmir" -> 0.4;
		case "Istanbul" -> 0.6;
		case "Ankara" -> 0.15;
		default -> 0.25;
	};
		returnArray[0] = value;
	
	if (floors >=1 && floors <=3 ) {value = 0.1;}
	else if (floors>=4 && floors <=7) {value = 0.25;}
	else if (floors>=7 && floors<=18) {value = 0.5;}
	else {value = 0.85;}
	
	returnArray[1] = value;
	
	if(year < 1975) {value = 0.58;}
	else if ( year<1999) {value = 0.32;}
	else  { value= 0.1;}
	
	returnArray[2] = value;

		value = switch (type) {
			case "steel" -> 0.1;
			case "concrete" -> 0.37;
			case "wood" -> 0.58;
			default -> 0.92;
		};
	returnArray[3] = value;
	
	return returnArray;
		
	}
	
	public double rfvForPerson(String illness) {

		return switch (illness) {
			case "cardiovascular" -> 1.85;
			case "diabetes" -> 1.84;
			case "respiratory" -> 1.86;
			case "none" -> 0.1;
			default -> 1.8;
		};
	
	}
	
	public double residentSituation (String resident) {

		return switch (resident) {
			case "tenant" -> 0.18;
			case "landlord" -> 0.42;
			default -> 0;
		};
			
	}
	
	public double[] rfvForVehicle(String city, String gear) {
		
		double[] returnArray = new double[2];
		double value = switch (city) {
			case "Izmir" -> 0.78;
			case "Istanbul" -> 0.97;
			case "Ankara" -> 0.85;
			default -> 0.65;
		};

		returnArray[0] = value;

		switch (gear) {
			case "manual" -> value = 0.47;
			case "automatic" -> value = 0.98;
		}
		returnArray[1] = value;
		
		return returnArray;	
	}
	
	public double roof(String roof) {

		return switch (roof) {
			case "regular" -> 0.1;
			case "sunroof" -> 0.64;
			case "moonroof" -> 0.48;
			default -> -1;
		};
		
	}
	
	public double truckbed(String bed) {

		return switch (bed) {
			case "trailer" -> 0.87;
			case "tanker" -> 0.84;
			case "regular" -> 0.15;
			default -> -1;
		};
		
	}
}
