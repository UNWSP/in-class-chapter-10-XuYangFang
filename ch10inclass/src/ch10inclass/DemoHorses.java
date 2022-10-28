package ch10inclass;

public class DemoHorses {

	public static void main(String[] args) {
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		
		
		horse1.setname("A");
		horse1.setcolor("White");
		horse1.setbirth(2000);
		horse2.setname("B");
		horse2.setcolor("Balck");
		horse2.setbirth(2001);
		horse2.setracesTotal(20);
		
		System.out.println(horse1.getname() + " is " + horse1.getcolor() + " and birth year is " + horse1.getbirth());
		
		System.out.println(horse2.getname() + " is " + horse2.getcolor() + " and birth year is " + horse2.getbirth());
		
		System.out.println(horse2.getname() + " is " + horse2.getcolor() + " and birth year is " + horse2.getbirth() + " and total race is " + horse2.getracesTotal());
				
		
	

		

	}

}
