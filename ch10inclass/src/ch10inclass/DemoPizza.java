package ch10inclass;

public class DemoPizza {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(" Good ", 10);
		Pizza p2 = new Pizza(" Nice ", 20);
		DeliveryPizza p3 = new DeliveryPizza("perfect", 20, "3003 Snelling");
		DeliveryPizza p4 = new DeliveryPizza("LALA", 7, "3004 Snelling");
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
	}

}
