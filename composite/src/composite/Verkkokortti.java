package composite;

public class Verkkokortti implements Laiteosa {
    private double hinta;

    public Verkkokortti(double hinta){
        this.hinta = hinta;
    }

    public double getHinta(){
        return hinta;
    }

    public void lisaaKomponentti(Laiteosa komponentti){
        throw new RuntimeException("Cannot add component to " + this.getClass().getSimpleName());
    }
}