import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListContext context = new ListContext(new EveryItemLine());
        System.out.println(context.convertListToString());

        context.setConverter(new EverySecondItemLine());
        System.out.println(context.convertListToString());

        context.setConverter(new EveryThirdItemLine());
        System.out.println(context.convertListToString());
    }
}
