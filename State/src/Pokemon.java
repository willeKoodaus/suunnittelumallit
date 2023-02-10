
public class Pokemon {
	private PokemonState state;
	  private int temppuLaskuri = 0;
	  
	  public Pokemon() {
	    state = Charmander.getInstance();
	  }
	  
	  public void teeTemppu() {
	    state.teeTemppu();
	    temppuLaskuri++;
	    if (temppuLaskuri == 3) {
	      state = Charmeleon.getInstance();
	    } else if (temppuLaskuri == 6) {
	      state = Charizard.getInstance();
	    }
	  }
}
