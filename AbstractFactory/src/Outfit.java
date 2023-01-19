
public class Outfit {
	private String tshirt;
	private String jeans;
	private String cap;
	private String shoes;
	
	public Outfit(String tshirt, String jeans, String cap, String shoes) {
		this.tshirt = tshirt;
		this.jeans = jeans;
		this.cap = cap;
		this.shoes = shoes;
	}

	@Override
	public String toString() {
		return "I am wearing " + this.tshirt + ", " + this.jeans + ", " + this.cap + " and " + this.shoes;
	}
}
