package insuredValue;

public class Automobile extends Vehicle{
	private String roofType;
	
	public Automobile(String[] properties) {
		super(properties[0],Integer.parseInt(properties[1]), properties[2], Double.parseDouble(properties[3]),
				Integer.parseInt(properties[4]), properties[5], Integer.parseInt(properties[6]));
		this.roofType = properties[7];		
	}
	
	public double calculateRiskFactor() { 
		double value = super.calculateRiskFactor();
		return (value * getFuelVolume() * 0.004 * getAge()) / values.roof(roofType);
	}

	public String getRoofType() {
		return roofType;
	}

	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}
}
