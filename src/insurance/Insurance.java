package insurance;

import insuredValue.InsuredValue;

public class Insurance { 

	public Insurance() { }
	
	public double calculatePolicyCharge(InsuredValue insuredValue) {
		return insuredValue.calculateRiskFactor();
	}

	public double fixedFee(){
		return 2500;//(int) (Math.random() *3000) + 1000;
	}
	
}
