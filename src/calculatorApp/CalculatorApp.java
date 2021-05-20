package calculatorApp;

import java.util.ArrayList;
import java.util.Scanner;
import insuredValue.*;
import insurance.*;


public class CalculatorApp {
	private PolicyRecord record;
	private String[] printPrp =  {"Insured Value: ", "Insurance Number: ", "Year of Insurance: "};
	
	public CalculatorApp() {
		record = new PolicyRecord();
	}
	
	public void start() {
		
		System.out.println("1 All insured values, 2 Workplaces, 3 Housings, 4 Persons, 5 Automobiles, 6 Trucks.");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your choice: ");
		int userChoice = input.nextInt();
		selectOperation(userChoice);
		input.close();
		
	}
	
	private void selectOperation(int userChoice) {
		switch (userChoice) {
			case 1 -> {
				printWorkplaces();
				printHousings();
				printPersons();
				printAutomobiles();
				printTrucks();
			}
			case 2 -> printWorkplaces();
			case 3 -> printHousings();
			case 4 -> printPersons();
			case 5 -> printAutomobiles();
			case 6 -> printTrucks();
		}
	}
		
	private void printWorkplaces() {
		ArrayList<InsuredValue> values = record.getWorkplaceArray();
		Insurance insurance = new Household();
		printProperly(values, "Workplace",policyCharges(insurance, values));
	}
	
	private void printHousings() {
		ArrayList<InsuredValue> values = record.getHouseholdArray();
		Insurance insurance = new Household();
		printProperly(values, "Housing", policyCharges(insurance, values));	
	}
	
	private void printPersons() {
		ArrayList<InsuredValue> values = record.getPersonArray();
		Insurance insurance = new Health();
		printProperly(values, "Person", policyCharges(insurance, values));	
	}
	
	private void printAutomobiles() {
		ArrayList<InsuredValue> values = record.getAutomobileArray();
		Insurance insurance = new Traffic();
		printProperly(values, "Automobile", policyCharges(insurance, values));	
	}
	
	private void printTrucks() {
		ArrayList<InsuredValue> values = record.getTruckArray();
		Insurance insurance = new Traffic();
		printProperly(values, "Truck", policyCharges(insurance, values));	
	}
	
	private void printProperly(ArrayList<InsuredValue> values, String category, ArrayList<Double> policyCharge) {
		int j=0;
		for(InsuredValue element : values) {
			int i=0;
			String[] properties = {category,element.getInsuranceNumber(), 
									 Integer.toString(element.getYearOfInsurance())};
			for(String str : printPrp) {
				System.out.print(str + properties[i] +",  ");
				if(i== 2) {
					System.out.print("\n" +  "The policy charge of " + element.getInsuranceNumber() + ": "+ String.format("%.2f", policyCharge.get(j)) + " TL." +"\n");
				}				
				i++;
			}
			j++;
		}
		System.out.println();	
	}
	
	private ArrayList<Double> policyCharges(Insurance insurance, ArrayList<InsuredValue> insuredList){
		ArrayList<Double> policyCharge = new ArrayList<>();
		for(InsuredValue element: insuredList) {
			policyCharge.add(insurance.calculatePolicyCharge(element));
		}
		return policyCharge;
		
	}
	

}
