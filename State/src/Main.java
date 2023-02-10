
public class Main {
	public static void main(String[] args) {
		  Pokemon pokemon = new Pokemon();
		  
		  for (int i = 0; i < 9; i++) {
		    System.out.println("Temppu " + (i + 1));
		    pokemon.doTrick();
		  }
		}
}
