import java.util.ArrayList;

public class Branch {
	
	private String name;
	ArrayList<Shipment> shipments = new ArrayList<Shipment>();
	
	public Branch(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void addShipment(Shipment aS) {
		
		shipments.add(aS);
	}
	
	public double shipmentInfo() {
		
		double sum = 0;
		
		for(Shipment aS: shipments) {
			sum  = sum + aS.getPrice();
			
			aS.printInfo();
		}
		
		return sum;
	}

}
