import java.util.ArrayList;
import java.util.List;

public class HesburgerHampurilainen implements Hampurilainen {
    private List<Object> osat = new ArrayList<>();

    @Override
    public void lisaaOsat(Object osa) {
        osat.add(osa);
    }

    @Override
    public void naytaOsat() {
        for (Object osa : osat) {
            System.out.println(osa.getClass().getSimpleName());
        }
    }
}

