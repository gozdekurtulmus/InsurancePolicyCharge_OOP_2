package insurance;

import insuredValue.InsuredValue;

public class Household extends Insurance {

	public Household() {}
	
	public double calculatePolicyCharge(InsuredValue insuredValue) {
		double riskFactor = super.calculatePolicyCharge(insuredValue);
		double policyCharge =  fixedFee() * Math.pow(riskFactor,2);
		if(insuredValue.insuranceRank() > 2) {
			return policyCharge * 9/10;
		}
		else {
			return policyCharge;
		}
	}
	
}
