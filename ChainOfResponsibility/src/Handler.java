
public abstract class Handler {
	private Handler successor;
	protected static double duunarinNykyinenPalkka = 2000;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
		}

	public void handle(Double uusiPalkka) {
		if (successor != null) {
			successor.handle(uusiPalkka);
		}
	}
}
