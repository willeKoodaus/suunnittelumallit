import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 	Pokemon pokemon1 = new Pokemon("Pikachu1");
	        Pokemon pokemon2 = new Pokemon("Pikachu2");
	        pokemon2.teeTemppu();
	        pokemon2.teeTemppu();
	        pokemon2.teeTemppu(); // Evolve to Charmeleon
	        Pokemon pokemon3 = new Pokemon("Pikachu3");
	        pokemon3.teeTemppu();
	        pokemon3.teeTemppu();
	        pokemon3.teeTemppu();
	        pokemon3.teeTemppu();
	        pokemon3.teeTemppu();
	        pokemon3.teeTemppu();// Evolve to Charizard

	        List<Pokemon> pokemons = Arrays.asList(pokemon1, pokemon2, pokemon3);

	        BonusVisitor bonusVisitor = new BonusVisitor();

	       
	        for (Pokemon pokemon : pokemons) {
	            pokemon.accept(bonusVisitor);
	            pokemon.displayBonusPoints(); 
	        }
	}
}
