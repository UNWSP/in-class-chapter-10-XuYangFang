package ch10inclass;

public class Pizza {
		String description;
		double price;
		Pizza(String desc, double pr)
		{
			description = desc;
			price = pr;
		}
		
		public void display()
		{
			System.out.println(description + " pizza's pirce is " + price);
		}
	
	
	
	
}
