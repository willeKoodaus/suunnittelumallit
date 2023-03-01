import java.util.List;

public class EveryThirdItemLine implements ListConverter {
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if ((i + 1) % 3 == 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
