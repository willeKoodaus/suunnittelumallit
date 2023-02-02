package composite;

public class Main {
    public static void main(String[] args){
        Laiteosa kotelo = new Kotelo(100);
        Laiteosa emolevy = new Emolevy(100);
        Laiteosa gpu = new Gpu(500);
        Laiteosa prosessori = new Prosessori(250);
        Laiteosa muistipiiri = new Muistipiiri(200);
        Laiteosa verkkokortti = new Verkkokortti(50);
        Laiteosa virtalahde = new Virtalahde(150);
        emolevy.lisaaKomponentti(prosessori);
        emolevy.lisaaKomponentti(gpu);
        emolevy.lisaaKomponentti(muistipiiri);
        emolevy.lisaaKomponentti(verkkokortti);
        kotelo.lisaaKomponentti(emolevy);
        kotelo.lisaaKomponentti(virtalahde);
        System.out.println(kotelo.getHinta());
    }
}