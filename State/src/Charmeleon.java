
public class Charmeleon implements PokemonState{

	private Charmeleon() {}
	  private static Charmeleon instance = new Charmeleon();
	  public static Charmeleon getInstance() {
	    return instance;
	  }
	  public void teeTemppu() {
	    System.out.println("Charmeleon nosti 100 kiloa penkistä!");
	  }

}
