
public class Charmander implements PokemonState {
	private Charmander() {}
	  private static Charmander instance = new Charmander();
	  public static Charmander getInstance() {
	    return instance;
	  }
	  
	public void teeTemppu() {
		System.out.println("Charmander hyppäsi!");
		
	}

}
