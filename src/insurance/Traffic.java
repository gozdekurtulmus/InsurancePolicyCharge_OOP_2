package insurance;

import insuredValue.InsuredValue;

public class Traffic extends Insurance{
	
	public Traffic() {}
	
	
	public double calculatePolicyCharge(InsuredValue insuredValue) {
		double riskFactor = super.calculatePolicyCharge(insuredValue);
		double fixedFee = fixedFee();
		double policyCharge =  (fixedFee * 9/10) + (fixedFee * Math.sqrt(riskFactor));
		if(insuredValue.insuranceRank() > 1) {
			return policyCharge* 8/10;
		}
		else {
			return policyCharge;
		}
	}

}
