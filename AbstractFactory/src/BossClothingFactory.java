
public class BossClothingFactory implements ClothingAbstractFactory {

	@Override
	public Outfit makeNewOutfit() {
		return new Outfit("Boss T-shirt", "Boss jeans", "Boss cap", "Boss shoes");
	}
}
