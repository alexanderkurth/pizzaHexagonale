package main;

public class Main {

	   public static void main(String[] args) {
		RepositoryAdapter rA = new RepositoryAdapter();
		
		PizzaCalculator pC = new PizzaCalculator(rA);
		
		Adapter a = new Adapter(pC);
	}
	
}
