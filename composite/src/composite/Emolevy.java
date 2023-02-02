package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa{
	private double hinta;
	private List<Laiteosa> komponentit;
    public Emolevy(double hinta){
        this.hinta = hinta;
        this.komponentit = new ArrayList<Laiteosa>();
    }

    public void lisaaKomponentti(Laiteosa komponentti){
        komponentit.add(komponentti);
    }

    public double getHinta(){
        for(Laiteosa l : komponentit){
            hinta += l.getHinta();
        }
        return hinta;
    }
}