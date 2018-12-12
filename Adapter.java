package main;

public class Adapter {

	private int nombrePersonne;
	private Pizza typePizza;
	private int i;
	
	private IPizzaCalculator pizzaCalculator;
	
	public Adapter(IPizzaCalculator pizzaCalculator) {
		this.pizzaCalculator = pizzaCalculator;
		
		this.typePizza = pizzaCalculator.pizzas[2];
		this.nombrePersonne = 6;
		
		System.out.println("nombre de personne : "+nombrePersonne + ", Type de pizza :" + typePizza.getType());
		
		int parts = this.pizzaCalculator.getPartsPizza(nombrePersonne, typePizza);
		System.out.println("Nombre de pizzas nécessaires : " + parts);
	}
}
