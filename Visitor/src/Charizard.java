
public class Charizard implements PokemonState{
	private int bonusPoints;
	 private Charizard() {}
	  private static Charizard instance = new Charizard();
	  public static Charizard getInstance() {
	    return instance;
	  }
	  
	  public void teeTemppu() {
	    System.out.println("Charizard veti maasta 350 kiloa !!");
	  }

	  public void accept(Pokemon pokemon, BonusVisitor visitor) {
	        visitor.visit(pokemon, this);
	    }
}

