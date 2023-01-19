
public class Jasper {
	private ClothingAbstractFactory factory;
	private Outfit outfit;
	
	public Jasper(ClothingAbstractFactory factory) {
		this.factory = factory;
		this.outfit = factory.makeNewOutfit();
	}
	
	public void tellWhatIamWearing() {
		System.out.println(outfit.toString());
	}
}
