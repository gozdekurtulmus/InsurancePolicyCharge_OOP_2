package calculatorApp;

import insuredValue.*;
import fileIO.*;
import java.util.ArrayList;

public class PolicyRecord {
	private ArrayList<InsuredValue> workplaceArray = new ArrayList<>();
	private ArrayList<InsuredValue> householdArray = new ArrayList<>();
	private ArrayList<InsuredValue> personArray = new ArrayList<>();
	private ArrayList<InsuredValue> automobileArray = new ArrayList<>();
	private ArrayList<InsuredValue> truckArray = new ArrayList<>();

	public PolicyRecord() {
		fillArrays("src/fileIO/HW2_InsuredValues.csv");
	}
	

	public ArrayList<InsuredValue> getWorkplaceArray() {
		return workplaceArray;
	}

	public ArrayList<InsuredValue> getHouseholdArray() {
		return householdArray;
	}

	public ArrayList<InsuredValue> getPersonArray() {
		return personArray;
	}

	public ArrayList<InsuredValue> getAutomobileArray() {
		return automobileArray;
	}

	public ArrayList<InsuredValue> getTruckArray() {
		return truckArray;
	}
	
	
	public void fillArrays(String fileName) {
		FileIO read = new FileIO();
		String[][] readArray = read.readToArray(fileName);
		for(String[] element : readArray) {
			switch (element[0].charAt(0)) {
				case 'A' -> automobileArray.add(new Automobile(element));
				case 'H' -> householdArray.add(new Housing(element));
				case 'P' -> personArray.add(new Person(element));
				case 'T' -> truckArray.add(new Truck(element));
				case 'W' -> workplaceArray.add(new Workplace(element));
			}
		}
	}
	
}