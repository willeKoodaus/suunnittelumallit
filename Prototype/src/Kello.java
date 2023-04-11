public class Kello implements Cloneable {
    private Viisari tunnit;
    private Viisari minuutit;
    private Viisari sekunnit;

    public Kello(int tunnit, int minuutit, int sekunnit) {
        this.tunnit = new Viisari(tunnit);
        this.minuutit = new Viisari(minuutit);
        this.sekunnit = new Viisari(sekunnit);
    }

    public void setAika(int tunnit, int minuutit, int sekunnit) {
        this.tunnit.setArvo(tunnit);
        this.minuutit.setArvo(minuutit);
        this.sekunnit.setArvo(sekunnit);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", tunnit.getArvo(), minuutit.getArvo(), sekunnit.getArvo());
    }

    // Matalakopiointi
    @Override
    protected Kello clone() throws CloneNotSupportedException {
        return (Kello) super.clone();
    }

    // Syväkopiointi
    protected Kello deepClone() throws CloneNotSupportedException {
        Kello klooni = (Kello) super.clone();
        klooni.tunnit = tunnit.clone();
        klooni.minuutit = minuutit.clone();
        klooni.sekunnit = sekunnit.clone();
        return klooni;
    }
}
