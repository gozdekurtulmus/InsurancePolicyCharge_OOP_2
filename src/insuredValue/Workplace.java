package insuredValue;

public class Workplace extends Premises{

	private double annualRevenue;
	
	public Workplace(String[] properties) {
		super(properties[0], Integer.parseInt(properties[1]), properties[2], Integer.parseInt(properties[3]),
				Integer.parseInt(properties[4]), properties[5], Double.parseDouble(properties[6]));
		this.annualRevenue = Double.parseDouble(properties[7]);
	}

	public double calculateRiskFactor() {
		double value = super.calculateRiskFactor();
		return value * 0.2 * annualRevenue * 0.003 ; 
	}

	public double getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}
}
