
public class YksikonPaallikko extends Handler {
	
	public void handle(Double uusiPalkka) {
		if ((uusiPalkka-duunarinNykyinenPalkka)/duunarinNykyinenPalkka < 0.05) {
			System.out.println("Yksikön päällikkö hyväksyy " + (uusiPalkka-duunarinNykyinenPalkka) + "euron palkankorotuksen.");
			duunarinNykyinenPalkka = uusiPalkka;
		} 
		else {
			super.handle(uusiPalkka);
		}
	}
}
