
public class Shipment {
	
	private double weight;
	private String address;
	
	public Shipment(double weight,String adress) {
		
		this.weight = weight;
		this.address  = adress;
	}
	
	public String toString() {
		
		String strWeight = Double.toString(this.weight);
		
		String str  = strWeight + this.address;
		
		return str;
	}

	public double getPrice() {
		
		double cost = this.weight * 4;
		
		return cost;
	}
	
	public void printInfo() {
		
		System.out.println("Weight: " + weight + " Price: " + getPrice());
	}
}
