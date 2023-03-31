
public class HesburgerBuilder implements HampurilainenBuilder {
    private HesburgerHampurilainen burger = new HesburgerHampurilainen();

    @Override
    public void lisaaPihvi() {
        burger.lisaaOsat(new HesburgerPihvi());
    }

    @Override
    public void lisaaSalaatti() {
        burger.lisaaOsat(new HesburgerSalaatti());
    }

    @Override
    public HesburgerHampurilainen getBurger() {
        return burger;
    }
}
