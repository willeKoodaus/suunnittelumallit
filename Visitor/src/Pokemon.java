
public class Pokemon {
	private PokemonState state;
	  private int xp = 0;
	private int bonusPoints;
	private String name;
	  
	  public Pokemon(String name) {
	    state = Charmander.getInstance();
	    this.name = name;
	  }
	  
	  public void teeTemppu() {
	    state.teeTemppu();
	    xp++;
	    if (xp == 3) {
	      state = Charmeleon.getInstance();
	    } else if (xp == 6) {
	      state = Charizard.getInstance();
	    }
	  }
	  
	 public void displayBonusPoints() {
		 System.out.println(this.name + " bonus points: "  + bonusPoints);
	 }
	  
	 public void addBonusPoints(int points) {
	        bonusPoints += points;
	    }

	    public void accept(BonusVisitor visitor) {
	        state.accept(this, visitor);
	    }
}
