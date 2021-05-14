package insurance;

import insuredValue.InsuredValue;

public class Health extends Insurance {
	
	public Health() {}

	public double calculatePolicyCharge(InsuredValue insuredValue) {
		double riskFactor = super.calculatePolicyCharge(insuredValue);
		double policyCharge = (fixedFee() * Math.pow(riskFactor,3)) / 208;

		if( riskFactor > 50 && insuredValue.insuranceRank() < 3) {
			return 1000000000;
		}
		else {
			return policyCharge;
		}
	}
	
	
}
