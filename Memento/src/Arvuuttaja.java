import java.util.Random;

class Arvuuttaja {
	private final Random random = new Random();

	private class Memento {
        private final int arvottuLuku;
        private String kenenLuku;

        public Memento(int arvottuLuku, String i) {
            this.arvottuLuku = arvottuLuku;
            this.kenenLuku = i;
        }

        public int getArvottuLuku() {
            return arvottuLuku;
        }
        public String getKenenLuku() {
        	return kenenLuku;
        }
    }

    public Object liityPeliin(String i) {
        int oikeaLuku = random.nextInt(10) + 1;
        return new Memento(oikeaLuku,i);
    }

    public boolean tarkistaArvaus(Object memento, int arvaus) {
        Memento pelinTila = (Memento) memento;
        int arvottuLuku = pelinTila.getArvottuLuku();
        if (arvaus < arvottuLuku) {
        	System.out.println("Pelaaja " + pelinTila.getKenenLuku() + ". arvasi: " + arvaus);
            System.out.println("Oikea luku on suurempi.");
            return false;
        } else if (arvaus > arvottuLuku) {
        	System.out.println("Pelaaja " + pelinTila.getKenenLuku() + ". arvasi: " + arvaus);
            System.out.println("Oikea luku on pienempi.");
            return false;
        } else {
        	System.out.println("Pelaaja " + pelinTila.getKenenLuku() + ". arvasi: " + arvaus);
            System.out.println("Onneksi olkoon, arvasit oikein!");
            return true;
        }
    }
}