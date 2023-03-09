
public class Lahiesimies extends Handler {
	
	public void handle(Double uusiPalkka) {
		if ((uusiPalkka-duunarinNykyinenPalkka)/duunarinNykyinenPalkka < 0.02) {
			System.out.println("Lahiesimies hyväksyy " + (uusiPalkka-duunarinNykyinenPalkka) + "euron palkankorotuksen.");
			duunarinNykyinenPalkka = uusiPalkka;
		} 
		else {
			super.handle(uusiPalkka);
		}
	}
}
