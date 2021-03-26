
public class International extends Shipment{
	
	private String country;
	
	public International(double weight, String address, String country) {
		super(weight,address);
		this.country = country;
	}
	
	public String toString() {
		
		super.toString();
		return country;
	}
	
	public double getPrice() {
		
		double cost = super.getPrice();
		
		cost = cost + cost * 0.5;
		
		return cost;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Country: " + country );
	}

}
