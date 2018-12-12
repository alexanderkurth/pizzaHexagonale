package main;

public class calculPartsPizzaNecessaire {

	static int partsMoyenne = 6;
	
	
	public static int getPartsPizza(int nombrePersonne, int pizza) {
		return (int)(nombrePersonne*pizza) / partsMoyenne;
	}
	
	public static void main(String[] args) {
		System.out.println(getPartsPizza(6,3));
	}
	
}
