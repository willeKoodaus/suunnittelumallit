import java.util.Random;


class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private Object memento;
    private String pelaajaID;

    public Asiakas(Arvuuttaja arvuuttaja, String i) {
        this.arvuuttaja = arvuuttaja;
        this.pelaajaID = i;
    }

    public void run() {
        memento = arvuuttaja.liityPeliin(pelaajaID);

        int arvaus;
        do {
            arvaus = arvuutaLuku();
        } while (!arvuuttaja.tarkistaArvaus(memento, arvaus));
    }

    private int arvuutaLuku() {
        return new Random().nextInt(10) + 1;
    }
}
