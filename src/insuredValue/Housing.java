package insuredValue;

public class Housing extends Premises {
	private String residentSituation;
	
	public Housing(String[] properties) {
		super(properties[0], Integer.parseInt(properties[1]), properties[2], Integer.parseInt(properties[3]),
					Integer.parseInt(properties[4]), properties[5], Double.parseDouble(properties[6]));
		this.residentSituation = properties[7];
	}

	public double calculateRiskFactor() {
		double value = super.calculateRiskFactor();
		return value / values.residentSituation(residentSituation) ; 
	}

	public String getResidentSituation() {
		return residentSituation;
	}

	public void setResidentSituation(String residentSituation) {
		this.residentSituation = residentSituation;
	}
}
