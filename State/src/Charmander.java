
public class Charmander implements PokemonState {
	private Charmander() {}
	  private static Charmander instance = new Charmander();
	  public static Charmander getInstance() {
	    return instance;
	  }
	  
	public void doTrick() {
		System.out.println("Charmander hyppäsi!");
		
	}

}
