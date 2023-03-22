
public class BonusVisitor implements Visitor {

	@Override
	public void visit(Pokemon pokemon,Charizard state) {
		pokemon.addBonusPoints(30);
	}

	@Override
	public void visit(Pokemon pokemon,Charmander state) {
		pokemon.addBonusPoints(10);
		
	}

	@Override
	public void visit(Pokemon pokemon,Charmeleon state) {
		pokemon.addBonusPoints(20);
		
	}

	
}
