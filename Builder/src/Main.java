
public class Main {
	public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();

        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcdonaldsBuilder = new McDonaldsBuilder();

        director.setBuilder(hesburgerBuilder);
        director.constructBurger();
        HesburgerHampurilainen hesburgerBurger = hesburgerBuilder.getBurger();
        System.out.println("Hesburger hampurilaisen osat:");
        hesburgerBurger.naytaOsat();

        director.setBuilder(mcdonaldsBuilder);
        director.constructBurger();
        McDonaldsHampurilainen mcdonaldsBurger = mcdonaldsBuilder.getBurger();
        System.out.println("McDonalds hampurilaisen osat:");
        mcdonaldsBurger.naytaOsat();
    }
	
}
