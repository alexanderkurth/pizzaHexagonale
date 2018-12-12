package main;

public class PizzaCalculator implements IPizzaCalculator{

	
	static int partsMoyenne = 6;
	IPizzaRepository pizzaRepository;

	public PizzaCalculator(IPizzaRepository pizzaRepository) {
		this.pizzaRepository = pizzaRepository;
	}

	@Override
	public int getPartsPizza(int nombrePersonne, Pizza pizza) {
		return (int)(nombrePersonne*pizza.getPartAvantSaciété()) / partsMoyenne;
	}
	
}
