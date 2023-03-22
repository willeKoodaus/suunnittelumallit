
public interface PokemonState {

	public abstract void teeTemppu();
	public void accept(Pokemon pokemon, BonusVisitor visitor);

}
