
public class Toimitusjohtaja extends Handler {
	
	public void handle(Double uusiPalkka) {
		if ((uusiPalkka-duunarinNykyinenPalkka)/duunarinNykyinenPalkka >= 0.05) {
			System.out.println("Toimitusjohtaja: Etko sina rahvas ymmarra, etta inflaatio pitaa saada alas niin ei voi korottaa palkkoja. \nJaetaan mielummin taas nama rahat ennatysbonuksina ja osinkoina. \nSanoin myos saunaillassa keskuspankin johtajalle, etta nostaa niita korkoja, etta varmasti tuntuu ostovoimassa. \nTuut painaa overia sitten yovuoroon jos tarviit lainanhoitoon ja ruokaan lisaa rahaa, opitpahan olemaan aiheuttamatta sita inflaatiota. \nJa turha yrittaa lakkoilla! Sanna oli kans saunomassa ja lupas, etta kaikki lakkoyritykset kielletaan taas lailla (@jauhojengi!)");
		} 
		else {
			super.handle(uusiPalkka);
		}
	}
}
