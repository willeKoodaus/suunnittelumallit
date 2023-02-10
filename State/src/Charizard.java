
public class Charizard implements PokemonState{
	 private Charizard() {}
	  private static Charizard instance = new Charizard();
	  public static Charizard getInstance() {
	    return instance;
	  }
	  
	  public void doTrick() {
	    System.out.println("Charizard veti maasta 350 kiloa !!");
	  }
	}

