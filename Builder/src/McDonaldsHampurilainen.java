
public class McDonaldsHampurilainen implements Hampurilainen {
    private StringBuilder osat = new StringBuilder();

    @Override
    public void lisaaOsat(Object osa) {
        osat.append(osa.getClass().getSimpleName()).append("\n");
    }

    @Override
    public void naytaOsat() {
        System.out.println(osat.toString());
    }
}
