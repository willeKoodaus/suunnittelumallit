
 public class Main{
	 public static void main(String[] args) {
	 	final int ASIAKKAIDEN_LUKUMAARA = 5;
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Thread[] asiakkaat = new Thread[ASIAKKAIDEN_LUKUMAARA];

        for (int i = 0; i < asiakkaat.length; i++) {
            asiakkaat[i] = new Thread(new Asiakas(arvuuttaja, Integer.toString(i+1)));
            asiakkaat[i].start();
        }
    }
}
