
public class AdidasClothingFactory implements ClothingAbstractFactory {

	@Override
	public Outfit makeNewOutfit() {
		return new Outfit("Adidas T-shirt", "Adidas jeans", "Adidas cap", "Adidas shoes");
	}
}
