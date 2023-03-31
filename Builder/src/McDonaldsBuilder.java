
public class McDonaldsBuilder implements HampurilainenBuilder {
    private McDonaldsHampurilainen burger = new McDonaldsHampurilainen();

    @Override
    public void lisaaPihvi() {
        burger.lisaaOsat(new McDonaldsPihvi());
    }

    @Override
    public void lisaaSalaatti() {
        burger.lisaaOsat(new McDonaldsSalaatti());
    }

    @Override
    public McDonaldsHampurilainen getBurger() {
        return burger;
    }
}

