
public class Toimitusjohtaja extends Handler {
	
	public void handle(Double uusiPalkka) {
		if ((uusiPalkka-duunarinNykyinenPalkka)/duunarinNykyinenPalkka >= 0.05) {
			System.out.println("Toimitusjohtaja: Ei voida hyväksyä");
		} 
		else {
			super.handle(uusiPalkka);
		}
	}
}
