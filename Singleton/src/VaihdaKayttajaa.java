
public class VaihdaKayttajaa {
	KayttajanHallinta kirjautunutKayttaja = KayttajanHallinta.getInstance();
	public void vaihdaKayttajaa(Kayttaja kayttaja) {
		kirjautunutKayttaja.setKirjautunutKayttaja(kayttaja);
	}
}
