

public class KayttajanHallinta {
	private static  KayttajanHallinta INSTANCE = null;
	private Kayttaja kirjautunutKayttaja = null;
	
	private KayttajanHallinta() {
		this.kirjautunutKayttaja = new Kayttaja("oletus käyttäjä");
	}
	
	public static KayttajanHallinta getInstance()
    {
        if (INSTANCE == null)
        	INSTANCE = new KayttajanHallinta();
  
        return INSTANCE;
    }

	public Kayttaja getKirjautunutKayttaja() {
		return kirjautunutKayttaja;
	}

	public void setKirjautunutKayttaja(Kayttaja kirjautunutKayttaja) {
		this.kirjautunutKayttaja = kirjautunutKayttaja;
	}
}
