import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Branch> branches = new ArrayList<Branch>();
		
		Branch b1 = new Branch("b1");
		Shipment s11 = new Shipment(10,"Thessaloniki");
		b1.addShipment(s11);
		Shipment s12 = new International(5, "London", "England");
		b1.addShipment(s12);
		branches.add(b1);
		
		Branch b2 = new Branch("b2");
		Shipment s21 = new Shipment(5,"Athens");
		b2.addShipment(s21);
		Shipment s22 = new International(2, "Berlin", "Germany");
		b2.addShipment(s22);
		branches.add(b2);
		
		Branch b3 = new Branch("b3");
		Shipment s31 = new Shipment(2,"Patra");
		b3.addShipment(s31);
		branches.add(b3);
		
		Branch b4 = new Branch("b4");
		Shipment s41 = new Shipment(15,"Serres");
		b4.addShipment(s41);
		Shipment s42 = new International(3, "New York", "USA");
		b4.addShipment(s42);
		branches.add(b4);
		
		new InputFrame(branches);
		
		

	}

}
