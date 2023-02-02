
public class Main {

	public static void main(String[] args) {
		KayttajanHallinta kirjautunutKayttaja = KayttajanHallinta.getInstance();
		VaihdaKayttajaa vaihdaKayttaja = new VaihdaKayttajaa();
		ViewSimulator viewSimulator = new ViewSimulator();
		
		viewSimulator.showView();
		vaihdaKayttaja.vaihdaKayttajaa(new Kayttaja("John Doe"));
		viewSimulator.showView();
		
		//Koska kayttajanhallinta on singletonin takia globaali ja näkyy kaikille, 
		//niin minkään luokan ei tarvitse tietää, kommunikoida tai välittää dataa käyttäjästä toistensa välillä
		//vaan he saavat kyseisen datan suoraan ja luotettavasti kirjautuneen kayttajan singleton instanssista.
	
	}

}
