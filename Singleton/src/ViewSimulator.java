
public class ViewSimulator {
	KayttajanHallinta kirjautunutKayttaja = KayttajanHallinta.getInstance();
	
	public void showView() {
	System.out.println("Sisäänkirjautunut käyttäjä on: " + kirjautunutKayttaja.getKirjautunutKayttaja().getNimi());
	}
}
