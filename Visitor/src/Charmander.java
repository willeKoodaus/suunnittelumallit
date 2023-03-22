
public class Charmander implements PokemonState {
	private int bonusPoints;
	private Charmander() {}
	  private static Charmander instance = new Charmander();
	  public static Charmander getInstance() {
	    return instance;
	  }
	  
	public void teeTemppu() {
		System.out.println("Charmander hyppäsi!");
		
	}

	 public void accept(Pokemon pokemon, BonusVisitor visitor) {
	        visitor.visit(pokemon, this);
	    }

}
