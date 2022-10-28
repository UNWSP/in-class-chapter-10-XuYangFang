package ch10inclass;

public class DeliveryPizza extends Pizza {
	
	String address;
	double deiveryFee;
	
	
	DeliveryPizza(String desc, double pr, String address) {
		super(desc, pr);
		this.address = address;
		
		
		if (pr > 15)
			deiveryFee = 3;
		else
			deiveryFee = 5;
		
	
		
	}
	
	public void display()
	{
		System.out.println(description + " pizza to " + address + ", fee is " + deiveryFee);
	}
	
	

}
