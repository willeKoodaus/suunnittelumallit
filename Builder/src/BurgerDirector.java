
public class BurgerDirector {
    private HampurilainenBuilder builder;

    public void setBuilder(HampurilainenBuilder builder) {
        this.builder = builder;
    }

    public void constructBurger() {
        builder.lisaaPihvi();
        builder.lisaaSalaatti();
    }
}
